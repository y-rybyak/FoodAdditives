package com.yrybyak.foodadditives;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class E557Activity extends Activity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e557);
    }

    public void ReturnClick(View view) {
        finish();
    }
}