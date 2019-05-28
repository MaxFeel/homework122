package com.example.homework122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView link = findViewById(R.id.myFileLink);
        String linkName = "http://myfile.org/";
        int randomNumber = 1 + (int)(Math.random() * 100) ;
        String fullLink = linkName + randomNumber;
        link.setText(fullLink);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(nextListner);

        Button btnPrev = findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(prevListner);

    }

    private final View.OnClickListener nextListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent nextScreen = new Intent(MainActivity.this, MainActivity.class);
            startActivity(nextScreen);
        }
    };

    private final View.OnClickListener prevListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };


}
