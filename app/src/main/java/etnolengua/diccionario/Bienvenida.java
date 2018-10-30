package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenida extends AppCompatActivity {

    Button btnregistrar, btniniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        btniniciar=findViewById(R.id.iniciabut);
        btnregistrar=findViewById(R.id.RegistroBut);

        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Bienvenida.this, InicioSesion.class);
                startActivity(intent);
                finish();
            }
        });

        btnregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (Bienvenida.this, Registro.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}
