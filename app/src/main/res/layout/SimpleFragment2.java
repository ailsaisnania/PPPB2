package com.example.tugas1papb_ailsa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SimpleFragment2 extends Fragment {

    public SimpleFragment2() {
        // Required empty public constructor
    }

    public static SimpleFragment2 newInstance(){
        return new SimpleFragment2();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_simple2, container, false);
        return view;


    }
}