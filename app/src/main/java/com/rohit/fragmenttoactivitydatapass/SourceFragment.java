package com.rohit.fragmenttoactivitydatapass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SourceFragment extends Fragment {

    private EditText mEmailEditText;


    public SourceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_source, container, false);

        mEmailEditText = view.findViewById(R.id.editTextEmail);
        Button mSendDataButton = view.findViewById(R.id.button_send);

        mSendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToActivity();
            }
        });

        return view;
    }

    private void sendDataToActivity() {

        String email = mEmailEditText.getText().toString();

        MyListener myListener = (MyListener) getActivity();

        myListener.sendData(email);


    }

}
