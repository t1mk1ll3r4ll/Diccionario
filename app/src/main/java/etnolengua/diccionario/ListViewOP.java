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

public class ListViewOP extends AppCompatActivity {
    ListView lst;
    String espOP[]={"obo (árbol)", "ochenta", "ocho", "ocote (árbol)", "ofrecido", "oído", "olla", "olvidar", "ombligo", "oreja", "originario", "orina", "otoño", "otra vez", "oye", "padre", "padrino", "pagado", "paisano", "pájaro", "pájaro", "pala", "palma", "palo", "paloma", "pan", "pantalón", "pañal", "pañuelo", "papa", "papel", "pared de barro", "parir", "pariendo", "partes delgadas del cuerpo", "partir una cosa", "pásale", "pasar la mano", "pasó", "patea", "patio", "pecho", "pedacería", "pedazo", "pedir posada", "pegado", "pégalo", "pegamento", "pegar", "peine", "pelado", "pélalo", "peleando", "pelón", "pelón", "peluquero", "perdido", "perdón", "periodo detrás días", "persona ajena", "persona platicadora", "pesado", "pescado", "pez", "pestilencia ", "petate", "pezón", "pide prestado", "pie", "piedra", "piedra caliente", "piel", "pierna", "pintado", "piña", "piojo", "plano", "plátano", "plato", "pobre", "pobre", "podrido", "por ejemplo", "por eso", "por fuera", "por la fuerza", "por su propia voluntad", "porque", "posada", "posible", "preciso", "preso", "prestado/a", "primero", "pronto", "pueblo", "puerco espín", "puerta", "pujando", "pulga", "pulque", "pus"};
    String mixeOP[] = {"pikxmaxy", "mëtajpx", "tuktuujk", "tsiin", "aweenëëy", "taatsk", "tu'ts", "jatyëkoy", "puutsk", "taatsak", "kunaax", "ta'ats", "poot", "jataook", "mëtow", "teety", "tetykuaan", "kujuy", "mëkunaax", "axkakak", "joon", "pu'xyuun", "jow", "kepy", "muuxy", "tsakeekt", "ixyë", "mots", "payë", "tsaj'muny", "naiky", "potsy", "ke'exp", "ke'exp", "apiiny", "ajetee", "nax", "ajaax", "majx", "nejp", "tëpaa", "katsyak", "tsay", "tu'teik", "ayoopy", "ootsy", "ton", "otsk", "kox", "kaxk", "tak", "jep", "tsiptuump", "kutajt", "kutë'ëx", "me'xpë", "tëkojy", "mekx", "maaxk", "tekëjaay", "akapx", "jemtsy", "akx", "akx", "tikts", "to'oky", "tsiits", "anu'xp", "teiky", "tsaa", "antsaa", "ak", "puuy", "kats", "tsikty", "aat", "jooy", "ka'ak", "texy", "ayoop", "ëyoop", "pu'uts", "axtaamëts", "paaty", "ajëëxk", "atsip", "atmsoo", "jatits", "amejtstaakp", "mapaat", "mëktaaik", "tsuim", "anukx", "jawiin", "pakyë", "ka'p", "aptykaa", "tëjk'akë", "ajëjp", "pix", "keetsy", "komy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_op);
        lst = findViewById(R.id.listviewOP);
        final CustomListview CustomLV = new CustomListview(this, espOP, mixeOP);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espOP[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espOP[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
    }
}
