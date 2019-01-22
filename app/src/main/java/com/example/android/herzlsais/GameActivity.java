package com.example.android.herzlsais;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    Button red, green, yellow, blue;
    TextView level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        red = findViewById(R.id.redButton);
        red.setOnClickListener(this);

        green = findViewById(R.id.greenButton);
        green.setOnClickListener(this);

        yellow = findViewById(R.id.yellowButton);
        yellow.setOnClickListener(this);

        blue = findViewById(R.id.blueButton);
        blue.setOnClickListener(this);

        level = findViewById(R.id.level);

        run();


    }

    protected void run() {
        SimonGame game = new SimonGame();
        while (game.isRunning) {
            for (int i = 0; i < 5; i++)
                game.addToSequence();

            playGameSequnce(game);
            return;
        }

    }

    void playGameSequnce(SimonGame game) {
        game.gameSequnce.add(SimonGame.Color.none);

        while (!game.gameSequnce.peek().equals(SimonGame.Color.none)) {

            if (game.gameSequnce.peek().equals(SimonGame.Color.red)) {
                red.setBackgroundColor(Color.rgb(255, 76, 76));
                try {
                    wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                red.setBackgroundColor(Color.rgb(93, 13, 13));


            } else if (game.gameSequnce.peek().equals(SimonGame.Color.green)) {
                green.setBackgroundColor(Color.rgb(102, 255, 51));
                try {
                    wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                green.setBackgroundColor(Color.rgb(38, 66, 32));


            } else if (game.gameSequnce.peek().equals(SimonGame.Color.yellow)) {
                yellow.setBackgroundColor(Color.rgb(255, 245, 58));
                try {
                    wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                yellow.setBackgroundColor(Color.rgb(109, 74, 0));

            } else if (game.gameSequnce.peek().equals(SimonGame.Color.blue)) {
                yellow.setBackgroundColor(Color.rgb(255, 245, 58));
                try {
                    wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                yellow.setBackgroundColor(Color.rgb(109, 74, 0));
            }


        }


    }

    @Override
    public void onClick(View view) {

    }
}
