package mobile.kinectorfamily;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Fragments.Family_Fragment;
import Fragments.Me_Fragment;
import Fragments.Photo_fragment;
import Fragments.Vines;


public class Home extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_icon_text_tabs);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);


        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                int tab1 = tab.getPosition();
//                 tabLayout.getChildAt(tab1).setBackgroundColor(Color.RED);
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
        viewPager.setCurrentItem(2);
        setupTabIcons();
    }

    /**
     * Adding custom view to tab
     */
    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("           Vines");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.vines_bottom_logo, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("           Photos");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.new_photos_logo, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("           Family");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.new_family_logo, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);

        TextView tabfour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabfour.setText("          Settings");
        tabfour.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.settingg, 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabfour);


    }

    /**
     * Adding fragments to ViewPager
     *
     * @param viewPager
     */
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Vines(), "ONE");
        adapter.addFrag(new Photo_fragment(), "TWO");
        adapter.addFrag(new Family_Fragment(), "THREE");
        adapter.addFrag(new Me_Fragment(), "Four");


        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
