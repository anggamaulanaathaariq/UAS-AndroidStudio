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
import id.ac.polinema.appmusic.actionmusics.ActionActivity;
import id.ac.polinema.appmusic.actionmusics.ActionActivity10;
import id.ac.polinema.appmusic.actionmusics.ActionActivity11;
import id.ac.polinema.appmusic.actionmusics.ActionActivity12;
import id.ac.polinema.appmusic.actionmusics.ActionActivity13;
import id.ac.polinema.appmusic.actionmusics.ActionActivity14;
import id.ac.polinema.appmusic.actionmusics.ActionActivity15;
import id.ac.polinema.appmusic.actionmusics.ActionActivity16;
import id.ac.polinema.appmusic.actionmusics.ActionActivity17;
import id.ac.polinema.appmusic.actionmusics.ActionActivity18;
import id.ac.polinema.appmusic.actionmusics.ActionActivity19;
import id.ac.polinema.appmusic.actionmusics.ActionActivity2;
import id.ac.polinema.appmusic.actionmusics.ActionActivity20;
import id.ac.polinema.appmusic.actionmusics.ActionActivity21;
import id.ac.polinema.appmusic.actionmusics.ActionActivity22;
import id.ac.polinema.appmusic.actionmusics.ActionActivity23;
import id.ac.polinema.appmusic.actionmusics.ActionActivity3;
import id.ac.polinema.appmusic.actionmusics.ActionActivity4;
import id.ac.polinema.appmusic.actionmusics.ActionActivity5;
import id.ac.polinema.appmusic.actionmusics.ActionActivity6;
import id.ac.polinema.appmusic.actionmusics.ActionActivity7;
import id.ac.polinema.appmusic.actionmusics.ActionActivity8;
import id.ac.polinema.appmusic.actionmusics.ActionActivity9;
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
                openfragment(new HomeFragment());
                return true;
            case R.id.action_music:
                fragment = new MusicFragment();
                break;
            case R.id.action_album:
                fragment = new AlbumFragment();
                break;
        }
        return loadFragment(fragment);
    }

    private void openfragment(HomeFragment fragment) {
        openFragment(fragment, false);
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
    public void btsdope(View view) {
        Intent intent = new Intent(this, ActionActivity2.class);
        startActivity(intent);
    }
    public void boyinluv(View view) {
        Intent intent = new Intent(this, ActionActivity3.class);
        startActivity(intent);
    }
    public void btsanpanman(View view) {
        Intent intent = new Intent(this, ActionActivity4.class);
        startActivity(intent);
    }
    public void fakelove(View view) {
        Intent intent = new Intent(this, ActionActivity5.class);
        startActivity(intent);
    }
    public void btsfire(View view) {
        Intent intent = new Intent(this, ActionActivity6.class);
        startActivity(intent);
    }
    public void idol(View view) {
        Intent intent = new Intent(this, ActionActivity7.class);
        startActivity(intent);
    }
    public void btsmakeit(View view) {
        Intent intent = new Intent(this, ActionActivity8.class);
        startActivity(intent);
    }
    public void btsbst(View view) {
        Intent intent = new Intent(this, ActionActivity9.class);
        startActivity(intent);
    }
    public void v(View view) {
        Intent intent = new Intent(this, ActionActivity10.class);
        startActivity(intent);
    }
    public void lms(View view) {
        Intent intent = new Intent(this, ActionActivity11.class);
        startActivity(intent);
    }
    public void ms(View view) {
        Intent intent = new Intent(this, ActionActivity12.class);
        startActivity(intent);
    }
    public void mic(View view) {
        Intent intent = new Intent(this, ActionActivity13.class);
        startActivity(intent);
    }
    public void nottoday(View view) {
        Intent intent = new Intent(this, ActionActivity14.class);
        startActivity(intent);
    }
    public void lights(View view) {
        Intent intent = new Intent(this, ActionActivity15.class);
        startActivity(intent);
    }
    public void gogo(View view) {
        Intent intent = new Intent(this, ActionActivity16.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(this, ActionActivity17.class);
        startActivity(intent);
    }
    public void dionysus(View view) {
        Intent intent = new Intent(this, ActionActivity18.class);
        startActivity(intent);
    }
    public void jhope(View view) {
        Intent intent = new Intent(this, ActionActivity19.class);
        startActivity(intent);
    }
    public void mikromos(View view) {
        Intent intent = new Intent(this, ActionActivity20.class);
        startActivity(intent);
    }
    public void nomoredream(View view) {
        Intent intent = new Intent(this, ActionActivity21.class);
        startActivity(intent);
    }
    public void btswab(View view) {
        Intent intent = new Intent(this, ActionActivity22.class);
        startActivity(intent);
    }
    public void ineedu(View view) {
        Intent intent = new Intent(this, ActionActivity23.class);
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