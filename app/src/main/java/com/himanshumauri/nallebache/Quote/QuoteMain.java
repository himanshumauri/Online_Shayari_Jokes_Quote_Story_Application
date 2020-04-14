package com.himanshumauri.nallebache.Quote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.himanshumauri.nallebache.R;

public class QuoteMain extends AppCompatActivity {
    private LinearLayout mEducation, mKnowledge, mLeadership, mMotivation, mSuccess, mHindi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote_main);


        TextView EducationKeyword = findViewById(R.id.educationkeywords);
        EducationKeyword.setSelected(true);
        TextView KnowledgeKeyword = findViewById(R.id.knowledgekeywords);
        KnowledgeKeyword.setSelected(true);
        TextView LeadershipKeyword = findViewById(R.id.leadershipkeywords);
        LeadershipKeyword.setSelected(true);
        TextView MotivationKeyword = findViewById(R.id.motivationkeywords);
        MotivationKeyword.setSelected(true);
        TextView SuccessKeyword = findViewById(R.id.successkeywords);
        SuccessKeyword.setSelected(true);
        TextView HindiKeywords = findViewById(R.id.hindikeywords);
        HindiKeywords.setSelected(true);




        mEducation = (LinearLayout) findViewById(R.id.educationquote);
        mEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), EducationQuote.class);
                startActivity(gotoLoveStory);
            }
        });

        mKnowledge = (LinearLayout) findViewById(R.id.knowledgequote);
        mKnowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), KnowledgeQuote.class);
                startActivity(gotoLoveStory);
            }
        });

        mLeadership = (LinearLayout) findViewById(R.id.leadershipquote);
        mLeadership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), LeadershipQuote.class);
                startActivity(gotoLoveStory);
            }
        });

        mMotivation = (LinearLayout) findViewById(R.id.motivationquote);
        mMotivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), MotivationQuote.class);
                startActivity(gotoLoveStory);
            }
        });

        mSuccess = (LinearLayout) findViewById(R.id.successquote);
        mSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), SuccessQuote.class);
                startActivity(gotoLoveStory);
            }
        });
        mHindi = (LinearLayout) findViewById(R.id.hindiquote);
        mHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLoveStory = new Intent(getApplicationContext(), HindiQuote.class);
                startActivity(gotoLoveStory);
            }
        });



    }
}
