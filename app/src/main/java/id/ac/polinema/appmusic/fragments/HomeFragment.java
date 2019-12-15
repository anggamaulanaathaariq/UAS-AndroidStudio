package id.ac.polinema.appmusic.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.HashSet;
import java.util.Set;

import id.ac.polinema.appmusic.R;
import id.ac.polinema.appmusic.activities.Application;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public static final String EDITTEXT_KEY = "edittext";
    public static final String LIST_KEY = "list";
    public static final String MULTI_SELECT_LIST_KEY = "multi_select_list";
    public static final String DROPDOWN_KEY = "dropdown";
    public static final String SEEKBAR_KEY = "seekbar";

    private SharedPreferences preferences;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = Application.getPreferences();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView edittextText = view.findViewById(R.id.text_edittext_preference);
        TextView listText = view.findViewById(R.id.text_list_preference);
        TextView multiListText = view.findViewById(R.id.text_multi_list_preference);
        TextView dropdownText = view.findViewById(R.id.text_dropdown_preference);
        TextView seekbarText = view.findViewById(R.id.text_seekbar_preference);

        String edittextValue = preferences.getString(EDITTEXT_KEY, null);
        String listValue = preferences.getString(LIST_KEY, null);
        Set<String> multiListValues = preferences.getStringSet(MULTI_SELECT_LIST_KEY, new HashSet<String>());
        String dropdownValue = preferences.getString(DROPDOWN_KEY, null);
        int seekbarValue = preferences.getInt(SEEKBAR_KEY, 0);
        String multiListString = "";
        for (String value : multiListValues) {
            multiListString += value + "\n";
        }

        edittextText.setText(edittextValue);
        listText.setText(listValue);
        multiListText.setText(multiListString);
        dropdownText.setText(dropdownValue);
        seekbarText.setText(String.valueOf(seekbarValue));
    }

}
