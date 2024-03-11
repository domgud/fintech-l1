package com.example.fintech_l1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button textChangeButton;
    private Button colorChangeButton;
    private TextView textViewMain;

    // used for random color generation
    private final Random random = new Random();
    //hello, this will be reverted.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();

        textChangeButton.setOnClickListener(v -> {
            onClickChangeText();
        });

        colorChangeButton.setOnClickListener(v -> {
            onClickChangeColor();
        });

    }

    private void initializeComponents(){
        textChangeButton = findViewById(R.id.btnChangeText);
        colorChangeButton = findViewById(R.id.btnChanceColor);
        textViewMain = findViewById(R.id.tvMain);
    }
    private void onClickChangeText(){
        // this will change text back and forth
        if (textViewMain.getText().toString().equals(getResources().getString(R.string.initialText))){
            textViewMain.setText(R.string.newText);
        }
        else {
            textViewMain.setText(R.string.initialText);
        }

    }

    private void onClickChangeColor(){
        textViewMain.setTextColor(Color.argb(255, random.nextInt(256),
                random.nextInt(256), random.nextInt(256)));
    }
}