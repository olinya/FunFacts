package com.zobatech.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Junior on 04/05/2015.
 */
public class ColorWheel {

    //Member variables (properties about the object)
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
            "#b7c0c7"
    };

    //Method (abilities: things the object can do)
    public int getColor() {


        //The button was clicked, so update the factLabel with the new fact
        String color = "";

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}