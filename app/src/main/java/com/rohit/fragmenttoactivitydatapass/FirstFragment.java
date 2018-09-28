package com.rohit.fragmenttoactivitydatapass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =   inflater.inflate(R.layout.fragment_first, container, false);

        EditText mEamilEditText = view.findViewById(R.id.edittext);
        Button mSendButton = view.findViewById(R.id.button);

        String email = mEamilEditText.getText().toString();


        return view;
    }

}
