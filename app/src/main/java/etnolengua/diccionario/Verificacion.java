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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion);
        CorreoTv = findViewById(R.id.CorreoTV);
        mAuth=FirebaseAuth.getInstance();
        FirebaseUser usr=mAuth.getCurrentUser();
        try {
            if (usr.getEmail() != null) {
                CorreoTv.setText(usr.getEmail());
                verificacion();
            }
        }
        catch(Exception  NullPointerException) {
            Toast.makeText(getApplicationContext(),"se activo esta wea",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        FirebaseUser user = mAuth.getCurrentUser();
        try {
            if (user.isEmailVerified()) {
                Intent intent = new Intent(Verificacion.this, Menu_select.class);
                startActivity(intent);
                finish();
            }
        }catch(Exception nullPointerException){
            Toast.makeText(getApplicationContext(),"la cuenta "+user.getEmail()+" Aun no esta verificada",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        try {
            if (user.isEmailVerified()) {
                Intent intent = new Intent(Verificacion.this, Menu_select.class);
                startActivity(intent);
                finish();
            }
        }catch(Exception nullPointerException){
            Toast.makeText(getApplicationContext(),"la cuenta "+user.getEmail()+" Aun no esta verificada",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        FirebaseUser user = mAuth.getCurrentUser();
        try {
            if (user.isEmailVerified()) {
                Intent intent = new Intent(Verificacion.this, Menu_select.class);
                startActivity(intent);
                finish();
            }
        }catch(Exception nullPointerException){
            Toast.makeText(getApplicationContext(),"la cuenta "+user.getEmail()+" Aun no esta verificada",Toast.LENGTH_LONG).show();
        }
    }

    public void verificacion(){
            final FirebaseUser user = mAuth.getCurrentUser();
            try {

                user.sendEmailVerification().addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Verificacion.this,
                                    "Correo de verificacion enviado a: " + user.getEmail(),
                                    Toast.LENGTH_SHORT).show();
                            if (user.isEmailVerified()){
                            Intent intent = new Intent(getApplicationContext(),Menu_select.class);
                            startActivity(intent);}

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
