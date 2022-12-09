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

public class RegisterActivity extends AppCompatActivity {

    TextView r_T;
    EditText r_n, r_sn, r_ml, r_mdp;
    Button bt_register;
    /*public Patient P = new Patient();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        r_n = findViewById(R.id.reg_name);
        r_sn = findViewById(R.id.reg_surname);
        r_T = findViewById(R.id.reg_msg);
        r_ml = findViewById(R.id.reg_eml);
        r_mdp = findViewById(R.id.reg_psw);
        bt_register = findViewById(R.id.b_register);


        bt_register.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {

                        checkDataEntered();

                        if (isEmpty(r_n)||isEmpty(r_sn)||isEmpty(r_ml)||isEmpty(r_mdp)){}

                        else {

                            Intent bt_register = new Intent(getApplicationContext(), MainActivity.class);
                            bt_register.putExtra("nom",r_n.getText().toString());
                            bt_register.putExtra("prenom",r_sn.getText().toString());
                            bt_register.putExtra("mail",r_ml.getText().toString());
                            bt_register.putExtra("motdepasse",r_mdp.getText().toString());
                            startActivity(bt_register);
                        }


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

        if (isEmpty(r_n)){
            r_n.setError("Veuillez entrer votre adresse e-Mail");
        }
        if (isEmpty(r_sn)) {
            r_sn.setError("Veuillez entrer mot-de-passe,");
        }

        if (isEmpty(r_ml)){
            r_ml.setError("Veuillez entrer votre adresse e-Mail");
        }
        if (isEmpty(r_mdp)) {
            r_mdp.setError("Veuillez entrer mot-de-passe,");
        }
        if (!isEmail(r_ml)){
            r_ml.setError("Veuillez entrer une adresse valide");
        }


    }
}
