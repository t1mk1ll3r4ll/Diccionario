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

public class ListViewB extends AppCompatActivity {
    ListView lst;
    String espB[]={"babea", "baila", "bailando", "bailar", "baja", "banco", "bañando", "báñate", "barato", "barato", "barba canosa", "barriendo", "barriga", "barrigon", "barro", "bastante", "bastante", "bastón", "baúl", "bebé", "criatura", "infante", "bejuco", "bendecido", "bestia", "blanco", "boa", "venado", "boca", "boca", "boca gorda", "boca roja", "boca sucia", "bonita", "bordado", "borracho", "borracha", "bravo", "brazo fuerte", "brinca", "burlado", "buscalo", "buscarlo"};
    String mixeB[]={"awaay", "ets", "ejtsp", "ajtsp", "mënak", "konyt", "tsiip", "tsiiw", "kuka'ay", "kumënaik", "apoo", "peetp", "mox", "moxtsaam", "puj", "amay", "may", "tajk", "kaax", "maxuunk", "maxuunk", "maxuunk", "aats", "kunuukx", "jëyujk", "poop", "jatsyu'u", "jatsyu'u", "aaw", "awak", "atsaam", "atsap'ts", "akootsy", "tsuj", "pëjxuy", "amuukyë", "amuukyë", "awa'an", "tsinuuk", "tëpx", "nixiiki", "ixta'w", "axtaaw"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_b);
        lst =findViewById(R.id.listviewB);
        final CustomListview CustomLV = new CustomListview(this,espB,mixeB);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm;
                cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espB[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espB[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
        lst.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",mixeB[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+mixeB[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),mixeesp.class);
                startActivity(intent);
                return false;
            }
        });
    }
}
