package com.example.teguh.mengenalhewan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_sapi = (Button)findViewById(R.id.bt_sapi);
        Intent intent = new Intent(MainActivity.this,SapiActivity.class);
        startActivity(intent);
    }
}
