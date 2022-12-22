package com.example.kenkocho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activite2 extends AppCompatActivity {
    EditText p_n,p_pr;
    Button btn_nxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite2);
        p_n = findViewById(R.id.p_nom);
        p_pr = findViewById(R.id.p_prenom);
        btn_nxt = findViewById(R.id.b_next);


        btn_nxt.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {

                        Intent next = new Intent(getApplicationContext(),MainActivity3.class);
                        next.putExtra("nom",p_n.getText().toString());
                        next.putExtra("prenom",p_pr.getText().toString());
                        startActivity(next);

                    }
                }

        );


    }
}