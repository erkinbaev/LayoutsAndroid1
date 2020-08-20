package com.natlusrun.layoutsandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    //view vars
    ImageView icon;
    TextView helloText, companyName, warningText;
    EditText login, password;
    Button btn_login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    public void initViews(){
        icon = findViewById(R.id.login_icon);
        helloText = findViewById(R.id.welcome_txt);
        companyName = findViewById(R.id.company_name);
        login = findViewById(R.id.ed_login);
        password = findViewById(R.id.ed_password);
        warningText = findViewById(R.id.error_login);
        btn_login = findViewById(R.id.btn_login);
    }

    public void onLoginClick(View view) {
        if (TextUtils.isEmpty(login.getText().toString()) || TextUtils.isEmpty(password.getText().toString()) ){
            warningText.setText("you entered incorrect data!!!");
        }else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
