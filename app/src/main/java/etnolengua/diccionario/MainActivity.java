package etnolengua.diccionario;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import java.io.Console;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{
    ListView lst;
    EditText edtxt;
    ArrayAdapter<String>adapter;
    ArrayAdapter<String>adaptador;
    String espA[]={"abajo", "abierto", "abismo", "abrázalo", "abuela", "abuelo", "abunda", "aburrirse", "acarrear", "acéptalo", "achiote", "actualmente", "acuerdate", "acuéstalo", "adelántate", "adentro", "adulto", "afeminado", "agarralo", "agua", "agua caliente", "aguacate", "aguacate silvestre", "águila", "ahí", "ahora", "ajo", "ajustado", "ala", "alacrán", "albañil", "", "algodón", "algunos", "alineado", "allá", "alma", "almohada", "almuerzo", "alto", "alumbra", "alumbrar", "amargo", "amarrado", "amarrar", "ambicioso", "amolado", "anastasia", "anchura", "anciano", "anotado", "anteayer", "antepasados", "aparte", "apenas", "aplastada", "aplauso", "aprende", "apréndelo", "aprendiendo", "aprendiendo", "apurarlo", "aquel", "aquel", "araña", "árbol", "arcoiris", "arde", "ardilla", "arena", "armadillo", "arrestado", "arriba", "arroba", "ásalo", "asamblea", "asesino", "así", "asómate", "atajar", "atornillado", "atrás", "atrás", "atrevido", "aurora", "autoridad", "avecindado", "avisado", "avispa", "ayer","ayudarle","a la buena", "a la medida", "a la orilla", "a oscuras", "a vista", "abre la boca", "abrir camino con machete"};

    String mixeA[]={"apataayk", "awa'ats", "tsiptuuy", "mënenj", "ta'mam", "apteety", "najajtëp", "tsipëëp", "jatsem", "kupëk", "atsyuut", "jata'apë", "jaa'myets", "ko'ok", "nëkxëëk", "tekoot", "mëjay", "atooxy", "mats", "nëë", "annëë", "kuutypy", "tsinkuutyp", "maxywiits", "jii", "jata'apë", "antsyiuxk", "ta'tspëky", "kieky", "ka'ky", "muts'pë", "", "pixy", "nëjë'e", "atajp", "jim", "anma", "kukony", "ajop", "këxp", "jajp", "kutëëkx", "ta'am", "awëëny", "awëën", "atsojkp", "ixtsyaatsy", "tatsy", "iook", "ap", "kujaay", "maxteiky", "aptejk", "awiink", "atsaatsy", "nak", "këpo'xp", "jat", "apëk", "apëjkp", "ixpejp", "tsoke", "jaaj", "jue'e", "pooxyp", "kepy", "i'intsy", "toopy", "kuuy", "tsapyu'u", "nëëts", "axwijtsë", "kexp", "aropë", "tsa'aw", "namiukee", "jayaokpë", "jatu'un", "axwoots", "axajtuk", "kuwitëëy", "axaam", "ixaam", "kupeit", "Aurorë", "kutunk", "atsënapië", "awënëy", "joomy", "axëëy", "pupejtpë","aoy", "mëtëyë", "pa'ay", "akoots", "kumioo", "awëëk", "apux"};


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst =findViewById(R.id.listview);
        //edtxt=findViewById(R.id.editTextBusqueda);
        final CustomListview CustomLV = new CustomListview(this,espA,mixeA);
        lst.setAdapter(CustomLV);
        //adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,espA);
        //adaptador= new ArrayAdapter<>(this, android.R.layout.,mixe);
        /* edtxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(CustomLV==null) {
                    lst.setAdapter(CustomLV);
                }
                else{
                    int pos=1;
                    CustomLV.getFilter().filter(s);
                    lst.deferNotifyDataSetChanged();
                    CustomLV.notifyDataSetChanged();

                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });*/


    }

}