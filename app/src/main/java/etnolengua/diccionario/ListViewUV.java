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

public class ListViewUV extends AppCompatActivity {
    ListView lst;
    String espUV[]={"un día", "un peso", "uno", "uno por uno", "uña", "usado", "ustedes", "utensilio de cocina", "uva", "vamonos", "varón", "varón", "ve", "vea lo", "veinte", "ven", "vena", "venado", "vendedor", "véndelo", "verdad", "verdad", "verde", "vergüenza", "vete", "veté", "viejo", "viene", "viento", "viñuela", "violentamente", "violín", "vivo", "vomito", "vuelve a subir"};
    String mixeUV[]={"tuk'xëë", "peexy", "tu'uk", "atu'ukaty", "këxooky", "pak", "miitsy ajkx", "pok", "tsaatypy", "jam", "jexy", "mixy", "ijxp", "ix", "ipx", "min", "eemy", "naan", "tokpë", "took", "tëmts", "teyajt", "pu'ts", "tsotiuun", "nëkx", "ataak", "amëj", "mimp", "poj", "mëxampuuts", "atsipamaat", "jëtk", "juiky", "ëëtsy", "jakpet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_uv);
        lst = findViewById(R.id.listviewUV);
        final CustomListview CustomLV = new CustomListview(this, espUV, mixeUV);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espUV[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espUV[position]+" correctamente", Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
        lst.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",mixeUV[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+mixeUV[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),mixeesp.class);
                startActivity(intent);
                return false;
            }
        });
    }
}
