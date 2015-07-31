package com.sidelance.interestingfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class InterestingFactsActivity extends ActionBarActivity {

    private TextView factTextView;
    private Button newFactButton;
    private Animation fade_in;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interesting_facts);

        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        factTextView = (TextView) findViewById(R.id.factTextView);
        newFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.funFactLayout);

        newFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook.getFact();

                //update textView with dynamic fact
                factTextView.startAnimation(fade_in);
                factTextView.setText(fact);
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                newFactButton.setTextColor(color);

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interesting_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
