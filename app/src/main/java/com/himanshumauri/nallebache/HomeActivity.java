package com.himanshumauri.nallebache;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.himanshumauri.nallebache.Contact.FeedbackMain;
import com.himanshumauri.nallebache.Jokes.JokesMain;
import com.himanshumauri.nallebache.Quote.QuoteMain;
import com.himanshumauri.nallebache.Shairy.ShayariMain;
import com.himanshumauri.nallebache.Story.StoryMain;
import com.himanshumauri.nallebache.WriteUs.WriteUsMain;

public class HomeActivity extends AppCompatActivity {

    CardView mShairy, mJokes, mQuotes, mStory, mWallpaper, mContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mShairy = (CardView) findViewById(R.id.shairy);
        mJokes = (CardView) findViewById(R.id.jokes);
        mQuotes = (CardView) findViewById(R.id.quote);
        mStory = (CardView) findViewById(R.id.story);
        mWallpaper = (CardView) findViewById(R.id.writeUs);
        mContact = (CardView) findViewById(R.id.contact);


        mShairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShayariMain.class);
                startActivity(intent);

            }
        });

        mJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JokesMain.class);
                startActivity(intent);
            }
        });

        mQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuoteMain.class);
                startActivity(intent);
            }
        });

        mStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StoryMain.class);
                startActivity(intent);
            }
        });

        mWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WriteUsMain.class);
                startActivity(intent);
            }
        });

        mContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FeedbackMain.class);
                startActivity(intent);
            }
        });


    }
}
