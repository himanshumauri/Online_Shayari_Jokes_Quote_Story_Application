package com.himanshumauri.nallebache.Story;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.himanshumauri.nallebache.R;

public class ReadStory extends AppCompatActivity {

    TextView Storytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_story);
        Storytext = findViewById(R.id.storyText);
        String t = getIntent().getStringExtra("key");
        Storytext.setText(t);
    }
}
