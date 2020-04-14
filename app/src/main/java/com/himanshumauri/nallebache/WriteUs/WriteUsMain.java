package com.himanshumauri.nallebache.WriteUs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.himanshumauri.nallebache.R;

public class WriteUsMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writeus_main);

        LinearLayout Shayari = findViewById(R.id.shayariwrite);
        LinearLayout Jokes = findViewById(R.id.jokesWrite);
        LinearLayout Quote = findViewById(R.id.quoteWrite);
        LinearLayout Story = findViewById(R.id.storyWrite);

        Shayari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ShayariWriteUs.class);
                startActivity(intent);
            }
        });
        Jokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JokesWriteUs.class);
                startActivity(intent);
            }
        });
        Quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),QuoteWriteUs.class);
                startActivity(intent);
            }
        });
        Story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StoryWriteUs.class);
                startActivity(intent);
            }
        });

    }
}
