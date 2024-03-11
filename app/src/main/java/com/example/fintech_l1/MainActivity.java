package com.example.fintech_l1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button textChangeButton;
    private TextView textViewMain;


    private final Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();

        textChangeButton.setOnClickListener(v -> {
            onClickChangeText();
        });
    }

    private void initializeComponents(){
        textChangeButton = findViewById(R.id.btnChangeText);
        textViewMain = findViewById(R.id.tvMain);
    }
    private void onClickChangeText(){
        if (textViewMain.getText().toString().equals(getResources().getString(R.string.initialText))){
            textViewMain.setText(R.string.newText);
        }
        else {
            textViewMain.setText(R.string.initialText);
        }

    }
}