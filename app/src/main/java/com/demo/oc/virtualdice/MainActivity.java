package com.demo.oc.virtualdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dice6 = (Button) findViewById(R.id.button_dice6);
        Button dice20 = (Button) findViewById(R.id.button_dice20);
        

        dice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                intent.putExtra("DICE", 6);
                startActivity(intent);
            }
        });

        dice20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                intent.putExtra("DICE", 20);
                startActivity(intent);
            }
        });
    }
}
