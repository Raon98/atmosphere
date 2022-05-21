package com.example.atmosphere;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Happy extends AppCompatActivity {


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
                Intent main = new Intent(Happy.this,ListActivity.class);
                startActivity(main);
            }
        });


        RecyclerView recyclerView = findViewById(R.id.happyView1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();

        dataList.add(new CardItem("박재범 -  All i Wanna Do(K)",R.drawable.f1));
        dataList.add(new CardItem("Planetarium Records - Hocus Pocus",R.drawable.f2));
        dataList.add(new CardItem("DPR LIVE - Martini Blue",R.drawable.f3));
        dataList.add(new CardItem("SOLE - RIDE(Feat. THAMA)",R.drawable.f4));
        dataList.add(new CardItem("Xydo - #OOTD(Feat. Coogie)",R.drawable.f5));



        HappyAdapter adapter = new HappyAdapter(dataList);
        adapter.setOnitemClickListener(new HappyAdapter.OnitemClickListener() {
            @Override
            public String onItemClick(int position) {
                switch(position){
                 case 0 :
                     Intent main = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Cz_D2nFVaXs"));
                     startActivity(main);
                     return null;
                 case 1 :
                        Intent main1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3t049kAS2go"));
                        startActivity(main1);
                        return null;
                 case 2 :
                        Intent main2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=czftJ7E7wa4"));
                        startActivity(main2);
                        return null;
                 case 3 :
                        Intent main3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PsIMSIh_snM"));
                        startActivity(main3);
                        return null;
                 case 4 :
                        Intent main4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LWbbl9YAFls"));
                        startActivity(main4);
                        return null;
                }
                return null;
            }
        });
        recyclerView.setAdapter(adapter);
    }
}