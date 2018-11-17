package etnolengua.diccionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

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
        Intent intentc=new Intent (SeleccionDiccionario.this, ListViewC.class);
        startActivity(intentc);
    }
    public void d(View view){
        Intent intentd=new Intent (SeleccionDiccionario.this, ListViewD.class);
        startActivity(intentd);
    }
    public void e(View view){
        Intent intente=new Intent (SeleccionDiccionario.this, ListViewE.class);
        startActivity(intente);
    }
    public void FG(View view){
        Intent intentf=new Intent (SeleccionDiccionario.this, ListViewF.class);
        startActivity(intentf);
    }
    public void HI(View view){
        Intent intentg=new Intent (SeleccionDiccionario.this, ListViewHI.class);
        startActivity(intentg);
    }
    public void JL(View view){
        Intent intentH=new Intent (getApplicationContext(),ListViewJL.class);
        startActivity(intentH);
    }
    public void MN(View view){
        Intent intentMN = new Intent(getApplicationContext(), ListViewMN.class);
        startActivity(intentMN);
    }
    public void OP(View view){
        Intent intentOP = new Intent(getApplicationContext(), ListViewOP.class);
        startActivity(intentOP);
    }
    public void QR(View view){
        Intent intentQR = new Intent(getApplicationContext(), ListViewQR.class);
        startActivity(intentQR);
    }
    public void S(View view){
        Intent intentS = new Intent(getApplicationContext(), ListViewS.class);
        startActivity(intentS);
    }
    public void T(View view){
        Intent intentT = new Intent(getApplicationContext(), ListViewT.class);
        startActivity(intentT);
    }
    public void UV(View view){
        Intent intentUV = new Intent(getApplicationContext(), ListViewUV.class);
        startActivity(intentUV);
    }
    public void YZ(View view){
        Intent intentYZ= new Intent(getApplicationContext(), ListViewYZ.class);
        startActivity(intentYZ);
    }


}
