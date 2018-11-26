package etnolengua.diccionario;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewYZ extends AppCompatActivity {
    ListView lst;
    String espYZ[]={"ya", "yerba mora", "yerno", "yo", "yuca", "zacate", "zacate", "zanate (ave)", "zancudo", "zorrillo", "zurdo/a"};
    String mixeYZ[]={"tëë", "mujtyaay", "më'ët", "ëëtsy", "kupixy", "mëëy", "nektsy", "piijx", "pëëx", "paats", "ana'jty"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_yz);
        lst = findViewById(R.id.listviewYZ);
        final CustomListview CustomLV = new CustomListview(this, espYZ, mixeYZ);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espYZ[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espYZ[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
    }
}