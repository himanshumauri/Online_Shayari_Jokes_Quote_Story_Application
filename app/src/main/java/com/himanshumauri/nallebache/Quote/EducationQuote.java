package com.himanshumauri.nallebache.Quote;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.himanshumauri.nallebache.R;

import java.util.ArrayList;
import java.util.List;

public class EducationQuote extends AppCompatActivity {
    private ListView listView;
    DatabaseReference databaseReference;
    List<String> QuoteList;
    private ArrayAdapter<String> adapter;
    private MyQuotes myQuotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_data_view);

        listView = findViewById(R.id.viewList);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("quotes").child("educationquotes").child("quote");
        databaseReference.keepSynced(true);
        myQuotes = new MyQuotes();
        QuoteList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.item,R.id.itemText,QuoteList);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    myQuotes = ds.getValue(MyQuotes.class);

                    if (myQuotes != null) {
                        QuoteList.add(myQuotes.getQuotetext());
                    }
                }
                listView.setAdapter(adapter);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
