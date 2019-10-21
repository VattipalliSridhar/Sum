package vmax.com.sumuhurtham.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.menu_activities.About_Activity;
import vmax.com.sumuhurtham.activities.menu_activities.Fact_Activity;
import vmax.com.sumuhurtham.activities.menu_activities.Language_Activity;
import vmax.com.sumuhurtham.activities.menu_activities.Others_Activity;
import vmax.com.sumuhurtham.activities.menu_activities.Quick_Contact_Activity;
import vmax.com.sumuhurtham.activities.menu_activities.Slokas_Activity;
import vmax.com.sumuhurtham.activities.menu_activities.Why_Us_Activity;
import vmax.com.sumuhurtham.adapters.MenuAdapter;
import vmax.com.sumuhurtham.classes.LocaleHelper;
import vmax.com.sumuhurtham.classes.UI_Class;
import vmax.com.sumuhurtham.fragments.Contact_Fragment;
import vmax.com.sumuhurtham.fragments.Gallery_Fragment;
import vmax.com.sumuhurtham.fragments.Home_Fragment;
import vmax.com.sumuhurtham.fragments.Muhurtham_Fragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;


    private BottomNavigationView bottom_navigation;
    private ListView menu_list_view;

    private int menu_item_icon[] = {R.drawable.ic_aboutus, R.drawable.ic_whyus, R.drawable.ic_the_fact,R.drawable.ic_muhurtham_color, R.drawable.ic_get_slokaas, R.drawable.left_lan,
            R.drawable.ic_others, R.drawable.ic_quick_contact};
    private String[] menu_item_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolBar_home);


        AppBarLayout appBarLayout = findViewById(R.id.app_bar_layout_home);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = true;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.setTitle("" + getResources().getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbarLayout.setTitle(" ");//careful there should a space between double quote otherwise it wont work
                    isShow = false;
                }
            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                //actions upon opening slider
                //presently nothing
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                //actions upon closing slider
                //presently nothing

            }
        };
        //Drawer Toggle Object made
        drawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();


        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(this);
        bottom_navigation.setItemIconTintList(null);
        // disableShiftMode(bottom_navigation);
        disbleAllOption();
        bottom_navigation.getMenu().getItem(0).setChecked(true);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_container, new Home_Fragment()).commit();

        menu_item_name = this.getResources().getStringArray(R.array.menu_item_array);
        menu_list_view = findViewById(R.id.menu_list_view);
        MenuAdapter menuAdapter = new MenuAdapter(MainActivity.this, menu_item_icon, menu_item_name);
        menu_list_view.setAdapter(menuAdapter);
        menu_list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                FragmentManager fm = getSupportFragmentManager();
                for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
                    fm.popBackStack();
                }


                if (position == 0) {
                    Log.e("msg", "0");
                    startActivity(new Intent(MainActivity.this, About_Activity.class));
                }
                if (position == 1) {
                    Log.e("msg", "1");
                    startActivity(new Intent(MainActivity.this, Why_Us_Activity.class));
                }
                if (position == 2) {
                    Log.e("msg", "2");
                    startActivity(new Intent(MainActivity.this, Fact_Activity.class));
                }if (position == 3) {
                    Log.e("msg", "3");
                    bottom_navigation.getMenu().getItem(1).setChecked(true);
                    Muhurtham_Fragment muhurtham_fragment = new Muhurtham_Fragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_container, muhurtham_fragment)
                            .addToBackStack(null)
                            .commit();
                }
                if (position == 4) {
                    Log.e("msg", "3");

                    startActivity(new Intent(MainActivity.this, Slokas_Activity.class));
                }
                if (position == 5) {
                    Log.e("msg", "4");
                    startActivity(new Intent(MainActivity.this, Language_Activity.class));
                }
                if (position == 6) {

                    startActivity(new Intent(MainActivity.this, Others_Activity.class));
                }
                if (position == 7) {

                    startActivity(new Intent(MainActivity.this, Quick_Contact_Activity.class));
                }

                drawerLayout.closeDrawer(GravityCompat.START);

            }
        });
    }

    private void disbleAllOption() {
        bottom_navigation.getMenu().findItem(R.id.action_home).setChecked(false);
        bottom_navigation.getMenu().findItem(R.id.action_muhurtham).setChecked(false);
        bottom_navigation.getMenu().findItem(R.id.action_gallery).setChecked(false);
        bottom_navigation.getMenu().findItem(R.id.action_contact).setChecked(false);
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        FragmentManager fm = getSupportFragmentManager();
        for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
        disbleAllOption();
        switch (menuItem.getItemId()) {

            case R.id.action_home:

                getSupportFragmentManager().beginTransaction().add(R.id.frame_container, new Home_Fragment()).commit();

                break;
            case R.id.action_muhurtham:


                Muhurtham_Fragment muhurtham_fragment = new Muhurtham_Fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container, muhurtham_fragment)
                        .addToBackStack(null)
                        .commit();


                break;
            case R.id.action_gallery:

                Gallery_Fragment gallery_fragment = new Gallery_Fragment();
                FragmentTransaction gallery_fragment_transaction = getSupportFragmentManager().beginTransaction();
                gallery_fragment_transaction.replace(R.id.frame_container, gallery_fragment)
                        .addToBackStack(null)
                        .commit();


                break;
            case R.id.action_contact:

                Contact_Fragment fragment1 = new Contact_Fragment();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frame_container, fragment1)
                        .addToBackStack(null)
                        .commit();

                break;

        }
        return true;
    }


    @Override
    public void onBackPressed() {
        drawerLayout.closeDrawer(GravityCompat.START);
        FragmentManager fm = getSupportFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {

            Log.e("DashBoard", "popping backstack");
            fm.popBackStack();
            bottom_navigation.getMenu().getItem(0).setChecked(true);
        } else {

            super.onBackPressed();
        }
    }
}
