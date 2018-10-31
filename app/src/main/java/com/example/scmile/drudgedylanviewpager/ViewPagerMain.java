package com.example.scmile.drudgedylanviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerMain extends AppCompatActivity {
    private ViewPager mViewPager;
    private FragmentManager fragBoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_main);
        mViewPager = findViewById(R.id.MainPager);
        FragmentManager fragBoi = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragBoi) {
            @Override
            public Fragment getItem(int position) {
                switch(position){
                    case 0:
                        Fragment1 fragment1 = new Fragment1();
                        return fragment1;
                    case 1:
                        Fragment2 fragment2 = new Fragment2();
                        return fragment2;
                    case 2:
                        Fragment3 fragment3 = new Fragment3();
                        return fragment3;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }
}
