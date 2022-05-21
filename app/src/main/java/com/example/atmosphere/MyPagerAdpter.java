package com.example.atmosphere.dummy;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.atmosphere.Main1;
import com.example.atmosphere.Main2;
import com.example.atmosphere.Main3;
import com.example.atmosphere.Main4;

import java.util.ArrayList;

public class MyPagerAdpter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;

    public MyPagerAdpter(FragmentManager fm) {
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position) {
            case 0:
                return "HAPPY";
            case 1:
                return "SAD";
            case 2:
                return "IRRITATION";
            case 3:
                return "LOVE";
            default:
                return null;
        }
    }
}
