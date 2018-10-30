package etnolengua.diccionario;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Verificacion extends AppCompatActivity {
    TextView CorreoTv;
    FirebaseAuth mAuth;
    FirebaseUser usr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion);
        CorreoTv = findViewById(R.id.CorreoTV);
        mAuth=FirebaseAuth.getInstance();
        usr=mAuth.getCurrentUser();
        try {
            if (usr.getEmail() != null && !mAuth.getCurrentUser().isEmailVerified()) {
                CorreoTv.setText(usr.getEmail());
                verificacion();
            }
        }
        catch(Exception  NullPointerException) {
            Toast.makeText(getApplicationContext(),"se activo esta wea",Toast.LENGTH_SHORT).show();
        }

    }
    public void verificacion(){
            final FirebaseUser user = mAuth.getCurrentUser();
            try {

                user.sendEmailVerification().addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Verificacion.this,"Correo de verificacion enviado a: " + user.getEmail(),Toast.LENGTH_SHORT).show();
                            Toast.makeText(getApplicationContext(),"Por favor, ingresa de nuevo",Toast.LENGTH_LONG).show();
                            if(user.isEmailVerified()){
                            onBackPressed();}
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    "Se produjo un error, intenta mas tarde",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
            catch (NullPointerException exception){
                Toast.makeText(this, "Se produjo un error", Toast.LENGTH_SHORT).show();
            }

    }
}
