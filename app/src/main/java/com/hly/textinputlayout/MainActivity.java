package com.hly.textinputlayout;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout account,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = findViewById(R.id.layout_account);
        pwd = findViewById(R.id.layout_pwd);

        account.setErrorEnabled(true);
        pwd.setErrorEnabled(true);
    }
}
