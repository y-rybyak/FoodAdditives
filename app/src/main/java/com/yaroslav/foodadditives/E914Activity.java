package com.yaroslav.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E914Activity extends Activity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        setContentView(R.layout.activity_e914);
    }

    public void E100ReturnClick(View view) {
        Intent intent = new Intent(E914Activity.this, MainActivity.class);
        startActivity(intent);
    }
}