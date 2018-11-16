package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewF extends AppCompatActivity {
    ListView lst;
    String espF[] = {"fabricado", "falda", "falta poco", "favor", "filoso", "flojo", "flor", "fresco", "frío", "fuego", "fuerza", "gallina", "gancho", "gavilán", "gemelo", "gente", "gente borracha", "gente buena", "golpear con el puño", "gordo", "grande", "granizo", "grano", "granos en la boca", "grasa", "grillo", "grita", "grueso", "guajolote", "guapino (árbol)", "guardado", "guardalo", "guayaba"};
    String mixeF[] = {"kojy", "ëxuk", "jaween", "mayajt", "jëjp", "nuux", "pëjy", "nik", "tëtsy", "jëën", "majaa", "tseey", "jo'k", "kuwaj", "axeeny", "ja'ay", "amukiëjaay", "oyjaay", "tex", "nik'xe", "mëj", "tëtstuu", "puuts", "apuuts", "on", "tsiktsy", "ayaaxp", "mapxy", "tuut", "akpejy", "pekeiky", "pëkë'ëk", "pox"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_f);
        lst = findViewById(R.id.listviewF);
        final CustomListview CustomLV = new CustomListview(this, espF, mixeF);
        lst.setAdapter(CustomLV);
    }
}