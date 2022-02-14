package com.example.android_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.android_fragments.Fragments.FirstFragment;
import com.example.android_fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.firstButtonId);
        btn2=findViewById(R.id.seondButtonId);
        linearLayout=findViewById(R.id.linearLayoutId);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment=new FirstFragment();

                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayoutId,firstFragment);
                transaction.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Naive approach
                SecondFragment secondFragment=new SecondFragment();

               // FragmentManager fragmentManager=getFragmentManager();
               // android.app.FragmentTransaction transaction=fragmentManager.beginTransaction();
                //transaction.replace(R.id.linerarLayoutId,secondFragment);
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayoutId,secondFragment);
                transaction.commit();


            }
        });
    }
}