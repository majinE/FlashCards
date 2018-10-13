package com.example.edgarreyes.flashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.FlashCardQuestion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.FlashCardAnswer).setVisibility(View.VISIBLE);
                findViewById(R.id.FlashCardQuestion).setVisibility(View.INVISIBLE);
            }
        });
    }
}
