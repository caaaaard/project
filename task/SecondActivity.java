package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    protected static final String TAG="ca";

    private Button button;

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"SecondActivity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"SecondActivity onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SecondActivity onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "SecondActivity onCreate");
    }
}
