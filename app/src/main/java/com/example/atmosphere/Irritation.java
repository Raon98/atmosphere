package com.example.atmosphere;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Irritation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Irritation.this,ListActivity.class);
                startActivity(main);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.happyView1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();

        dataList.add(new CardItem("이바다 - 파란꽃",R.drawable.i1));
        dataList.add(new CardItem("이바다 - 야몽음인",R.drawable.i2));
        dataList.add(new CardItem("DPR LIVE - JASMINE",R.drawable.i3));
        dataList.add(new CardItem("Hoody - 한강",R.drawable.i4));
        dataList.add(new CardItem("CODE KUNST - 꽃(flower) 꽃",R.drawable.i5));



        HappyAdapter adapter = new HappyAdapter(dataList);
        adapter.setOnitemClickListener(new HappyAdapter.OnitemClickListener() {
            @Override
            public String onItemClick(int position) {
                switch(position){
                    case 0 :
                        Intent main = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aPNCP1IEF4g"));
                        startActivity(main);
                        return null;
                    case 1 :
                        Intent main1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4c0h399QOmM"));
                        startActivity(main1);
                        return null;
                    case 2 :
                        Intent main2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Jg9NbDizoPM"));
                        startActivity(main2);
                        return null;
                    case 3 :
                        Intent main3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-mtlIhSY9W8"));
                        startActivity(main3);
                        return null;
                    case 4 :
                        Intent main4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=m8Z-YANwihM"));
                        startActivity(main4);
                        return null;
                }
                return null;
            }
        });
        recyclerView.setAdapter(adapter);
    }
}