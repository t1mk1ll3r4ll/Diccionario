package etnolengua.diccionario;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewC extends AppCompatActivity {

    ListView lst;
    String espC[]={"caballo", "cabaña", "cabello", "cabeza", "cabezón", "cachete", "cadena", "cadera", "cal", "calabaza", "calculado", "caldo", "caliente", "cállate", "calor del fuego", "calzada", "cama", "camino", "camino", "camisa", "camote", "canción", "cangrejo", "canica", "canoso", "cansada", "cansado", "canta", "cantando", "cántaro", "cárcel", "carga", "cárgalo", "cargando", "cargar", "caro", "casa", "casa municipal", "cásate", "cascada", "castellanizado", "cazador", "cedro", "celosa", "celoso", "ceniza", "cerdo", "cerebro", "cerrado", "cerrado", "cerrado", "cerro", "chacal", "chamaco", "chamarra", "chango", "chapulín", "chayote", "chico", "chile", "chilero", "choncho", "chueco", "chueco", "chupalo", "cielo", "cien", "cigarro", "cincel", "cinco", "cintura", "ciruela", "clara", "cocido", "coco", "codo", "coincide", "colado", "colgado", "collar", "comadre", "comadre", "comadreja", "come", "cómelo", "comerciante", "comida", "comió", "cómo", "como (adverbio)", "como hoy", "completo", "compra", "compra", "cómpralo", "conducho", "confesado", "conocedor", "conocerse", "contento", "contesta", "copal ", "corredor", "corrió", "cortado", "córtalo", "corto", "cosecha", "costilla", "coyol", "criatura", "cristalina", "cuánto", "cuatro", "cucaracha", "cuchara", "cuchillo", "cuerpo", "culebra", "culo", "culpa", "cuñada", "cuñada", "cuñado","agarrados de la mano", "casamiento en el municipio", "cerrar con tira de madera", "comiendo en case ajena", "comió en el camino", "con enojo", "con esfuerzo", "cortar con cuchillo", "cosa alargada", "cosa corta", "cosechar café", "costurar alguna cosa", "crecimiento rápido de persona", "cruza el río", "cuerno de animal"};
    String mixeC[]={"kuaay", "tse'ex", "kuwaay", "kupajk", "kusaam", "amaatsy", "nantsëm", "ixpajk", "jaam", "tsii", "aixëëy", "kanëë", "an", "amon", "jajp", "këë'k", "këjk", "tu'u", "tëytyuu", "kami ixy", "muny", "ëy", "eets", "kanikë", "kupooj", "anu'xëëpy", "anu'xëëpy", "ëëw", "ëëp", "majt", "pu'xiëxk", "tseim", "tseem", "tsëëmp", "këëw", "tsowë", "tëjk", "akujtëjp", "pëk", "tax", "amëxan", "pëkpë", "aj", "amutsk", "amutsk", "kujyam", "kutsy", "kukooxy", "ajiitsy", "akëy", "atuky", "kop", "tsaxy", "mixenk", "nijen", "mi'ka", "mu'u", "akxa", "mutsk", "niiy", "aniiy", "kutsy", "aney", "key", "muujk", "tsajp", "moko'px", "juu'k", "pa'ant", "mëkooxk", "tiinky", "tuuny", "të'kxy", "këë'w", "tsajkum", "këkox", "napiatëp", "anaxy", "kutëy", "nantsëm", "kuaan", "tajkuaan", "iixy", "kay", "jëë'x", "ajuupyë", "kay", "kaaxy", "nej", "nejpy", "jata'apë", "ka'pxy", "juupy", "ajuupyë", "juy", "tujtpaak", "mayats", "jajpë jia'ay", "nayixy atep", "jootkuik", "atsow", "poom", "tejkwiin", "keek", "kepy", "tsuk", "kon", "tsijkp", "katsy", "kum", "maxuunk", "tëxy", "naak", "mëtaaxk", "amuutsy", "kutsyarë", "tsujt", "nini'kx", "tsa'any", "kuuts", "pojkpë", "kapy", "ojy", "jëy","nawyj'tsëp", "akujpëjp", "apax", "mëkaapy", "tukaay", "amaat", "nimajaa", "axtsuk", "ayoony", "akon", "piip", "axuy", "axyeek", "nëënax", "kapk"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_c);
        lst =findViewById(R.id.listviewC);
        final CustomListview CustomLV = new CustomListview(this,espC,mixeC);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espC[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espC[position]+" correctamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}

