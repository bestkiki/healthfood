package kiki.entertainment.health.healthfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.layout.simple_list_item_1;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        //화면 전환
        Button button = (Button) findViewById(R.id.consulting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.hanyak);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.home);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        //xml 이용한 경우
        final String[] list_explain = getResources().getStringArray(R.array.achievement);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.foods,simple_list_item_1);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), ((TextView) view).getText() + list_explain[i], Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), ((TextView) view).getText() + list_explain[i], Toast.LENGTH_LONG).show();
            }
        });

    }
}
