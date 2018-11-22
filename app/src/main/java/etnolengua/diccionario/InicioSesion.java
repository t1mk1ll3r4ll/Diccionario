package etnolengua.diccionario;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.ProviderQueryResult;

public class InicioSesion extends AppCompatActivity {
    EditText tvEmail;
    EditText tvContra;
    ProgressBar barra;
    ImageView hidepass, viewpass;
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
        barra=findViewById(R.id.progressBar3);
        barra.setVisibility(View.INVISIBLE);
        hidepass =findViewById(R.id.HidePassIS);
        viewpass=findViewById(R.id.ViewPassIS);
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
        viewpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvContra.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                viewpass.setVisibility(View.INVISIBLE);
                hidepass.setVisibility(View.VISIBLE);
                tvContra.setSelection(tvContra.length());
            }
        });
        hidepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvContra.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                viewpass.setVisibility(View.VISIBLE);
                hidepass.setVisibility(View.INVISIBLE);
                tvContra.setSelection(tvContra.length());

            }
        });
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barra.setVisibility(View.VISIBLE);
                iniciar.setVisibility(View.INVISIBLE);
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
            if(email.isEmpty())
            {
                tvEmail.setError("ingresa tu correo en el espacio de arriba");

            }else if (!email.contains("@")){
                tvEmail.setError("el correo debe contener @");
            }else{
            mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    Toast.makeText(getApplicationContext(), "Se ha enviado en correo de recuperacion de contraseña", Toast.LENGTH_LONG).show();
                }
            });}


        } catch (Exception nullPointerException) {
            Toast.makeText(getApplicationContext(), "ha ocurrido un error, lo sentimos", Toast.LENGTH_LONG).show();

        }
    }
    public void ingresar(){
        String email = tvEmail.getText().toString();
        String contra = tvContra.getText().toString();
        if(!email.contains("@") && !email.isEmpty()){
            tvEmail.setError("Correo no valido, recuerda que necesita un '@' ");
            barra.setVisibility(View.INVISIBLE);
            iniciar.setVisibility(View.VISIBLE);
        }else if (!email.isEmpty() && !contra.isEmpty() && email.contains("@")) {
            mAuth.signInWithEmailAndPassword(email, contra).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        if(mAuth.getCurrentUser().isEmailVerified()) {
                            barra.setVisibility(View.INVISIBLE);
                            Intent intent = new Intent(InicioSesion.this, Menu_select.class);
                            startActivity(intent);
                            finish();
                        }
                        else {
                            Intent intent = new Intent(InicioSesion.this, Verificacion.class);
                            startActivity(intent);
                            finish();

                        }
                    } else {
                       mAuth.fetchProvidersForEmail(tvEmail.getText().toString()).addOnCompleteListener(new OnCompleteListener<ProviderQueryResult>() {
                            @Override
                            public void onComplete(@NonNull Task<ProviderQueryResult> task) {
                                if(task.isSuccessful()) {
                                    iniciar.setVisibility(View.VISIBLE);
                                    barra.setVisibility(View.INVISIBLE);
                                    tvContra.setError("Contaseña incorrecta");

                                }
                                else {
                                    iniciar.setVisibility(View.VISIBLE);
                                    barra.setVisibility(View.INVISIBLE);
                                    tvContra.setError("Contraseña incorrecta");
                                    tvEmail.setError("Correo Incorrecto");
                                }
                            }

                        });
                    }
                }
            });
        }else if (email.isEmpty()){
            tvEmail.setError("Ingrese su correo");
            iniciar.setVisibility(View.VISIBLE);
            barra.setVisibility(View.INVISIBLE);
        }else if(contra.isEmpty()){
            tvContra.setError("ingrese su contraseña");
            iniciar.setVisibility(View.VISIBLE);
            barra.setVisibility(View.INVISIBLE);
        }else if (!email.contains("@")){
            tvEmail.setError("Recuerda, el correo debe llevar un '@'");
            iniciar.setVisibility(View.VISIBLE);
            barra.setVisibility(View.INVISIBLE);
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