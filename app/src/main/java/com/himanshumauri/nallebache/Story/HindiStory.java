package com.himanshumauri.nallebache.Story;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

public class HindiStory extends AppCompatActivity {
    private ListView listView;
    DatabaseReference databaseReference;
    private List<String> title_list, story_list, moral_list;
    private ArrayAdapter<String> adapter;
    private MyStory myStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_data_view);

        listView = findViewById(R.id.viewList);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("story").child("hindistory");
        databaseReference.keepSynced(true);

        myStory = new MyStory();
        title_list = new ArrayList<>();
        story_list = new ArrayList<>();
        moral_list = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.storyitem,R.id.itemText,title_list);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                title_list.clear();
                story_list.clear();
                moral_list.clear();

                for (DataSnapshot ds :dataSnapshot.getChildren()){
                    myStory = ds.getValue(MyStory.class);
                    if (myStory != null) {
                        title_list.add(myStory.getTitle());
                    }
                    if (myStory != null) {
                        story_list.add(myStory.getStory());
                    }
                    if (myStory != null) {
                        moral_list.add(myStory.getMoral());
                    }
                }
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(HindiStory.this, ReadStory.class);
                        String p = story_list.get(position);
                        intent.putExtra("key",p);
                        startActivity(intent);
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
