package com.yrybyak.foodadditives;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_about);
    }

    public void ReturnClick(View view) {
        finish();
    }
}