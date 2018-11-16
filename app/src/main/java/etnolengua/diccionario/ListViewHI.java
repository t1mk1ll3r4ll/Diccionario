package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewHI extends AppCompatActivity {
    ListView lst;
    String espHI[] = {"hablar", "hace falta", "hace rato", "hacer adobe", "hacer calor", "hacha", "hamaca", "hambriento", "hecho", "hembra", "herida", "herida", "herida en la boca", "herramienta", "hierba buena", "hígado", "higo", "higuerilla", "hija", "hijo natural", "hilo", "hincado", "hinchado", "hipo", "hoja", "hoja de ocote", "holgazán", "hombro", "hombro", "hondo", "hondo", "hormiga ", "hormigón", "hoy", "hueco", "huele de noche", "hueso", "hueso de costilla", "hueso de rodilla", "huevo", "hule", "hacer pedazos con un machete", "hermano mayor de la mujer", "iglesia", "iguana", "imitar", "insiste", "intencionalmente", "intestino", "irrita la boca"};
    String mixeHI[] = {"kapk", "mayjajp", "aamy", "muuts", "anpëkp", "jaatsye", "tsaay", "kax", "kojy", "to'oxy", "jot", "tsëtsyë", "ajot", "tumpejt", "tsajpnëmaank", "joot", "piits", "tsajptsooy", "toxyuunk", "akony", "piity", "kojxtënaa", "kixp", "nëjëë", "aay", "tsinaay", "nuux", "kejkyopk", "keky", "këëk", "kom", "nuj", "akooy", "jata'a", "jut", "matap", "pajk", "katsypajk", "koxkopk", "tsetyuuty", "oomy", "apuxëëw", "ay", "tsajtëjk", "tutsëj", "amaapy", "mëmëkta'ak", "najoot", "tiintsy", "axiik"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_hi);
        lst = findViewById(R.id.listviewHI);
        final CustomListview CustomLV = new CustomListview(this, espHI, mixeHI);
        lst.setAdapter(CustomLV);
    }
}