package com.maintinfo.maintinfo_android_v2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.maintinfo.maintinfo_android_v2.fragments.OneFragment;
import com.maintinfo.maintinfo_android_v2.fragments.TwoFragment;

import java.util.List;

/**
 * Created by Romain on 03/03/2016.
 */public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public ViewPagerAdapter(FragmentManager manager){
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = new Fragment();
        switch(position){
            case 1: fragment =  new TwoFragment();
            break;
            default: fragment =  new OneFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    public void addFragment(Fragment fragment){

        fragments.add(fragment);
    }

    public List<Fragment> getFragments() {
        return fragments;
    }

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
    }
}
