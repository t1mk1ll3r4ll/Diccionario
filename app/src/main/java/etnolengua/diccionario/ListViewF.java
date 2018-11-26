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

public class ListViewF extends AppCompatActivity {
    ListView lst;
    String espF[] = {"fabricado", "falda", "falta poco", "favor", "filoso", "flojo", "flor", "fresco", "frío", "fuego", "fuerza", "gallina", "gancho", "gavilán", "gemelo", "gente", "gente borracha", "gente buena", "golpear con el puño", "gordo", "grande", "granizo", "grano", "granos en la boca", "grasa", "grillo", "grita", "grueso", "guajolote", "guapino (árbol)", "guardado", "guardalo", "guayaba"};
    String mixeF[] = {"kojy", "ëxuk", "jaween", "mayajt", "jëjp", "nuux", "pëjy", "nik", "tëtsy", "jëën", "majaa", "tseey", "jo'k", "kuwaj", "axeeny", "ja'ay", "amukiëjaay", "oyjaay", "tex", "nik'xe", "mëj", "tëtstuu", "puuts", "apuuts", "on", "tsiktsy", "ayaaxp", "mapxy", "tuut", "akpejy", "pekeiky", "pëkë'ëk", "pox"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_f);
        lst = findViewById(R.id.listviewF);
        final CustomListview CustomLV = new CustomListview(this, espF, mixeF);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espF[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espF[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
        lst.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",mixeF[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+mixeF[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),mixeesp.class);
                startActivity(intent);
                return false;
            }
        });
    }
}