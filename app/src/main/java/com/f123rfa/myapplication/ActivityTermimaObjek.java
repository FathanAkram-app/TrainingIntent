package com.f123rfa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTermimaObjek extends AppCompatActivity {

    public TextView textvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termima_objek);
        textvv = findViewById(R.id.textvv);

        Mybiodata biodata = getIntent().getParcelableExtra("biodata");
        textvv.setText("Nama saya : " + biodata.getNama() + " Umur saya : " + biodata.getUmur());
    }
}
