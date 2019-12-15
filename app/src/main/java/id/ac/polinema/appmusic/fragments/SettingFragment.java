package id.ac.polinema.appmusic.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import id.ac.polinema.appmusic.R;

public class SettingFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}