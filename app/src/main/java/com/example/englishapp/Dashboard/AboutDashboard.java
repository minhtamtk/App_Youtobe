package com.example.englishapp.Dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.englishapp.R;

public class AboutDashboard extends Fragment {

    public AboutDashboard() {
        // Required empty public constructor
    }

    public static AboutDashboard newInstance() {
        AboutDashboard fragment = new AboutDashboard();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dashboard_about, container, false);
    }
}