package com.bawei.test.af_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * autour: 曾光春
 * date: 2016/11/29 21:08
 * update: 2016/11/29
 */
public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"----->onCreate");
        // 找到控件
        Button   button1 = (Button) findViewById(R.id.button1);
        final EditText editText = (EditText)findViewById(R.id.et_s);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //创建Fragment对象
               Fragment fragment1 = new FragmentA();
                //传值
                Bundle bundle = new Bundle();
                String strValue = editText.getText().toString().trim();
                bundle.putString("str", strValue);
                fragment1.setArguments(bundle);

                //获取Fragment的容器
                FragmentManager manager =getSupportFragmentManager();
                // 获取事务对象 FragmentTransaction，通过容器 ，开启事物
                FragmentTransaction transaction = manager.beginTransaction();
                //事物添加（fragment的id，fragment的对象，名称）remove、replace、show、hide
                transaction.add(R.id.fl, fragment1, "第一页面");
                //提交事物
                transaction.commit();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"----->onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"----->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"----->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"----->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"----->onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"----->onRestart");
    }
//    Fragment与Activity的生命周期调用的方法
//
//    1、第一次启动调用的方法：（fragment）
//    onAttach
//            onCreate
//    onCreateView
//            onActivityCreated
//    onStart
//            onResume
//
//    2、点击手机home键（Activity、fragment）
//
//    共同点:onPause、onStop
//    启动循序：
//    FragmentA: ----->onPause
//    MainActivity: ----->onPause
//    FragmentA: ----->onStop
//    MainActivity: ----->onStop
//
//
//    3、点击手机home键，锁屏
//
//    共同点: onPause、onStop
//    启动循序：
//    FragmentA: ----->onPause
//    MainActivity: ----->onPause
//    FragmentA: ----->onStop
//    MainActivity: ----->onStop
//
//    4、解锁，反回（Activity、fragment）
//
//    共同点:onStart、onResume
//    不同点: Activity多了onRestart
//    启动循序：
//    MainActivity: ----->onRestart
//    FragmentA: ----->onStart
//    MainActivity: ----->onStart
//    MainActivity: ----->onResume
//    FragmentA: ----->onResume
//
//
//    5、退出程序（Activity、fragment）
//
//    共同点: onPause、onStop、onDestroy
//    不同点: fragment多了onDestroyView、onDetach
//    启动循序：
//    FragmentA: ----->onPause
//    MainActivity: ----->onPause
//    FragmentA: ----->onStop
//    MainActivity: ----->onStop
//    FragmentA: ----->onDestroyView
//    FragmentA: ----->onDestroy
//    FragmentA: ----->onDetach
//    MainActivity: ----->onDestroyView

}
