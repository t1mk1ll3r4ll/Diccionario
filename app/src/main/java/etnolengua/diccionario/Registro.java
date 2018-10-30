package etnolengua.diccionario;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {
    EditText CorreoReg;
    EditText ContraReg;
    Button RegBut;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        CorreoReg=findViewById(R.id.CorreoRegistro);
        ContraReg=findViewById(R.id.ContraRegistro);
        RegBut=findViewById(R.id.RegButton);
        mAuth=FirebaseAuth.getInstance();
        RegBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrar();
            }
        });
    }
    public void Registrar(){
        final String email = CorreoReg.getText().toString();
        final String pass = ContraReg.getText().toString();
        if(email.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un correo", Toast.LENGTH_LONG).show();
            return;
        }
        if(pass.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese una contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Registro.this, "Registro completado", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent (Registro.this, InicioSesion.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(Registro.this, "Error en el registro, intente mas tarde \n ó intenta iniciar sesion", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
