package com.himanshumauri.nallebache.Shairy;

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

public class LifeShayari extends AppCompatActivity {
    private ListView listView;
    DatabaseReference databaseReference;
    List<String> ShayariList;
    private ArrayAdapter<String> adapter;
    MyShayari myShayari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_data_view);

        listView = findViewById(R.id.viewList);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("shairy").child("lifeshayari");
        databaseReference.keepSynced(true);

        myShayari = new MyShayari();
        ShayariList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.item,R.id.itemText,ShayariList);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    myShayari = ds.getValue(MyShayari.class);
                    if (myShayari != null) {
                        ShayariList.add(myShayari.getShayaritext());
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
