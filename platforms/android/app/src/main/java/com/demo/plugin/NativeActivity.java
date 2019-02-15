package com.demo.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import io.ionic.starter.R;

public class NativeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK, new Intent().putExtra("data", "12344555"));
        finish();
//        super.onBackPressed();
    }
}
