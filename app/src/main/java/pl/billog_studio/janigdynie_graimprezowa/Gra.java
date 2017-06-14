package pl.billog_studio.janigdynie_graimprezowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Gra extends AppCompatActivity {
static Pytania_usage pytania_usage;
TextView pytanie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);
        pytanie = (TextView)findViewById(R.id.textView);
        ImageButton btn=(ImageButton)findViewById(R.id.Gra_ReturnButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Button btn2=(Button)findViewById(R.id.Gra_Button);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            pytanie.setText(pytania_usage.WybierzLosowePytanie());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        pytanie.setText(pytania_usage.WybierzLosowePytanie());
    }
}
