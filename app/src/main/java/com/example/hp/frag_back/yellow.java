package com.example.hp.frag_back;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class yellow extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container=(ViewGroup)inflater.inflate(R.layout.activity_yellow,container,false);
        Button b=(Button)container.findViewById(R.id.back1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue b=new blue();
                android.support.v4.app.FragmentManager fm=getFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                 ft.replace(R.id.frag,b);
                ft.addToBackStack(null);
                fm.popBackStack();
                ft.commit();
            }
        });
        return container;
    }
}
