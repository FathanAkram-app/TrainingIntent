package com.f123rfa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent moveIntent = new Intent(MainActivity.this, Activity2Activity.class);
                startActivity(moveIntent);
                break;
            case R.id.button2:
                Intent intentD = new Intent(MainActivity.this, ActivityData.class);
                intentD.putExtra(ActivityData.EXTRA_NAME, "Dicoding Academy Boy");
                intentD.putExtra(ActivityData.EXTRA_AGE, 5);
                startActivity(intentD);
                break;
            case R.id.button3:
                String phoneNumber = "082111343723";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(MainActivity.this, ActivityTermimaObjek.class);
                Mybiodata harutya = new Mybiodata("Harutya", 16);
                intent4.putExtra("biodata",harutya);
                startActivity(intent4);
                break;

        }
    }


}
