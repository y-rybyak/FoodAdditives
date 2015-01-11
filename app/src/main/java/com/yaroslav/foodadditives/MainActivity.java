package com.yaroslav.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonE100Click(View view) {
        Intent intent = new Intent(MainActivity.this, E100Activity.class);
        startActivity(intent);
    }

    public void ButtonE101Click(View view) {
        Intent intent = new Intent(MainActivity.this, E101Activity.class);
        startActivity(intent);
    }

    public void ButtonE102Click(View view) {
        Intent intent = new Intent(MainActivity.this, E102Activity.class);
        startActivity(intent);
    }

    public void ButtonE121Click(View view) {
        Intent intent = new Intent(MainActivity.this, E121Activity.class);
        startActivity(intent);
    }
}
