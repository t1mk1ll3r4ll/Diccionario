package etnolengua.diccionario;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class cambioContra extends AppCompatActivity {

    Button cambiarContrasena;
    EditText oldpass,newpass,newpassC;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_contra);
        oldpass=findViewById(R.id.oldpassword);
        newpass=findViewById(R.id.camcon1);
        newpassC=findViewById(R.id.camcon2);
        cambiarContrasena=findViewById(R.id.butcamcon);
        mAuth=FirebaseAuth.getInstance();

        cambiarContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambio();
            }
        });
    }
    public void cambio(){
        String antigua=oldpass.getText().toString();
        final String nueva=newpass.getText().toString();
        final String nuevaC= newpassC.getText().toString();
        String Email=mAuth.getCurrentUser().getEmail();
        if(nueva.equals(nuevaC)) {
            mAuth.signInWithEmailAndPassword(Email,antigua).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    mAuth.getCurrentUser().updatePassword(nueva);
                    Intent intent = new Intent (cambioContra.this,Bienvenida.class);
                    startActivity(intent);
                    finish();
                }
            });

        }
    }
}
