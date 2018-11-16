package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewE extends AppCompatActivity {
    ListView lst;
    String espE[] = {"educado", "ellos", "embarazada", "empezando", "en el municipio", "en la milpa", "en pareja", "en silencio", "encargar", "encuentralo", "endredón", "enemigo", "enfermedad", "enmascarado", "enojado", "enrolla", "entero/entera", "enterrado", "entre diez", "entre todos", "entre varios", "envíalo", "envolver", "envuelto", "envuelvelo", "epazote", "escalera", "escandaliza", "escoba", "escopeta", "escuela", "espalda", "espejo", "espera", "espera", "espera", "espero", "espina", "espíritu", "está comiendo", "está sucediendo", "estaca", "estar cargando", "estar enfermo", "este", "estrecho", "estrella", "estudiando", "evaporando", "excremento", "echar alguna cosa con la mano", "experto sobre la lectura del calendario Mixe"};
    String mixeE[] = {"axpëky", "ajkxy", "jaaotyp", "tsontaakp", "akujk", "kamjoit", "ametsk", "ametsy", "aneem", "paat", "axuk", "mëtsip", "pa'am", "aptoot", "jotma'p", "pit", "amuum", "tajë'y", "nëmajk", "nikëxy", "nëmaay", "kex", "amots", "motsy", "nëmots", "puteeit", "teeny", "amayeepy", "peetk", "tuktk", "kapxoyëyë", "jëëxk", "ijty", "aix", "awix", "jaix", "ki'xk", "apty", "jewe'ny", "kaapy", "jajtëp", "kup", "tëëmp", "pëkëp", "ata", "axuuts", "mëtsaa", "ixpeky", "ajojp", "të'ëny", "awokëëw", "kuxëë"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_e);
        lst = findViewById(R.id.listviewE);
        final CustomListview CustomLV = new CustomListview(this, espE, mixeE);
        lst.setAdapter(CustomLV);
    }
}
