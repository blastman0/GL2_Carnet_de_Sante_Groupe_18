package com.example.kenkocho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView nm,dg,ordn,date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        nm = findViewById(R.id.tv_nom);
        dg = findViewById(R.id.tv_diag);
        ordn = findViewById(R.id.tv_ord);
        date = findViewById(R.id.tv_date);

        Intent pat2 =getIntent();
        String p_n = pat2.getStringExtra("nom2");
        String p_pr = pat2.getStringExtra("prenom2");
        String p_diag = pat2.getStringExtra("diagnostic");
        String p_ord = pat2.getStringExtra("ordonnance");
        String p_date = pat2.getStringExtra("date");

        nm.setText(p_n+" "+p_pr);
        dg.setText("Diagnostic: "+p_diag);
        ordn.setText("Ordonnance: "+p_ord);
        date.setText(p_date);


    }
}