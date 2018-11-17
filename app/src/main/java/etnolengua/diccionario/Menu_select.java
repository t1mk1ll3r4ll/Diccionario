package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.HeadApp.ARTry.UnityPlayerActivity;



public class Menu_select extends AppCompatActivity {

    Button btnRA, btnDic, btnTrad, opciones;
    private static final int TIME_LIMIT = 1500;
    private static long backPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_select);
        btnRA=findViewById(R.id.ButRA);
        btnDic=findViewById(R.id.ButDic);
        btnTrad=findViewById(R.id.ButTrad);
        opciones=findViewById(R.id.Boton_Opciones);

        btnRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.HeadApp.ARTry.UnityPlayerActivity");
                //startActivity( launchIntent );
                //Intent intent = new Intent(Menu_select.this, TresDeView.class);
                //startActivity(intent);
                Toast.makeText(getApplicationContext(),"No presione el botón de regreso hasta que la aplicación cargue completamente",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Menu_select.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });
        btnDic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Menu_select.this,SeleccionDiccionario.class);
                startActivity(intent2);
            }
        });
        btnTrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Menu_select.this,Traductor.class);
                startActivity(intent);
            }
        });
        opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Menu_select.this, UserOptions.class);
                startActivity(intent);

            }
        });
    }
    public void onBackPressed() {
        if(TIME_LIMIT+backPressed>System.currentTimeMillis()){
            super.onBackPressed();
        }
        else{
            Toast.makeText(getApplicationContext(),"Presiona de nuevo para salir",Toast.LENGTH_LONG).show();
        }
        backPressed=System.currentTimeMillis();
    }
}
