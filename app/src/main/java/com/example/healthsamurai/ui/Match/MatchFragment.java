package com.example.healthsamurai.ui.Match;

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

public class MatchFragment extends Fragment {

    private MatchViewModel matchViewModel;
    private Button btn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        matchViewModel =
                ViewModelProviders.of(this).get(MatchViewModel.class);

        final View root = inflater.inflate(R.layout.fragment_match, container, false);
        btn = root.findViewById(R.id.matchButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = root.findViewById(R.id.MatchInfoTextView);
                textView.setText("Helper/Helpie: Jason Marker\n" +
                        "School:\tMiddle School\n" +
                        "Role: Mentor\n"+
                        "Email: Test@gmail.com");
                textView.setTextSize(23);
            }
        });

        return root;
    }
}