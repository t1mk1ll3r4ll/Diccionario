package etnolengua.diccionario;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import com.HeadApp.ARTry.*;


public class TresDeView extends UnityPlayerActivity {
    Button repbut;
    //VideoView Vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_de_view);
        //final String fileplace="android.resource://" + getPackageName() + "/raw/";
        repbut=findViewById(R.id.buttonRep);
        //Vid=findViewById(R.id.videoView2);
        repbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TresDeView.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
