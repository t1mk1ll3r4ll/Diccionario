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

public class ListViewT extends AppCompatActivity {
    ListView lst;
    String espT[]={"tabla", "talón", "tamal", "tamal", "tamal blanco con sal", "tambo", "tapado", "tapado", "tápalo", "tápalo", "tapar algo", "tapar con palos", "tardado", "tartamudeando", "taza", "tecolote", "tecolote", "tejido", "tejón", "temprano", "tener calor", "tepijilote", "terreno para casa", "testículo", "tiene hipo", "tiene precio", "tierra", "tigre", "tijera", "tira lo ", "tíralo", "tíralo abajo", "tirar granos", "tlacuache", "tocando la guitarra", "todavía no", "todo", "tomate", "tortilla", "tortilla caliente", "tortilla con sal", "tos ferina", "tos", "totalmente lleno", "totomosle", "trabajar enfermo", "trabajo", "trágalo", "tres", "triste", "troje", "trozado", "trueno", "tú", "tu mamá", "tu papá", "tucán", "tusa (animal)"};
    String mixeT[]={"pu'uy", "tekixpok", "më'ëky", "panuuky", "taamtsmë'ëky", "tampë", "atsiitsy", "nipeeny", "ajup", "kuwits", "ajiits", "akap", "jejky", "anaakp", "tasë", "ju'k", "kujx", "taaik", "tsik", "jopy", "ano'këpëtsy", "nuun", "tëjkop", "tutsyaa", "nëjëp", "tsopaatp", "naax", "kaa", "me'px", "ixcaats", "axkaats", "kuka'tsnax", "axwë'j", "mokx", "koop", "ka'në", "kësyë", "ko'on", "kaaky", "amkaaky", "taamtskaaky", "ji'xoj", "oj", "apëëtsy", "akts", "apaam", "tuunk", "jëën", "tuwëëk", "ta'mape", "tsex", "pooty", "anee", "miitsy", "mtaj", "mteety", "kaat", "tëptsy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_t);
        lst = findViewById(R.id.listviewT);
        final CustomListview CustomLV = new CustomListview(this, espT, mixeT);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espT[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espT[position]+" correctamente", Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
    }
}
