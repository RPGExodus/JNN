package pl.billog_studio.janigdynie_graimprezowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Gra.pytania_usage= new Pytania_usage();
        setContentView(R.layout.activity_main);
        Button gra=(Button)findViewById(R.id.Main_Graj);
        gra.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Gra.class));
            }
        });
        Button zasady=(Button) findViewById(R.id.Main_Zasady);
        zasady.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Zasady.class));
            }
        });
    }
}
