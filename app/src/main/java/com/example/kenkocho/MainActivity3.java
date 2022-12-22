package com.example.kenkocho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class MainActivity3 extends AppCompatActivity {
    EditText ord,diag;
    Button btn_nxt;
    String current_date = java.text.DateFormat.getDateTimeInstance().format(new Date());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ord = findViewById(R.id.p_ord);
        diag = findViewById(R.id.p_diag);
        btn_nxt = findViewById(R.id.b_next);

        Intent pat =getIntent();
        String p_n = pat.getStringExtra("nom");
        String p_pr = pat.getStringExtra("prenom");


        btn_nxt.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {

                        Intent b_next2 = new Intent(getApplicationContext(),MainActivity4.class);
                        b_next2.putExtra("nom2",p_n);
                        b_next2.putExtra("prenom2",p_pr);
                        b_next2.putExtra("ordonnance",ord.getText().toString());
                        b_next2.putExtra("diagnostic",diag.getText().toString());
                        b_next2.putExtra("date",current_date);
                        startActivity(b_next2);

                    }
                }

        );
    }
}