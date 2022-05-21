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

public class Love extends AppCompatActivity {

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
                Intent main = new Intent(Love.this,ListActivity.class);
                startActivity(main);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.happyView1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();

        dataList.add(new CardItem("베이빌론 - 처음 본 여자는 다 예뻐",R.drawable.y1));
        dataList.add(new CardItem("Colde - 와르르♥",R.drawable.y2));
        dataList.add(new CardItem("휘인,Jeff Bernat, B.O - 다라다",R.drawable.y3));
        dataList.add(new CardItem("마미손(Feat.원슈타인) - 사랑은",R.drawable.y4));
        dataList.add(new CardItem("박재범 - 곁에 있어주길",R.drawable.y5));



        HappyAdapter adapter = new HappyAdapter(dataList);
        adapter.setOnitemClickListener(new HappyAdapter.OnitemClickListener() {
            @Override
            public String onItemClick(int position) {
                switch(position){
                    case 0 :
                        Intent main = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HL6sQlOWeFw"));
                        startActivity(main);
                        return null;
                    case 1 :
                        Intent main1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNlrfhOAzpM"));
                        startActivity(main1);
                        return null;
                    case 2 :
                        Intent main2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=lUXy6Xh5y1A"));
                        startActivity(main2);
                        return null;
                    case 3 :
                        Intent main3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sRkXQDIommw"));
                        startActivity(main3);
                        return null;
                    case 4 :
                        Intent main4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YL-Mka8wQyg"));
                        startActivity(main4);
                        return null;
                }
                return null;
            }
        });
        recyclerView.setAdapter(adapter);
    }
}