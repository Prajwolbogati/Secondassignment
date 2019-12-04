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
public class PalindromeFragment extends Fragment implements View.OnClickListener {
    private EditText etpali;
    private TextView tvpali;
    private Button btnpali;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etpali = view.findViewById(R.id.etpali);
        tvpali = view.findViewById(R.id.tvpali);
        btnpali = view.findViewById(R.id.btnpali);
        btnpali.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etpali.getText())) {
            etpali.setError("Enter Something");
            ;
            return;
        }

        int r, sum = 0, temp;
        int n = Integer.parseInt(etpali.getText().toString());//It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
            if (temp == sum)
                tvpali.setText("It is palindrome Number");
            else
                tvpali.setText("It is not a palindrome Number");

        }
    }
}



