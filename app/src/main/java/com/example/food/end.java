package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;




        public class end extends AppCompatActivity {

            ViewPager viewPager;
            TabLayout tabLayout;

            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                requestWindowFeature(Window.FEATURE_NO_TITLE);
                this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
                getSupportActionBar().hide();
                setContentView(R.layout.activity_end);


                viewPager=findViewById(R.id.viewPager);
                tabLayout=findViewById(R.id.tabLayout);


                tabLayout.addTab(tabLayout.newTab().setText("LogIn"));
                tabLayout.addTab(tabLayout.newTab().setText("Sign In"));
                tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


               final Loginadapter adapter=new Loginadapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
                viewPager.setAdapter(adapter);

               viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            }
        }

