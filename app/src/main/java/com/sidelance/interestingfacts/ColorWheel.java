package com.sidelance.interestingfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Class to dynamically change background color
 */
public class ColorWheel{


    /**
     * Member variable (object properties)
     */
    public String[] mColors = {

            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
            "#51b46d"

    };

    /**
     * Method that randomly selects fact
     */
    public int getColor(){

        String color;

        //Randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
