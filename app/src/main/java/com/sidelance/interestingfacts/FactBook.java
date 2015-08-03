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
            "Olympic gold medals are actually made mostly of silver!",
            "Banging your head against a wall burns 150 calories an hour.",
            "A flock of crows is known as a murder.",
            "'Penis Fencing' is a scientific term for the mating ritual between flatworms. " +
                    "\nIt involves two flatworms attempting to stab the other flatworm with their penis.",
            "Arab women can initiate a divorce if their husbands don't pour coffee for them.",
            "Facebook, Skype and Twitter are all banned in China.",
            "A small child could swim through the veins of a blue whale.",
            "Bin Laden's death was announced on 1st May 2011. \nHitler's death was announced on 1st May 1945.",
            "You cannot snore and dream at the same time.",
            "An average person's yearly fast food intake will contain 12 pubic hairs.",
            "Heart attacks are more likely to happen on a Monday.",
            "Bikinis and tampons were invented by men.",
            "Leonardo Da Vinci Invented Contact Lenses in 1508!",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "Billy goats urinate on their own heads to smell more attractive to females. Try it!",
            "29th May is officially 'Put a Pillow on Your Fridge Day'.",
            "The average woman uses her height in lipstick every 5 years.",
            "'Facebook Addiction Disorder' is a mental disorder identified by Psychologists.",
            "When hippos are upset, their sweat turns red.",
            "Pteronophobia is the fear of being tickled by feathers!",
            "Cherophobia is the fear of fun.",
            "Hyphephilia are people who get aroused by touching fabrics",
            "Fans of 50 shades of grey. \nThe human eye can see 500 shades of grey!",
            "The muscles that move the eyes are the fastest and strongest muscles in the body: they are 100 times more powerful than necessary.",
            "You blink more when you talk, and less when you're reading off a computer screen or paper - the reason behind why your eyes get tired more.",
            "People generally read 25 times slower on screen than on paper.",
            "Everyone around the world with blue eyes share a common ancestor: the first person with blue eyes lived around 6,000 - 10,000 years ago, and before that, everyone had brown eyes!"

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
