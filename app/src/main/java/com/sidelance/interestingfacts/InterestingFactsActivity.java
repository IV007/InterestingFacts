package com.sidelance.interestingfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class InterestingFactsActivity extends Activity {

    public static final String TAG = InterestingFactsActivity.class.getSimpleName();

    private TextView factTextView;
    private Button newFactButton;
    private Animation mFadeIn;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interesting_facts);

        mFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        factTextView = (TextView) findViewById(R.id.factTextView);
        newFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.funFactLayout);

        newFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook.getFact();

                //update textView dynamic with fade in Animation
                factTextView.startAnimation(mFadeIn);
                factTextView.setText(fact);
                getMagicNumber();
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                newFactButton.setTextColor(color);

            }
        });
    }

    /**
     * Method that randomly selects numbers.
     */
    public int getMagicNumber(){

        //Randomly select fact
        Random randomGenerator = new Random();

        //Scramble number
        int randomNumber = randomGenerator.nextInt(20);

        //Pass Scrambled Number through prime number check
        if (isPrime(randomNumber)) {

            Log.i(TAG, "New Random Number detected! " + randomNumber);


           /* //Randomly Animate textView dynamically
            factTextView.startAnimation(mFadeIn);
            */

        }
        return randomNumber;
    }


    //Checks whetehr an int is prime or not
    private boolean isPrime(int n) {

        //Check if n is a multiple of 2
        if (n % 2 == 0) return false;

        //if not, then just check the odd numbers
        for (int i = 3; i * i < n; i += 2 ){

            if (n % i == 0)

                return false;
        }

        return true;
    }


}
