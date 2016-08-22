package com.example.android.visitA2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout that includes the TabLayout and the ViewPager
        setContentView(R.layout.activity_main);

        // Find the ViewPager and attach to it the appropriate adapter
        ViewPager categoryPager = (ViewPager) findViewById(R.id.category_view_pager);
        categoryPager.setAdapter(new CategoryAdapter(this, getSupportFragmentManager()));

        // Find the TabLayout and configure it to work with the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.category_tab_layout);
        tabLayout.setupWithViewPager(categoryPager);
    }

}
