package com.example.englishapp.Dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.englishapp.ChannelDashboardFragment;
import com.example.englishapp.R;

public class VideosDashboard extends Fragment {

    public VideosDashboard() {
        // Required empty public constructor
    }

    public static VideosDashboard newInstance() {
        VideosDashboard fragment = new VideosDashboard();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dashboard_videos, container, false);
    }
}