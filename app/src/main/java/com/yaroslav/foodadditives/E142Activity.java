package com.yaroslav.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E142Activity extends Activity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        setContentView(R.layout.activity_e142);
    }

    public void E142ReturnClick(View view) {
        Intent intent = new Intent(E142Activity.this, MainActivity.class);
        startActivity(intent);
    }
}