package com.bawei.test.af_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * autour: 曾光春
 * date: 2016/11/29 21:09
 * update: 2016/11/29
 */

public class FragmentB extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = View.inflate(getActivity(),R.layout.fragmentb,null);
        TextView tv = (TextView)view.findViewById(R.id.tfb);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MainActivity.class);
                startActivity(intent);

            }
        });
        return view;//inflater.inflate(R.layout.fragmentb, container, false);
    }
}
