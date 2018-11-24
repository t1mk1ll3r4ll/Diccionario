package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewQR extends AppCompatActivity {
    ListView lst;
    String espQR[]={"que duele", "que germina", "quebrado", "quemado", "quien", "quien sabe", "quiere ver", "quiérelo", "quijada", "quitar algo", "rápido", "rasurado", "raya", "reboso", "recelentar", "recíbelo", "recipiente", "recto", "rédito", "reflejo", "regálalo", "remendado", "resbaloso", "resguño", "reventó", "revienta", "revive", "rico", "rincón", "río grande", "risueño", "robado", "rodando", "rodilla", "rodó", "rojo", "ronca", "roñoso", "roto"};
    String mixeQR[]={"atoom", "mujxp", "pu'u", "no'oki", "pën", "panejtyë", "ixaam", "tsok", "apajk", "ajaxtu'ut", "tsooky", "kume'exy", "keets", "kuwëën", "ajokxëëw", "kontsow", "apëkëny", "kujk", "menyunk", "ajajp", "niyeki", "axuyëy", "nokts", "tsekxy", "pojt", "pot", "juikypëjp", "mayë", "atsikx", "mëjnëë", "axiik", "meetsy", "pik", "kox", "kuna'x", "tsapts", "tok'xp", "jëk", "këëts"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_qr);
        lst = findViewById(R.id.listviewQR);
        final CustomListview CustomLV = new CustomListview(this, espQR, mixeQR);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                text=findViewById(R.id.textView2);
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espQR[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espQR[position]+" correctamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
