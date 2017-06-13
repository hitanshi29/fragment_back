package com.example.hp.frag_back;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class blue extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container=(ViewGroup)inflater.inflate(R.layout.blue,container,false);
        Button n=(Button)container.findViewById(R.id.next);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red r1=new red();
                android.support.v4.app.FragmentManager fm=getFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frag,r1);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return container;
    }
}
