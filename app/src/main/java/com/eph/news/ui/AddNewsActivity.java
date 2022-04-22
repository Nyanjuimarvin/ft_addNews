package com.eph.news.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.eph.news.R;
import com.eph.news.databinding.ActivityAddNewsBinding;
import com.eph.news.models.News;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Timestamp;

public class AddNewsActivity extends AppCompatActivity {

    private ActivityAddNewsBinding addNewsBinding;
    private FirebaseDatabase database;
    private FirebaseAuth auth;
    private FirebaseUser user;
    private DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addNewsBinding = ActivityAddNewsBinding.inflate(getLayoutInflater());
        View view = addNewsBinding.getRoot();
        setContentView(view);

        addNewsBinding.saveNewsBtn.setOnClickListener(view1 ->{

            database = FirebaseDatabase.getInstance();
            reference = database.getReference("UserNews");
            DatabaseReference pushRef = reference.push();
            String pushId = pushRef.getKey();
            String newsTitle = addNewsBinding.TitleEditText.getText().toString().trim();
            String newsDescription = addNewsBinding.newsEditText.getText().toString().trim();
            Timestamp timeSaved = new Timestamp(System.currentTimeMillis());



            News news = new News(newsTitle,newsDescription,timeSaved,pushId);
            pushRef.setValue(news).addOnFailureListener(e -> {
                Log.d("save failed",e.getLocalizedMessage());
            });

            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });

    }
}