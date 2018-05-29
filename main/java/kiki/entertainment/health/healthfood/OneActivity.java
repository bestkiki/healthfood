package kiki.entertainment.health.healthfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        //화면 전환
        Button button = (Button) findViewById(R.id.consulting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.hanyak);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.home);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
