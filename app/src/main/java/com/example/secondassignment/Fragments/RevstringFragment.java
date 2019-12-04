package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RevstringFragment extends Fragment implements View.OnClickListener {
    Button btnsrev;
    TextView tvsrev;
    EditText etsrev;


    public RevstringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_revstring, container, false);
        btnsrev=view.findViewById(R.id.btnsrev);
        tvsrev=view.findViewById(R.id.tvsrev);
        etsrev=view.findViewById(R.id.etsrev);
        btnsrev.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etsrev.getText())) {
            etsrev.setError("Enter Something");
            return;
        }

        String str = etsrev.getText().toString();
        StringBuilder sb = new StringBuilder(str);
        tvsrev.setText("Reverse answer is :" +sb.reverse().toString());

    }
}



