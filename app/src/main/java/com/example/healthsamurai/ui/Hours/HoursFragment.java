package com.example.healthsamurai.ui.Hours;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.healthsamurai.R;

public class HoursFragment extends Fragment {

    private HoursViewModel hoursViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hoursViewModel =
                ViewModelProviders.of(this).get(HoursViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hours, container, false);
        return root;
    }
}