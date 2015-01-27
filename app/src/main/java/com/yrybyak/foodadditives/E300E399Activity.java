package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E300E399Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e200_e299_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e200_e299);
    }


    public void ButtonE200Click(View view) {
        Intent intent = new Intent(E300E399Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e200_text));
        startActivity(intent);
    }
}