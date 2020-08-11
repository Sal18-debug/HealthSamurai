package com.example.healthsamurai.ui.Info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.healthsamurai.R;

public class InfoFragment extends Fragment {

    private InfoViewModel infoViewModel;
    private Button btn;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        infoViewModel =
                ViewModelProviders.of(this).get(InfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_info, container, false);
        btn = root.findViewById(R.id.eventButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Events",Toast.LENGTH_SHORT).show();
            }
        });

        btn = root.findViewById(R.id.gameButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Game",Toast.LENGTH_SHORT).show();
            }
        });

        btn = root.findViewById(R.id.infoButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Info",Toast.LENGTH_SHORT).show();
            }
        });

        btn = root.findViewById(R.id.quizButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Quiz",Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}