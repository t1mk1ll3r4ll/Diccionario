package etnolengua.diccionario;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashScreen extends Activity {
    FirebaseAuth mAuth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mAuth = FirebaseAuth.getInstance();
        user=mAuth.getCurrentUser();


        if (user != null && mAuth.getCurrentUser().isEmailVerified()){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen.this, Menu_select.class);
                    startActivity(intent);
                    finish();
                }
            }, 5000);
    }
    else {
            try {
                if (!user.isEmailVerified()) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(SplashScreen.this, Bienvenida.class);
                            startActivity(intent);
                            finish();
                        }
                    }, 5000);
                }

            }catch(NullPointerException exception) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(SplashScreen.this, Bienvenida.class);
                        startActivity(intent);
                        finish();
                    }
                }, 5000);
            }
            }
        }
    }


