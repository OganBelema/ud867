package com.oganbelema.telljoke;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {

    private List<String> jokes = new ArrayList<>();

    private String joke1 = "I asked God for a bike, but I know God doesn't work that way. " +
            "So I stole a bike and asked for forgiveness.";
    private String joke2 = "I want to die peacefully in my sleep, like my grandfather.. " +
            "Not screaming and yelling like the passengers in his car.";
    private String joke3 = "Do not argue with an idiot. He will drag you down to his level " +
            "and beat you with experience.";
    private String joke4 = "The last thing I want to do is hurt you. But it's still on the list.";
    private String joke5 = "If sex is a pain in the ass, then you're doing it wrong...";


    public Joke(){
        jokes.add(joke1);
        jokes.add(joke2);
        jokes.add(joke3);
        jokes.add(joke4);
        jokes.add(joke5);
    }


    public String getJoke(){
        int randomNumber = new Random().nextInt(5);
        return jokes.get(randomNumber);
    }
}
