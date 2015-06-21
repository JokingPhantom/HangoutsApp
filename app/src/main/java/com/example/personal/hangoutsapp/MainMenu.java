package com.example.personal.hangoutsapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;

public class MainMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout screenLayout = new RelativeLayout(this);

        Button Transport = new Button(this);
        Button Budget = new Button(this);
        Button Interest = new Button(this);
        Button Time = new Button(this);
        Button Count = new Button(this);

        Transport.setText("Transport");
        Budget.setText("Budget");
        Interest.setText("Interest");
        Time.setText("Time");
        Count.setText("Count");

        screenLayout.addView(Transport);
        screenLayout.addView(Budget);
        screenLayout.addView(Interest);
        screenLayout.addView(Time);
        screenLayout.addView(Count);

        setContentView(screenLayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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
