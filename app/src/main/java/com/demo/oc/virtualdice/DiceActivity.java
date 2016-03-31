package com.demo.oc.virtualdice;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Erwan on 28/03/2016.
 */
public class DiceActivity extends AppCompatActivity implements View.OnClickListener {

    private int diceValue;
    private Random random;
    private TextView number;
    private TextView title;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        random = new Random();
        Intent i = getIntent();
        this.diceValue =  i.getIntExtra("DICE", 6);

        title = (TextView) findViewById(R.id.title);
        title.setText(diceValue + " sided dice");

        number = (TextView) findViewById(R.id.number);
        number.setText("");
        Button roll = (Button) findViewById(R.id.button_roll);

        roll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int value = random.nextInt(diceValue) +1;
        number.setText(String.valueOf(value));
    }
}
