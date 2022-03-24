package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<contactModel> arrContacts = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerview = findViewById(R.id.recyclerContact);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));


      arrContacts.add(new contactModel(R.drawable.img, "Ayesha", "how are u"));
      arrContacts.add(new contactModel(R.drawable.img_1, "Menahil", "yes"));
      arrContacts.add(new contactModel(R.drawable.img_2, "Azka", "i am fine"));
      arrContacts.add(new contactModel(R.drawable.img_3, "Sujla", "948958"));
      arrContacts.add(new contactModel(R.drawable.img_4, "Fatima", "OK"));
      arrContacts.add(new contactModel(R.drawable.img_5, "Jaweria", "no"));
      arrContacts.add(new contactModel(R.drawable.img_6, "Rabia", "What are you Doing"));
      arrContacts.add(new contactModel(R.drawable.img_7, "Iqra", "Hello"));
      arrContacts.add(new contactModel(R.drawable.img_8, "Jannat", "how are you"));
      arrContacts.add(new contactModel(R.drawable.img_9, "Rumaissa", "Hi"));
      arrContacts.add(new contactModel(R.drawable.img_10, "Sana", "how are you"));
      arrContacts.add(new contactModel(R.drawable.img_11, "Zunaira", "Right"));

      RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,arrContacts);
      recyclerview.setAdapter(adapter);


    }
}