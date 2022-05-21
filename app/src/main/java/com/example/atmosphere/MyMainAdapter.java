package com.example.atmosphere;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import java.util.ArrayList;

public class MyMainAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;

    public MyMainAdapter(FragmentManager fm) {
        super(fm);

        mData = new ArrayList<>();
        mData.add(new Main1());
        mData.add(new Main2());
        mData.add(new Main3());
        mData.add(new Main4());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { //포지션번째를 리턴해줌
        return mData.get(position);
    }

    @Override
    public int getCount() { //아이템의 개수
        return mData.size();
    }

}
