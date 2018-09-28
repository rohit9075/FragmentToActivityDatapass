package com.rohit.fragmenttoactivitydatapass;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showFragment(); // show fragment method call

    }




// method add the fragment to activity dynamically
    private void showFragment() {
        FirstFragment firstFragment = new FirstFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.add(R.id.main_container,firstFragment, "firstFragment");

        transaction.commit();
    }
}
