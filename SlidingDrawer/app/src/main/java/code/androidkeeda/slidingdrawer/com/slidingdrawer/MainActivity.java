package code.androidkeeda.slidingdrawer.com.slidingdrawer;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    ViewGroup actionBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBarLayout = (ViewGroup) getLayoutInflater().inflate(R.layout.custom_toolbar, null);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(actionBarLayout);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff);

        initNavigationDrawer();
    }

    public void initNavigationDrawer() {

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id) {
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.about:
                        Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.blog:
                        Toast.makeText(getApplicationContext(), "Blog", Toast.LENGTH_SHORT).show();
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.support:
                        Toast.makeText(getApplicationContext(), "Support", Toast.LENGTH_SHORT).show();
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.contact:
                        Toast.makeText(getApplicationContext(), "Contact", Toast.LENGTH_SHORT).show();
                        mDrawerLayout.closeDrawers();
                        break;
                }
                return true;
            }
        });
        View header = mNavigationView.getHeaderView(0);


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, (Toolbar) actionBarLayout, R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerClosed(View v) {
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
            }
        };
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}