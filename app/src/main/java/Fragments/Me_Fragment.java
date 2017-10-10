package Fragments;

/**
 * Created by Mr singh on 9/6/2017.
 */

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import mobile.kinectorfamily.Account_setting;
import mobile.kinectorfamily.Cards;
import mobile.kinectorfamily.R;
import mobile.kinectorfamily.Upcoming_birthday;


public class Me_Fragment extends Fragment {
    String[] Me_Array = {"Username", "Notification", "People Chats", "Photos,Videos,Emoji",
            "Account", "Report a Problem", "Tell a Family Member"};

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.lv_me_listview, Me_Array);

        ListView listView = (ListView) view.findViewById(R.id.Lv_me);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 4) {
                    Intent i1 = new Intent(getActivity(), Account_setting.class);

                    startActivity(i1);

                    // getActivity()finish();
                    getActivity().overridePendingTransition(R.anim.slide_in_left,
                            R.anim.slide_out_left);
                }
            }
        });
    }


    public Me_Fragment() {
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
        return inflater.inflate(R.layout.me_layout, container, false);
    }

}
