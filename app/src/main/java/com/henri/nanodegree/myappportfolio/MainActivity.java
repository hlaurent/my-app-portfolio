package com.henri.nanodegree.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();


        // Initialize button1
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Show a toast message
                CharSequence text = getString(R.string.button_click_message1) + getString(R.string.button1_text).toLowerCase() +
                        getString(R.string.button_click_message2);
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Initialize button2
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Show a toast message
                CharSequence text = getString(R.string.button_click_message1) + getString(R.string.button2_text).toLowerCase() +
                        getString(R.string.button_click_message2);
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Initialize button3
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Show a toast message
                CharSequence text = getString(R.string.button_click_message1) + getString(R.string.button3_text).toLowerCase() +
                        getString(R.string.button_click_message2);
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Initialize button4
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Show a toast message
                CharSequence text = getString(R.string.button_click_message1) + getString(R.string.button4_text).toLowerCase() +
                        getString(R.string.button_click_message2);
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Initialize button5
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Show a toast message
                CharSequence text = getString(R.string.button_click_message1) + getString(R.string.button5_text).toLowerCase() +
                        getString(R.string.button_click_message2);
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Initialize button6
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Show a toast message
                CharSequence text = getString(R.string.button_click_message1) + getString(R.string.button6_text).toLowerCase() +
                        getString(R.string.button_click_message2);
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
