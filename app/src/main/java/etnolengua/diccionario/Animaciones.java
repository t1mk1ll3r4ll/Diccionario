package etnolengua.diccionario;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Animaciones extends AppCompatActivity {
    Button Einv, e,g,k,m,s,t,u;
    VideoView Vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animaciones);

        final String fileplace="android.resource://" + getPackageName() + "/raw/";
        Einv=findViewById(R.id.ButEinv);
        Vid=findViewById(R.id.videoView);
        e=findViewById(R.id.BtnE);
        g=findViewById(R.id.BtnG);
        k=findViewById(R.id.BtnK);
        m=findViewById(R.id.BtnM);
        s=findViewById(R.id.BtnS);
        t=findViewById(R.id.BtnT);
        u=findViewById(R.id.BtnU);

        Einv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="e_invertida";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="e";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="g";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="k";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="m";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="s";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="t";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename="u";
                String rep=fileplace+filename;
                Vid.setVideoURI(Uri.parse(rep));
                Vid.start();
            }
        });

    }
}
