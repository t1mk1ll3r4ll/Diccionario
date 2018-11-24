package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewMN extends AppCompatActivity {
    ListView lst;
    String espMN[]={"machete", "madre", "madrina", "maduro", "maduro", "maíz", "maíz desgranado", "maíz tierno", "maíz", "mala", "malva ", "mamey", "manda", "mandato", "mano", "manojos", "manso", "mañana", "mapache", "mar", "marrano", "marta", "más allá", "masa", "mazacuala ", "mázate ", "me iré", "me retiro", "mecapal", "medicina", "medido", "mediodía", "melenudo", "mentiroso/a", "mesa", "mesa", "metate", "mezquino", "mídelo", "milpa", "mira", "mira el camino", "mitad", "mixe ", "mojara", "molido", "mosca", "muchacha", "muerto", "mugre", "mujer", "murciélago", "nadie", "nalga/", "nanacastle (árbol)", "nanche", "naranja", "nariz", "natalia", "neblina", "negro", "nido", "niña", "niño", "No", "no hay nadie", "nombre de un árbol", "nombre de un árbol", "nombre de un cerro", "nopal", "nosotros", "novio", "nube", "nudo", "nueve", "nuevo", "nutria"};
    String mixeMN[] = {"pujx", "taj", "otiaj", "otsyam", "tsa'am", "mook", "mokëkxy", "nikmook", "maaky", "axëëm", "tamujts", "potkaak", "ana'amp", "kutujt", "kë'ë", "apity", "maax", "japoom", "nëyaay", "mejy", "atsëm", "kexytsyik", "nijim", "jëtsy", "puk", "pax", "atakampëtsy", "jewa'k", "tsëmtsaay", "tsooy", "kipxy", "kujxyëë", "kupeeny", "anëë", "kapiejt", "meexë", "paan", "tsipty", "kipx", "kam", "eep", "tuijxp", "kupk", "ayuuk", "tsaam", "me'ey", "niix", "kiix", "o'kpë", "puu'ty", "toxyëjk", "tëëxy", "nipën", "ixmaatsy", "nëëky", "tux", "tsuiik", "jëput", "tay", "nëma", "tsixy", "pe'eny", "kixyunk", "pina'k", "ka'p", "apak", "atsyaam", "tsëëny", "apkop", "taat", "ëtsyatëm", "jamië'ët", "jok", "poox", "taaxtujk", "jemy", "nëkaa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_mn);
        lst = findViewById(R.id.listviewMN);
        final CustomListview CustomLV = new CustomListview(this, espMN, mixeMN);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                text=findViewById(R.id.textView2);
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espMN[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espMN[position]+" correctamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}

