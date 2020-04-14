package com.himanshumauri.nallebache.Jokes;

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

public class HusbandWifeJokes extends AppCompatActivity {
    private ListView listView;
    DatabaseReference databaseReference;
    List<String> JokeList;
    private ArrayAdapter<String> adapter;
    MyJokes myJokes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_data_view);

        listView = findViewById(R.id.viewList);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("jokes").child("husbandwifejokes");
        databaseReference.keepSynced(true);

        myJokes = new MyJokes();
        JokeList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.item,R.id.itemText,JokeList);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    myJokes = ds.getValue(MyJokes.class);
                    if (myJokes != null) {
                        JokeList.add(myJokes.getJokestext());
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
