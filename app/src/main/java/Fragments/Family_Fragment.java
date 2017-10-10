package Fragments;

/**
 * Created by Mr singh on 9/6/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import mobile.kinectorfamily.Events;
import mobile.kinectorfamily.Family_tree;
import mobile.kinectorfamily.MainActivity;
import mobile.kinectorfamily.Phone_number_screen;
import mobile.kinectorfamily.R;
import mobile.kinectorfamily.Recepies;
import mobile.kinectorfamily.Upcoming_birthday;


public class Family_Fragment extends Fragment {
    RelativeLayout img_Birth_day,Family_tree,Recepies,Family_events;

    public Family_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        img_Birth_day=(RelativeLayout)view.findViewById(R.id.imageView10);
        Family_tree=(RelativeLayout)view.findViewById(R.id.imageView12);
        Recepies=(RelativeLayout)view.findViewById(R.id.imageView11);
        Family_events=(RelativeLayout)view.findViewById(R.id.imageView9);
        img_Birth_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Upcoming_birthday.class);

                startActivity(i1);

                getActivity().finish();
                getActivity().overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
        Family_tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Family_tree.class);

                startActivity(i1);

                getActivity().finish();
                getActivity().overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
        Recepies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Recepies.class);

                startActivity(i1);

                getActivity().finish();
                getActivity().overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
        Family_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Events.class);

                startActivity(i1);

                getActivity().finish();
                getActivity().overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.family_fragment_layout, container, false);
    }

}
