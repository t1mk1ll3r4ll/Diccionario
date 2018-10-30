package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class UserOptions extends AppCompatActivity {
    Button CerrarSesion, CambioContra;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_options);
        CerrarSesion=findViewById(R.id.ButCierraSesion);
        CambioContra=findViewById(R.id.ButCamContra);
        mAuth=FirebaseAuth.getInstance();
        CerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent intent = new Intent(UserOptions.this, Bienvenida.class);
                startActivity(intent);
                finish();
            }
        });
        CambioContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserOptions.this, cambioContra.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
