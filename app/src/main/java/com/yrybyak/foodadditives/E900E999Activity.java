package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E900E999Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e900_e999_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e900_e999);
    }

    public void ButtonE903Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e903_text));
        startActivity(intent);
    }

    public void ButtonE912Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e912_text));
        startActivity(intent);
    }
}