package com.sidelance.interestingfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class InterestingFactsActivity extends ActionBarActivity {

    TextView factTextView;
    Button newFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interesting_facts);

        factTextView = (TextView) findViewById(R.id.factTextView);
        newFactButton = (Button) findViewById(R.id.showFactButton);
        newFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = "";
                //Randomly select fact

                //update textView with dynamic fact

                factTextView.setText(fact);
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
