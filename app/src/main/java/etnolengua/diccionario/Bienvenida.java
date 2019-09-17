//Inicio de las 10 primeras paginas
package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bienvenida extends AppCompatActivity {
    Button btnregistrar, btniniciar;
    private static final int TIME_LIMIT = 1500;
    private static long backPressed;
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
    public void onBackPressed() {
        if(TIME_LIMIT+backPressed>System.currentTimeMillis()){
            super.onBackPressed();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(),"Presiona de nuevo para salir",Toast.LENGTH_LONG).show();
        }
        backPressed=System.currentTimeMillis();
    }
}
