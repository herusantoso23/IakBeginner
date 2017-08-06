package com.beginner.iak.iakview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editEmail;
    private EditText editPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = (EditText) findViewById(R.id.edit_email);
        editPass = (EditText) findViewById(R.id.edit_pass);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( editEmail.getText().toString().equals("bla@gmail.com")
                        && editPass.getText().toString().equals("1234")){

                    //pesan berhasil
                    Toast.makeText(getApplicationContext(),
                            "LOGIN BERHASIL",
                            Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);

                } else {
                    //pesan gagal
                    Toast.makeText(getApplicationContext(),
                            "LOGIN GAGAL, CEK KEMBALI EMAIL DAN PASSWORD ANDA!" ,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}

