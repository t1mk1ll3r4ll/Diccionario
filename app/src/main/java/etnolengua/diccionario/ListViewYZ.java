package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewYZ extends AppCompatActivity {
    ListView lst;
    String espYZ[]={"ya", "yerba mora", "yerno", "yo", "yuca", "zacate", "zacate", "zanate (ave)", "zancudo", "zorrillo", "zurdo/a"};
    String mixeYZ[]={"tëë", "mujtyaay", "më'ët", "ëëtsy", "kupixy", "mëëy", "nektsy", "piijx", "pëëx", "paats", "ana'jty"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_yz);
        lst = findViewById(R.id.listviewYZ);
        final CustomListview CustomLV = new CustomListview(this, espYZ, mixeYZ);
        lst.setAdapter(CustomLV);
    }
}