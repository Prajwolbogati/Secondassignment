package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.Fragments.AreaFragment;
import com.example.secondassignment.Fragments.AutomorphicFragment;
import com.example.secondassignment.Fragments.PalindromeFragment;
import com.example.secondassignment.Fragments.ReverseFragment;
import com.example.secondassignment.Fragments.RevstringFragment;
import com.example.secondassignment.Fragments.SumFragment;

public class MainActivity extends AppCompatActivity {
    Button btnsum,btnarea,btnreverse,btnpalindrome,btnautomophic,btnreverses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsum=findViewById(R.id.btnsum);
        btnarea=findViewById(R.id.btnarea);
        btnreverse=findViewById(R.id.btnreverse);
        btnpalindrome=findViewById(R.id.btnpalindrome);
        btnautomophic=findViewById(R.id.btnautomophic);
        btnreverses=findViewById(R.id.btnreverses);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment sumFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,sumFragment);
                fragmentTransaction.commit();
            }
        });
        btnarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AreaFragment areaofCircle=new AreaFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,areaofCircle);
                fragmentTransaction.commit();
            }
        });

        btnreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseFragment reverseFragment=new ReverseFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnautomophic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,automorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnreverses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                RevstringFragment stringRevFragment=new RevstringFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,stringRevFragment);
                fragmentTransaction.commit();

            }
        });

    }
}
