package kiki.entertainment.health.healthfood;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import static android.R.layout.simple_list_item_1;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button riceButton = (Button) findViewById(R.id.riceButton);
        final Button barleyButton = (Button) findViewById(R.id.barleyButton);
        final Button cornButton = (Button) findViewById(R.id.cornButton);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice);

        riceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                riceButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                barleyButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                cornButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new RiceFragment());
                fragmentTransaction.commit();
            }
        });

        barleyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                riceButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                barleyButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                cornButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new BarleyFragment());
                fragmentTransaction.commit();
            }
        });

        cornButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                riceButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                barleyButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                cornButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new CornFragment());
                fragmentTransaction.commit();
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
                Toast.makeText(getApplicationContext(), ((TextView) view).getText() + list_explain[i], Toast.LENGTH_SHORT).show();
            }
        });



        //화면 전환
        Button button = (Button) findViewById(R.id.consulting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.hanyak);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.home);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
