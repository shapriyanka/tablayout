package com.example.food;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Loginadapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public Loginadapter(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs=totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Logintabfragment loginTabFragment=new Logintabfragment();
                return loginTabFragment;

            case 1:

                Signuptabfragment signupTabFragment=new Signuptabfragment();
                return signupTabFragment;

        default:
                return null;
        }
    }


}

