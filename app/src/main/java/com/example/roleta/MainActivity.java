package com.example.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Random(View view){

        TextView numero = findViewById(R.id.textView2);

        Random random = new Random();
        int randomNumber = random.nextInt(11);

        numero.setText("Número: " + randomNumber);
    }
}