package com.himanshumauri.nallebache.Story;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.himanshumauri.nallebache.R;

public class StoryMain extends AppCompatActivity {

    private TextView KidsStoryKeywords;
    private LinearLayout KidsStory,MotivationalStory, HindiStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_main);


        KidsStoryKeywords = (TextView) this.findViewById(R.id.kisdkeyword);
        KidsStoryKeywords.setSelected(true);

        TextView Motiv_Key = findViewById(R.id.moti_story_key);
        Motiv_Key.setSelected(true);

        TextView Hindi_keyword = findViewById(R.id.hindi_story_key);
        Hindi_keyword.setSelected(true);

        KidsStory = (LinearLayout) findViewById(R.id.kidsstory);
        KidsStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotokisdstory = new Intent(getApplicationContext(), com.himanshumauri.nallebache.Story.KidsStory.class);
                startActivity(gotokisdstory);
            }
        });
        MotivationalStory = (LinearLayout) findViewById(R.id.motivationalStory);
        MotivationalStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotokisdstory = new Intent(getApplicationContext(), com.himanshumauri.nallebache.Story.MotivationalStory.class);
                startActivity(gotokisdstory);
            }
        });
        HindiStory = (LinearLayout) findViewById(R.id.hindiStory);
        HindiStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotokisdstory = new Intent(getApplicationContext(), com.himanshumauri.nallebache.Story.HindiStory.class);
                startActivity(gotokisdstory);
            }
        });
    }
}
