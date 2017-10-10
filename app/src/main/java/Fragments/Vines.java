package Fragments;

/**
 * Created by Mr singh on 9/6/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import adapter.family_contacts;
import mobile.kinectorfamily.R;


public class Vines extends Fragment {
    ListView Lv_Wines_contact;

    ArrayList<HashMap<String, String>> List_wine_contact = new ArrayList<HashMap<String, String>>();

    public Vines() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.vines_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Lv_Wines_contact = (ListView) view.findViewById(R.id.Lv_view);
        HashMap<String, String> Explorer = new HashMap<String, String>();

        // adding each child node to HashMap key => value
        Explorer.put("pic", "apple_screen");
        Explorer.put("Tittle", "Apple Screens");


        // adding contact to contact list
        List_wine_contact.add(Explorer);
        HashMap<String, String> Explorer2 = new HashMap<String, String>();

        // adding each child node to HashMap key => value
        Explorer2.put("pic", "apple_screen");
        Explorer2.put("Tittle", "Apple Screens");


        // adding contact to contact list
        List_wine_contact.add(Explorer2);
        family_contacts adapter = new family_contacts(getActivity(),
                List_wine_contact
        );
        Lv_Wines_contact.setAdapter(adapter);
        Lv_Wines_contact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Family_Fragment nextFrag= new Family_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.Container, nextFrag,"findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
