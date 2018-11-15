package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class UserOptions extends AppCompatActivity {
    Button CerrarSesion, CambioContra;
    FirebaseAuth mAuth;
    TextView tvhola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_options);
        CerrarSesion=findViewById(R.id.ButCierraSesion);
        CambioContra=findViewById(R.id.ButCamContra);
        tvhola=findViewById(R.id.textView16);
        mAuth=FirebaseAuth.getInstance();
        try{
        tvhola.setText("hola "+mAuth.getCurrentUser().getEmail());}
        catch(NullPointerException exception) {
            Toast.makeText(getApplicationContext(),"A ocurrido un error, lo sentimos", Toast.LENGTH_LONG).show();
        }
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), Menu_select.class);
        startActivity(intent);
        finish();
    }
}
