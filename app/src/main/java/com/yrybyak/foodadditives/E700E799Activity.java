package com.yrybyak.foodadditives;

import android.app.Activity;
import android.os.Bundle;

public class E700E799Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e700_e799_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e700_e799);
    }
}