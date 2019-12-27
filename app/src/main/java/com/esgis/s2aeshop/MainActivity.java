package com.esgis.s2aeshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.esgis.s2aeshop.fragments.HelpFragment;
import com.esgis.s2aeshop.fragments.HomeFragment;
import com.esgis.s2aeshop.fragments.LoginFragment;
import com.esgis.s2aeshop.fragments.NotificationsFragment;
import com.esgis.s2aeshop.fragments.ProfileFragment;
import com.esgis.s2aeshop.fragments.SettingsFragment;
import com.esgis.s2aeshop.fragments.StoresFragment;
import com.esgis.s2aeshop.fragments.TrackFragment;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    private FragmentTransaction fragmentTransaction;

    HomeFragment homeFragment;
    StoresFragment storesFragment;
    LoginFragment loginFragment;
    SettingsFragment settingsFragment;
    TrackFragment trackFragment;
    NotificationsFragment notificationsFragment;
    HelpFragment helpFragment;

    private String[] SUGESSION = {"AMAZONE", "GOOGLE", "FACEBOOK", "Aple", "SAMSUNG", "Lenevo", "Sony"};

    private MaterialSearchView materialSearchView;
    private LinearLayout linearLayoutParameter, deconneter;

    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initView();

        materialSearchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                //Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSearchViewClosed() {

            }
        });

        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT).show();
//                existe(SessionManager.getInstance(MainActivity.this).getUser().getToken(),
//                        ServerConfig.url_facture_existe, query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Toast.makeText(MainActivity.this, "change", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        homeFragment = new HomeFragment();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, homeFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.nav_stores:
                        storesFragment = new StoresFragment();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, storesFragment);
                        fragmentTransaction.commit();

                        break;
                    case R.id.nav_setting:
                        ProfileFragment profileFragment = new ProfileFragment();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, profileFragment);
                        fragmentTransaction.commit();
                        break;
                }

                return true;
            }
        });

        if (savedInstanceState == null){
            homeFragment = new HomeFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, homeFragment);
            fragmentTransaction.commit();
            bottomNavigationView.setSelectedItemId(R.id.nav_home);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem menuItem = menu.findItem(R.id.searchMenu);
        materialSearchView.setMenuItem(menuItem);

        return super.onCreateOptionsMenu(menu);
    }


    private void initView() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        materialSearchView = findViewById(R.id.searchView);
    }


//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.nav_home) {
//            initNavigation();
//        }
//        else if(id == R.id.nav_stores) {
//            storesFragment = new StoresFragment();
//            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment_container, storesFragment);
//            fragmentTransaction.commit();
//        }
//        else if (id == R.id.nav_login) {
//            loginFragment = new LoginFragment();
//            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment_container, loginFragment);
//            fragmentTransaction.commit();
//        }else if (id == R.id.nav_settings) {
//            settingsFragment = new SettingsFragment();
//            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment_container, settingsFragment);
//            fragmentTransaction.commit();
//        }else if (id == R.id.nav_track) {
//            trackFragment = new TrackFragment();
//            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment_container, trackFragment);
//            fragmentTransaction.commit();
//        }else if (id == R.id.nav_notifications) {
//            notificationsFragment = new NotificationsFragment();
//            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment_container, notificationsFragment);
//            fragmentTransaction.commit();
//        }else if (id == R.id.nav_help) {
//            helpFragment = new HelpFragment();
//            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment_container, helpFragment);
//            fragmentTransaction.commit();
//        }
//
//        this.drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
}
