package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E600E699Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e600_e699_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e600_e699);
    }

    public void ButtonE621Click(View view) {
        Intent intent = new Intent(E600E699Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e621_text));
        startActivity(intent);
    }

    public void ButtonE627Click(View view) {
        Intent intent = new Intent(E600E699Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e627_text));
        startActivity(intent);
    }
}