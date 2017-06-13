package com.example.hp.frag_back;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class red extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container=(ViewGroup)inflater.inflate(R.layout.activity_red,container,false);
        Button n,b;
        n=(Button)container.findViewById(R.id.next1);
        b=(Button)container.findViewById(R.id.back);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                blue b1=new blue();
                android.support.v4.app.FragmentManager fm=getFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frag,b1);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        n.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                yellow y=new yellow();
                android.support.v4.app.FragmentManager fm=getFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frag,y);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return container;
    }
}
