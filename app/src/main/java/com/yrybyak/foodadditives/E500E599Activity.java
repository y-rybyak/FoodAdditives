package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E500E599Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e500_e599_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e500_e599);
    }

    public void ButtonE500Click(View view) {
        Intent intent = new Intent(E500E599Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e500_text));
        startActivity(intent);
    }

    public void ButtonE501Click(View view) {
        Intent intent = new Intent(E500E599Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e501_text));
        startActivity(intent);
    }

}