package com.techjany.abc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailET;
    EditText passET;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailET = (EditText) findViewById(R.id.emailET);
        passET = (EditText) findViewById(R.id.passET);
        button = (Button) findViewById(R.id.button);

    }


    public void buttonClick(View view) {
        String email = emailET.getText().toString();
        String pass = passET.getText().toString();

        String oemail = "admin";
        String opass = "admin";

        if (email.equals(oemail) && pass.equals(opass)){

            Intent intent = new Intent(this, Navigation.class);
            startActivity(intent);

        }else{
            Toast.makeText(this, "Invalid mail/Password", Toast.LENGTH_SHORT).show();
        }
    }

}
