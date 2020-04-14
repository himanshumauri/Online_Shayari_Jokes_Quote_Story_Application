package com.himanshumauri.nallebache;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ItemFunction extends AppCompatActivity {
    TextView mTextView;
    ImageButton mShare, mCopy;
    ClipData clipData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_data_view);
        mTextView = findViewById(R.id.itemText);
        mShare = findViewById(R.id.sharebtn);
        mCopy = findViewById(R.id.copybtn);
        final ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        mCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clipboardManager != null) {
                    clipboardManager.clearPrimaryClip();
                }

                String txt = mTextView.getText().toString();
                clipData = ClipData.newPlainText("text",txt);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(clipData);
                }

                Toast.makeText(getApplicationContext(),"Text Copied", Toast.LENGTH_SHORT).show();
            }
        });

        mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = mTextView.getText().toString();
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });
    }
}
