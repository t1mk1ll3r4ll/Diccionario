package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeleccionDiccionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seleccion_diccionario);
    }
    public void a(View view){
        Intent intenta=new Intent (SeleccionDiccionario.this,MainActivity.class);
        startActivity(intenta);
    }
    public void b(View view){
        Intent intentb=new Intent (SeleccionDiccionario.this, ListViewB.class);
        startActivity(intentb);
    }
    public void c(View view){
        Intent intentc=new Intent (SeleccionDiccionario.this, ListViewB.class);
        startActivity(intentc);
    }
    public void d(View view){
        Intent intentd=new Intent (SeleccionDiccionario.this, ListViewB.class);
        startActivity(intentd);
    }
    public void e(View view){
        Intent intente=new Intent (SeleccionDiccionario.this, ListViewB.class);
        startActivity(intente);
    }
    public void f(View view){
        Intent intentf=new Intent (SeleccionDiccionario.this, ListViewB.class);
        startActivity(intentf);
    }
    public void g(View view){
        Intent intentg=new Intent (SeleccionDiccionario.this, ListViewB.class);
        startActivity(intentg);
    }


}
