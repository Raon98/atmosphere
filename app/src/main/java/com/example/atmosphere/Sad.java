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

public class Sad extends AppCompatActivity {

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
                Intent main = new Intent(Sad.this,ListActivity.class);
                startActivity(main);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.happyView1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();

        dataList.add(new CardItem("AnonyMous Artists - BLUE(Art. YELLA(옐라)",R.drawable.g1));
        dataList.add(new CardItem("Rick Bridges - 빗길(Feat. 최예근)",R.drawable.g2));
        dataList.add(new CardItem("기리보이 - 빈집",R.drawable.g3));
        dataList.add(new CardItem("Leellamarz & TOIL - 인간중독(Feat. 유라)",R.drawable.g4));
        dataList.add(new CardItem("미아 - 오늘은 다를거야(Feat. nafla)",R.drawable.g5));



        HappyAdapter adapter = new HappyAdapter(dataList);
        adapter.setOnitemClickListener(new HappyAdapter.OnitemClickListener() {
            @Override
            public String onItemClick(int position) {
                switch(position){
                    case 0 :
                        Intent main = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3TWtnHnx9mY"));
                        startActivity(main);
                        return null;
                    case 1 :
                        Intent main1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vli0PkeMs1E"));
                        startActivity(main1);
                        return null;
                    case 2 :
                        Intent main2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PA8dB2DjjJ8"));
                        startActivity(main2);
                        return null;
                    case 3 :
                        Intent main3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iKH4nEGZ2Cg"));
                        startActivity(main3);
                        return null;
                    case 4 :
                        Intent main4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BxMoi2VoYME"));
                        startActivity(main4);
                        return null;
                }
                return null;
            }
        });
        recyclerView.setAdapter(adapter);
    }
}