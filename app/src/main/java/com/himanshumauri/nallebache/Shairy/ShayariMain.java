package com.himanshumauri.nallebache.Shairy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.himanshumauri.nallebache.R;

public class ShayariMain extends Activity {

    private LinearLayout mLoveShayari, mLifeShayari, mDostiShayari, mBewafaShayari, mOtherShayari;
    private TextView mLovekeywords,mLifeKeywords, mDostiKeywords, mBewafaKeywords, mOtherKeywords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shayari_main);


        mLifeKeywords = findViewById(R.id.lifeKeyword);
        mLifeKeywords.setSelected(true);
        mDostiKeywords = findViewById(R.id.dostiKeyword);
        mDostiKeywords.setSelected(true);
        mBewafaKeywords = findViewById(R.id.bewafaKeyword);
        mBewafaKeywords.setSelected(true);
        mOtherKeywords = findViewById(R.id.otherKeyword);
        mOtherKeywords.setSelected(true);
        mLovekeywords = findViewById(R.id.loveKeyword);
        mLovekeywords.setSelected(true);


        mLifeShayari = findViewById(R.id.lifeshayari);
        mLifeShayari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLifeShayari = new Intent(getApplicationContext(), LifeShayari.class);
                startActivity(gotoLifeShayari);
            }
        });

        mOtherShayari = findViewById(R.id.othershayari);
        mOtherShayari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoOtherSayari = new Intent(getApplicationContext(),OtherShayari.class);
                startActivity(gotoOtherSayari);
            }
        });
        mDostiShayari = findViewById(R.id.dostishayari);
        mDostiShayari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoDostiShayari = new Intent(getApplicationContext(),DostiShayari.class);
                startActivity(gotoDostiShayari);
            }
        });
        mBewafaShayari = findViewById(R.id.bewafashayari);
        mBewafaShayari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoBewafaShayari = new Intent(getApplicationContext(),BewafaShayari.class);
                startActivity(gotoBewafaShayari);
            }
        });
        mLoveShayari = findViewById(R.id.loveshayari);
        mLoveShayari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoBewafaShayari = new Intent(getApplicationContext(), LoveShayari.class);
                startActivity(gotoBewafaShayari);
            }
        });
    }
}
