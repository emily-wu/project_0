package com.example.android.projectzero;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
        implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener((View.OnClickListener) this);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener((View.OnClickListener) this);

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener((View.OnClickListener) this);

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener((View.OnClickListener) this);

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener((View.OnClickListener) this);

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button2: /** show toast message for spotify streamer app button click*/
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.button3: /** show toast message for Scores app button click*/
                toast = Toast.makeText(getApplicationContext(), "This button will launch my Scores app", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.button4: /** show toast message for Library app button click*/
                toast = Toast.makeText(getApplicationContext(), "This button will launch my Library app", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.button5: /** show toast message for Build it Bigger app button click */
                toast = Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger app", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.button6: /** show toast message for XYZ Reader app button click */
                toast = Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.button7: /** show toast message for capstone app button click */
                toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}