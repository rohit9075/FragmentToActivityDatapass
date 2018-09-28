package com.rohit.fragmenttoactivitydatapass;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Source;

public class MainActivity extends AppCompatActivity implements MyListener {

    String receivedEmail;

    private TextView mEmailTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SourceFragment fragment = new SourceFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.container,fragment,"source").commit();


        mEmailTextView = findViewById(R.id.textViewReceivedEmail);
        Button mShowEmailButton = findViewById(R.id.showData_button);

        mShowEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEmailTextView.setText(receivedEmail);
            }
        });

    }

    @Override
    public void sendData(String email) {

        receivedEmail = email;

    }
}
