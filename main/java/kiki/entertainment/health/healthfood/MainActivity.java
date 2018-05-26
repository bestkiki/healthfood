package kiki.entertainment.health.healthfood;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

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
    }
}
