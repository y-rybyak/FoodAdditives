package com.yrybyak.foodadditives;

import android.app.Activity;
import android.os.Bundle;

public class E400E499Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e400_e499_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e400_e499);
    }
/*
    public void ButtonE200Click(View view) {
        Intent intent = new Intent(E300E399Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e200_text));
        startActivity(intent);
    }
*/
}