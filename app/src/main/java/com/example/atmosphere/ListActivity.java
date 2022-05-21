package com.example.atmosphere;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.atmosphere.dummy.MyPagerAdpter;
import com.google.android.material.tabs.TabLayout;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ViewPager viewPager = findViewById(R.id.pager); //페이저를 찾은후
        MyPagerAdpter adapter = new MyPagerAdpter(getSupportFragmentManager());
        viewPager.setAdapter(adapter); // 뷰페이저에 어댑터를 꽂아줌


        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);




    }
}