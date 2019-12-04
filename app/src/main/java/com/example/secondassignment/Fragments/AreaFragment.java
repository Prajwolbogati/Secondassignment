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
public class AreaFragment extends Fragment implements View.OnClickListener {
    EditText etarea;
    Button btnareaofcircle;
    TextView tvarea;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area, container, false);
        etarea = view.findViewById(R.id.etarea);
        btnareaofcircle = view.findViewById(R.id.btnareaofcircle);
        tvarea = view.findViewById(R.id.tvarea);
        btnareaofcircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etarea.getText())) {
            etarea.setError("Enter Number ");
            ;
            return;
        }
        int radius = Integer.parseInt(etarea.getText().toString());
        int result = radius * radius * (22 / 7);

        tvarea.setText("area of circle is : " + result);
    }
    }

