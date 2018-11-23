package etnolengua.diccionario;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class cambioContra extends AppCompatActivity {

    Button cambiarContrasena;
    EditText oldpass,newpass,newpassC;
    FirebaseAuth mAuth;
    ImageView oldVer,oldOcul, newVer, newOcul, newCVer, newCOcul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_contra);
        oldpass=findViewById(R.id.oldpassword);
        newpass=findViewById(R.id.camcon1);
        newpassC=findViewById(R.id.camcon2);
        cambiarContrasena=findViewById(R.id.butcamcon);
        mAuth=FirebaseAuth.getInstance();

        oldVer= findViewById(R.id.AntiguaMostrar);
        oldOcul=findViewById(R.id.AntiguaOcultar);

        //----
        newVer= findViewById(R.id.NuevaMostrar);
        newOcul=findViewById(R.id.NuevaOcultar);
        //----
        newCVer= findViewById(R.id.NuevaCMostrar);
        newCOcul=findViewById(R.id.NuevaCOcultar);
        //---
        oldOcul.setVisibility(View.INVISIBLE);
        newOcul.setVisibility(View.INVISIBLE);
        newCOcul.setVisibility(View.INVISIBLE);


        oldVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldpass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                oldVer.setVisibility(View.INVISIBLE);
                oldOcul.setVisibility(View.VISIBLE);
                oldpass.setSelection(oldpass.length());
            }
        });
        oldOcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                oldVer.setVisibility(View.VISIBLE);
                oldOcul.setVisibility(View.INVISIBLE);
                oldpass.setSelection(oldpass.length());
            }
        });
        //------------------------------------------------------------------------------------------
        newVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newpass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                newVer.setVisibility(View.INVISIBLE);
                newOcul.setVisibility(View.VISIBLE);
                newpass.setSelection(newpass.length());
            }
        });
        newOcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                newVer.setVisibility(View.VISIBLE);
                newOcul.setVisibility(View.INVISIBLE);
                newpass.setSelection(newpass.length());
            }
        });
        //------------------------------------------------------------------------------------------
        newCVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newpassC.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                newCVer.setVisibility(View.INVISIBLE);
                newCOcul.setVisibility(View.VISIBLE);
                newpassC.setSelection(newpassC.length());
            }
        });
        newCOcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newpassC.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                newCVer.setVisibility(View.VISIBLE);
                newCOcul.setVisibility(View.INVISIBLE);
                newpassC.setSelection(newpassC.length());
            }
        });

        cambiarContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oldpass.getText().toString().isEmpty()){
                    oldpass.setError("Ingrese su antigua contraseña");
                }else if(newpass.getText().toString().isEmpty()) {
                    newpass.setError("Ingrese su nueva contraseña");
                }else if (newpassC.getText().toString().isEmpty()){
                    newpassC.setError("Ingrese de nuevo su nueva contraseña");
                }else if(newpass.getText().toString().length()<6) {
                    newpass.setError("La contraseña debe ser mayor a 6 caracteres");
                }else if(!oldpass.getText().toString().isEmpty()|| !newpass.getText().toString().isEmpty()|| !newpassC.toString().isEmpty() && newpass.getText().toString().equals(newpassC.getText().toString())){
                cambio();
                }
                }

        });
    }
    
    public void cambio(){
        String antigua=oldpass.getText().toString();
        final String nueva=newpass.getText().toString();
        final String nuevaC= newpassC.getText().toString();
        final String Email=mAuth.getCurrentUser().getEmail();

        if(!nueva.isEmpty()&& nuevaC.isEmpty()){
            newpassC.setError("Ingrese de nuevo su contraseña");
        }else if(!nueva.equals(nuevaC)){
            newpass.setError("las contraseñas no son iguales");
            newpassC.setError("las contraseñas no son iguales");
        }

        if(nueva.equals(nuevaC) && !nueva.isEmpty()) {
            try {
                mAuth.signInWithEmailAndPassword(Email, antigua).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        mAuth.getCurrentUser().updatePassword(nueva).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "La contraseña se ha cambiado correctamente", Toast.LENGTH_LONG).show();
                                    mAuth.signOut();
                                    Intent intent = new Intent(cambioContra.this, Bienvenida.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    oldpass.setError("La contraseña no es correcta, intenta de nuevo");
                                }
                            }
                        });
                    }
                });

            }catch(NullPointerException e) {
                Toast.makeText(getApplicationContext(),"oh oh... A ocurrido un error. lo sentimos",Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),UserOptions.class);
        startActivity(intent);
        finish();
    }
}
