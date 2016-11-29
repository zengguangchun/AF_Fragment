package com.bawei.test.af_fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * autour: 曾光春
 * date: $date$ $time$
 * update: $date$
 */
public class FragmentA extends Fragment {

    private String TAG = "FragmentA";
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG,"----->onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"----->onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG,"----->onCreateView");
       View view = View.inflate(getActivity(),R.layout.fragmenta,null);
        TextView tv = (TextView)view.findViewById(R.id.tf);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MainActivity.class);
                startActivity(intent);

            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG,"----->onActivityCreated");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG,"----->onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG,"----->onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG,"----->onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG,"----->onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG,"----->onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"----->onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG,"----->onDetach");
    }
}
