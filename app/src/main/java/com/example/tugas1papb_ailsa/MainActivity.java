package com.example.tugas1papb_ailsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonaction;
    private View fragment;
    private boolean isFragmentDisplayed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonaction = findViewById(R.id.kelebihan);
        fragment = findViewById(R.id.fragment1);

        buttonaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFragmentDisplayed){
                    displayFragment();
                }
                else {
                    closeFragment();
                }
            }
        });
    }
    public void displayFragment() {
        SimpleFragment2 simpleFragment = SimpleFragment2.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        fragmentTransaction.add(R.id.fragment_container, simpleFragment).addToBackStack(null).commit();
        fragment.setVisibility(View.GONE);
        buttonaction.setText("mantap!");
        isFragmentDisplayed = true;
    }

    public void closeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        SimpleFragment2 simpleFragment = (SimpleFragment2) fragmentManager
                .findFragmentById(R.id.fragment_container);
        if (simpleFragment != null) {
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.remove(simpleFragment).commit();
        }
        fragment.setVisibility(View.VISIBLE);
        buttonaction.setText("Lihat Kelebihan");
        isFragmentDisplayed = false;
    }

}