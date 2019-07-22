package com.oganbelema.jokeui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent startingIntent = getIntent();

        TextView jokeTextView = findViewById(R.id.jokeTextView);

        if (startingIntent != null){
            if (startingIntent.hasExtra(JOKE_KEY)){
                String joke = startingIntent.getStringExtra(JOKE_KEY);
                jokeTextView.setText(joke);
            }
        }

    }
}
