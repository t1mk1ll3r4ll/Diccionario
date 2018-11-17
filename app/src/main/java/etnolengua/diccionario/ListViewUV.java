package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
    }
}
