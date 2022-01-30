package com.herorickystudios.aprendaingles;

//programado por HeroRicky Games

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.herorickystudios.aprendaingles.fragments.BichosFragment;
import com.herorickystudios.aprendaingles.fragments.NumerosFragment;
import com.herorickystudios.aprendaingles.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        //Fragmentos
                        .add("Bichos", BichosFragment.class)
                        .add("Numeros", NumerosFragment.class)
                        //.add("Vogais", VogaisFragment.class)
                        .create()
        );

        viewPager.setAdapter( adapter );
        smartTabLayout.setViewPager( viewPager );

        //remover sombra da actionbar
        getSupportActionBar().setElevation(0);

    }
}