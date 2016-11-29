package com.bawei.test.af_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"----->onCreate");
        // 找到控件
        Button   button1 = (Button) findViewById(R.id.button1);
      //  Button   button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //创建Fragment对象
               Fragment fragment1 = new FragmentA();
                //支持Fragment的管理
                FragmentManager manager =getSupportFragmentManager();
                //开始处理Fragment的管理
                FragmentTransaction transaction = manager.beginTransaction();
                //添加fragment数据
                transaction.add(R.id.fl, fragment1, "第一页面");
                //提交数据
                transaction.commit();
            }
        });

//        button2.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // 创建Fragment对象
//                Fragment fragment2 = new FragmentB();
//                // 支持Fragment管理
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                // 开始处理Fragment的管理
//                FragmentTransaction transaction = fragmentManager
//                        .beginTransaction();
//                // 添加Fragment数据
//                transaction.add(R.id.fl, fragment2, "fragment2");
//                // 提交数据
//                transaction.commit();
//            }
//        });
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
