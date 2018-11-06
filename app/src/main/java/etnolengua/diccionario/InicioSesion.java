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
import com.google.firebase.auth.FirebaseUser;

public class InicioSesion extends AppCompatActivity {
    EditText tvEmail;
    EditText tvContra;
    Button iniciar,recupera, crea;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener Listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        tvEmail = findViewById(R.id.correo);
        tvContra = findViewById(R.id.contra);
        iniciar = findViewById(R.id.IniciarFormBut);
        recupera = findViewById(R.id.reccon);
        crea= findViewById(R.id.creaCuentaInicioSesion);
        mAuth = FirebaseAuth.getInstance();
        Listener= new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user= mAuth.getCurrentUser();
                if(user == null) {
                    //not logged in
                }
                else{
                    //logged in
                }
            }
        };

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar();
            }
        });
        recupera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recuperarcontra();
            }
        });
        crea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (InicioSesion.this, Registro.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void recuperarcontra() {
        try {
            String email = tvEmail.getText().toString();
            mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    Toast.makeText(getApplicationContext(), "Se ha enviado en correo de recuperacion de contraseña", Toast.LENGTH_LONG).show();
                }
            });


        } catch (Exception nullPointerException) {
            Toast.makeText(getApplicationContext(), "ingresa tu correo en el espacio de arriba", Toast.LENGTH_LONG).show();
        }
    }
    public void ingresar(){
        String email = tvEmail.getText().toString();
        String contra = tvContra.getText().toString();
        if (!email.isEmpty() && !contra.isEmpty()) {
            mAuth.signInWithEmailAndPassword(email, contra).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        if(mAuth.getCurrentUser().isEmailVerified()) {
                            Toast.makeText(getApplicationContext(), "Inicio correcto", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(InicioSesion.this, Menu_select.class);
                            startActivity(intent);
                            finish();
                        }
                        else {
                            Intent intent = new Intent(InicioSesion.this, Verificacion.class);
                            startActivity(intent);

                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Correo o contraseña incorrectos \n\t\t\t\t\t verifique datos", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(Listener);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent (getApplicationContext(),Bienvenida.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(Listener != null){
            mAuth.removeAuthStateListener(Listener);
        }
    }
}