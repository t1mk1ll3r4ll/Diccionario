package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewS extends AppCompatActivity {
    ListView lst;
    String espS[]={"sabio", "sácalo", "sal", "salado", "salario", "saliva", "salte", "sangra", "sangre", "sapo", "sazón", "sé", "se abrió", "se acaba", "se acabó", "se agarraron", "se agujereo", "se ahoga", "se ahogó", "se cayó", "se cayó (persona)", "se dobla", "se hace lodo", "se irá", "se queja", "se reproduce", "se sube", "se trabó", "se atoró", "se va", "se va componer", "se ve", "se viene", "seco", "secretaria", "seis", "sellado", "selva", "sembradio", "sembrado", "sembró", "siembra", "semilla", "semilla de calabaza", "señorita", "serete", "serrucho", "servilleta", "servir la comida", "sesenta", "seso", "sí", "síembralo", "siempre", "siete", "sigue reventando", "sin barba", "sin diente", "sin dulce", "sin tomar agua", "sin voluntad", "soldado de soldar", "solo", "sombra ", "sombrero", "sonó", "soñando", "sordo", "su comida", "súbete", "subida", "sucedió", "suegro", "suéltalo", "sueño", "sufre", "sufrimiento", "suplente", "suspira", "suya"};
    String mixeS[]={"maapie", "juut", "kaan", "taamts", "mëjuny", "tsujjy", "pëtsem", "taj'xp", "ne'py", "puun", "maj", "jajpëtsy", "awaats", "këjxp", "këjk", "nimyajtsë", "jujt", "ji'kxp", "ji'xy", "ka'w", "këtaw", "aojtsp", "amoontsëëpy", "ataakamp", "ëjëjp", "mayiipy", "pejp", "je'x", "je'x", "nëkxp", "oyëwamp", "kaxje'kp", "majtsp", "të'ëts", "ja'apyë", "tutujk", "aootsy", "itkujk", "kamtëjk", "kojy", "niip", "niip", "tëëm", "tsipajk", "këxyii", "kejki", "jëtk", "kaakmiots", "apëkëëw", "tuwë'px", "ko'oxy", "jaantsy", "koj", "itëm", "juxtujk", "jakpot", "atak", "atuk", "tsek'tsy", "akutë'ëts", "nëkoopë", "atsayee", "natiuuk", "aapk", "kujup", "nojk", "kumaap", "nat", "jyek'exy", "këxpet", "kexwin", "jaj'te", "tsuap", "axmats", "kumaa", "ëyoop", "axtsaatsy", "namëj", "mëkxë'p", "jya'a"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_s);
        lst = findViewById(R.id.listviewS);
        final CustomListview CustomLV = new CustomListview(this, espS, mixeS);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                text=findViewById(R.id.textView2);
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espS[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espS[position]+" correctamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
