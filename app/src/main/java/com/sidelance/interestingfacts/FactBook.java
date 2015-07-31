package com.sidelance.interestingfacts;

import android.app.Activity;

import java.util.Random;

/**
 * Blue print for fact book object
 * Facts are manipulated here
 */
public class FactBook {

    /**
     * Member variable (object properties)
     */
    public String[] mFacts = {

           "Ants stretch when they wake up in the morning",
            "Slugs have 4 noses",
            "Mark Twain didn't graduate from elementary school",
            "If you want something don't ask someone busy",
            "More people use blue toothbrushes than red ones",
            "The state of Florida is bigger than England.",
            "Boy: Who does it better? \nGirl: Nigerian boys.",
            "Ostriches can run faster than horses!",
            "Olympic gold medals are actually made mostly of silver!"

    };

    /**
    * Method that randomly selects fact
    */
    public String getFact(){

        String fact = "";

        //Randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
