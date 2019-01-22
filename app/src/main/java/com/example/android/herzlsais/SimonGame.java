package com.example.android.herzlsais;

import android.view.InputQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class SimonGame {
    PriorityQueue<Color> gameSequnce;
    PriorityQueue<Color> playerSequence;
    int level;
    boolean isRunning;

    public SimonGame() {
        this.gameSequnce = new PriorityQueue();
        this.playerSequence = new PriorityQueue();
        this.level = 0;
        this.isRunning = true;
    }

    public void addToSequence(){
        Color[] colors = {Color.red, Color.blue, Color.green, Color.yellow};

        int random = (int) Math.random()*4;

        gameSequnce.add(colors[random]);
    }

    public void getInput(Color color){
        playerSequence.add(color);
    }

    public boolean checkSequencesEqality(){
        boolean equality = true;

        gameSequnce.add(Color.none);
        playerSequence.add(Color.none);

        while(equality && gameSequnce.peek().equals(Color.none)){
            if(gameSequnce.peek().equals(playerSequence.peek())){
                gameSequnce.add(gameSequnce.poll());
                playerSequence.add(playerSequence.poll());
            } else {
                equality = false;
            }
        }

        while(!gameSequnce.peek().equals(Color.none)) {
            gameSequnce.add(gameSequnce.poll());
            playerSequence.add(playerSequence.poll());
        }

        gameSequnce.poll();
        playerSequence.poll();

        return equality;
    }


    enum Color{
        red, green, yellow, blue, none;
    }
}
