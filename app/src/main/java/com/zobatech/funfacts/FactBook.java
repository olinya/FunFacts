package com.zobatech.funfacts;

import java.util.Random;

/**
 * Created by Junior on 04/05/2015.
 */
public class FactBook {

    //Member variables (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

    //Method (abilities: things the object can do)
    public String getFact() {


        //The button was clicked, so update the factLabel with the new fact
        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
              /*  if (randomNumber == 0) {
                    fact = "Ants stretch when they wake up in the morning.";
                }
                else if (randomNumber == 1) {
                    fact = "Ostriches can run faster than horses.";
                }
                else if (randomNumber == 2) {
                    fact = "Olympics gold medals are actually made mostly of silver.";
                }
                else { fact = "Sorry, there was an error.";
                }       */
    }

}
