package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E400E499Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e400_e499_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e400_e499);
    }

    public void ButtonE401Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e401_text));
        startActivity(intent);
    }

    public void ButtonE406Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e406_text));
        startActivity(intent);
    }
}