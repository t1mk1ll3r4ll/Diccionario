package etnolengua.diccionario;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    ListView lst;
    String espA[]={"abajo", "abierto", "abismo", "abrázalo", "abuela", "abuelo", "abunda", "aburrirse", "acarrear","accidente", "acéptalo", "achiote","actualmente", "acuerdate", "acuéstalo", "adelántate", "adentro", "adulto", "afeminado", "agarralo", "agua", "agua caliente", "aguacate", "aguacate silvestre", "águila", "ahí", "ahora", "ajo", "ajustado", "ala", "alacrán", "albañil", "algodón", "algunos", "alineado", "allá", "alma", "almohada", "almuerzo", "alto", "alumbra", "alumbrar", "amargo", "amarrado", "amarrar", "ambicioso", "amolado", "anastasia", "anchura", "anciano", "anotado", "anteayer", "antepasados", "aparte", "apenas", "aplastada", "aplauso", "aprende", "apréndelo", "aprendiendo", "aprendiendo", "apurarlo", "aquel", "aquel", "araña", "árbol", "arcoiris", "arde", "ardilla", "arena", "armadillo", "arrestado", "arriba", "arroba", "ásalo", "asamblea", "asesino", "así", "asómate", "atajar", "atornillado", "atrás", "atrás", "atrevido", "aurora", "autoridad", "avecindado", "avisado", "avispa", "ayer","ayudarle","a la buena", "a la medida", "a la orilla", "a oscuras", "a vista", "abre la boca", "abrir camino con machete"};
    String mixeA[]={"apataayk", "awa'ats", "tsiptuuy", "mënenj", "ta'mam", "apteety", "najajtëp", "tsipëëp", "jatsem","ayoony" ,"kupëk", "atsyuut", "jata'apë", "jaa'myets", "ko'ok", "nëkxëëk", "tekoot", "mëjay", "atooxy", "mats", "nëë", "annëë", "kuutypy", "tsinkuutyp", "maxywiits", "jii", "jata'apë", "antsyiuxk", "ta'tspëky", "kieky", "ka'ky", "muts'pë", "pixy", "nëjë'e", "atajp", "jim", "anma", "kukony", "ajop", "këxp", "jajp", "kutëëkx", "ta'am", "awëëny", "awëën", "atsojkp", "ixtsyaatsy", "tatsy", "iook", "ap", "kujaay", "maxteiky", "aptejk", "awiink", "atsaatsy", "nak", "këpo'xp", "jat", "apëk", "apëjkp", "ixpejp", "tsoke", "jaaj", "jue'e", "pooxyp", "kepy", "i'intsy", "toopy", "kuuy", "tsapyu'u", "nëëts", "axwijtsë", "kexp", "aropë", "tsa'aw", "namiukee", "jayaokpë", "jatu'un", "axwoots", "axajtuk", "kuwitëëy", "axaam", "ixaam", "kupeit", "Aurorë", "kutunk", "atsënapië", "awënëy", "joomy", "axëëy", "pupejtpë","aoy", "mëtëyë", "pa'ay", "akoots", "kumioo", "awëëk", "apux"};
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst =findViewById(R.id.listview);
        final CustomListview CustomLV = new CustomListview(this,espA,mixeA);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espA[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espA[position]+" correctamente",Toast.LENGTH_LONG).show();
            }
        });

    }

}