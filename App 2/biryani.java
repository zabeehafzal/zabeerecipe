package com.example.myappr2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class biryani extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biryani);

        button = (Button) findViewById(R.id.btnmain);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biryani.this,Dashboard.class);
                startActivity(intent);

            }
        });

    }
}