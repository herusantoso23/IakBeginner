package com.beginner.iak.iakview;

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
                Toast.makeText(getApplicationContext(),
                        "lOGIN BERHASIL " + editEmail.getText() + editPass.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });










    }
}
