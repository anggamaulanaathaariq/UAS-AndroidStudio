package id.ac.polinema.appmusic.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.appmusic.R;
import id.ac.polinema.appmusic.albums.AlbumBts;
import id.ac.polinema.appmusic.albums.AlbumBts2;
import id.ac.polinema.appmusic.albums.AlbumBts3;
import id.ac.polinema.appmusic.albums.AlbumBts4;
import id.ac.polinema.appmusic.albums.AlbumBts5;
import id.ac.polinema.appmusic.albums.AlbumBts6;
import id.ac.polinema.appmusic.fragments.AlbumFragment;
import id.ac.polinema.appmusic.fragments.BioFragment;
import id.ac.polinema.appmusic.fragments.HomeFragment;
import id.ac.polinema.appmusic.fragments.MusicFragment;
import id.ac.polinema.appmusic.fragments.SettingFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new BioFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_bio:
                fragment = new BioFragment();
                break;
            case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_music:
                fragment = new MusicFragment();
                break;
            case R.id.action_album:
                fragment = new AlbumFragment();
                break;
        }
        return loadFragment(fragment);
    }
    public void btnToast(View view) {
        Intent intent = new Intent(this, AlbumBts.class);
        startActivity(intent);
    }
    public void btnToast2(View view) {
        Intent intent = new Intent(this, AlbumBts2.class);
        startActivity(intent);
    }
    public void btnToast3(View view) {
        Intent intent = new Intent(this, AlbumBts3.class);
        startActivity(intent);
    }
    public void btnToast4(View view) {
        Intent intent = new Intent(this, AlbumBts4.class);
        startActivity(intent);
    }
    public void btnToast5(View view) {
        Intent intent = new Intent(this, AlbumBts5.class);
        startActivity(intent);
    }
    public void btnToast6(View view) {
        Intent intent = new Intent(this, AlbumBts6.class);
        startActivity(intent);
    }
    public void wizkhalifa(View view) {
        Intent intent = new Intent(this, ActionActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // TODO: open settings here using openFragment()
            openFragment(new SettingFragment());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    private void openFragment(Fragment fragment) {
        openFragment(fragment, false);
    }

    private void openFragment(Fragment fragment, boolean addToBackstack) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        if (addToBackstack)
            transaction.addToBackStack(null);
        transaction.commit();
    }
}