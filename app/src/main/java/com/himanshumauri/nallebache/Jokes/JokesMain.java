package com.himanshumauri.nallebache.Jokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.himanshumauri.nallebache.R;

public class JokesMain extends AppCompatActivity {
    private LinearLayout mHindiJokes, mHusbandWifeJokes, mSantaBantaJokes, mSharabiJokes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_main);

        TextView HindiJokesKeyword = findViewById(R.id.hindijokeskeyword);
        HindiJokesKeyword.setSelected(true);
        TextView  HusbandWifeKeyword= findViewById(R.id.husbandWifeJokesKeywords);
        HusbandWifeKeyword.setSelected(true);
        TextView SantaBantaKeyword = findViewById(R.id.santabantajokesKeywords);
        SantaBantaKeyword.setSelected(true);
        TextView SarabiKeyword = findViewById(R.id.sharabijokesKeywords);
        SarabiKeyword.setSelected(true);

        mHindiJokes = (LinearLayout) findViewById(R.id.hindijokes);
        mHindiJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), HindiJokes.class);
                startActivity(gotoLoveStory);
            }
        });

        mHusbandWifeJokes = (LinearLayout) findViewById(R.id.husbandwifejokes);
        mHusbandWifeJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), HusbandWifeJokes.class);
                startActivity(gotoLoveStory);
            }
        });

        mSantaBantaJokes = (LinearLayout) findViewById(R.id.santabantajokes);
        mSantaBantaJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), SantaBantaJokes.class);
                startActivity(gotoLoveStory);
            }
        });

        mSharabiJokes = (LinearLayout) findViewById(R.id.sharabijokes);
        mSharabiJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), SharabiJokes.class);
                startActivity(gotoLoveStory);
            }
        });
    }
}
