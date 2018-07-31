package com.lz.sample.android_constraintlayout_sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBasicAttrClick(View view) {
        Intent intent = new Intent(MainActivity.this, BasicAttrActivity.class);
        startActivity(intent);
    }

    public void onCompareWithRLClick(View view) {
        Intent intent = new Intent(MainActivity.this, CompareWithRelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void onSetSizeAsARatio(View view) {
        Intent intent = new Intent(MainActivity.this, SetSizeAsARatioActivity.class);
        startActivity(intent);
    }

    public void onChainClick(View view) {

    }
}
