package com.example.kenkocho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends RegisterActivity {
    TextView T;
    EditText ml,mdp;
    Button btn_login;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T = findViewById(R.id.message);
        ml = findViewById(R.id.eml);
        mdp = findViewById(R.id.psw);
        btn_login = findViewById(R.id.b_login);
        btn_register= findViewById(R.id.b_register);

        Intent regis =getIntent();
        String r_mail = regis.getStringExtra("mail");
        String r_mdp = regis.getStringExtra("motdepasse");





        btn_login.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {

                        checkDataEntered();

                        if (ml.getText().toString().equals(r_mail)  &&
                                mdp.getText().toString().equals(r_mdp) ) {

                            Intent b_login = new Intent(getApplicationContext(), Activite2.class);
                            startActivity(b_login);

                        }
                        else {

                            Toast T = Toast.makeText(MainActivity.this, "Identifiant et/ou mot-de-passe incorrect", Toast.LENGTH_LONG);
                            T.show();

                        }


                    }

                }

        );

        btn_register.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {

                        Intent b_register = new Intent(getApplicationContext(),RegisterActivity.class);
                        startActivity(b_register);

                    }
                }

        );

    }

    public boolean isEmail (EditText text){
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty (TextView text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }



    protected void checkDataEntered(){



        if (isEmpty(ml)){
            ml.setError("Veuillez entrer votre adresse e-Mail");
        }
        if (isEmpty(mdp)) {
            mdp.setError("Veuillez entrer mot-de-passe,");
        }


    }


}