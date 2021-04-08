package com.sitia.tugas_1_akb_if9_10118355;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //07 April 2021 - 10118355 - Siti Alawiah - IF9

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button)findViewById(R.id.btnProfile);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProfileActivity.class);

                startActivity(i);

            }
        });

        Button btnRegistration = (Button)findViewById(R.id.btnLogout);

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);

                startActivity(i);
                finish(); // This call is missing.
            }
        });

    }
}