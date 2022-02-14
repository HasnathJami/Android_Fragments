package com.example.android_fragments.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android_fragments.R;
import com.example.android_fragments.SecondActivity;

import org.w3c.dom.Text;


public class FirstFragment extends Fragment {


    TextView tv;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first, container, false);

        // we can do all tasks under this fragment here.
        tv=view.findViewById(R.id.foTvId);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(), SecondActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}