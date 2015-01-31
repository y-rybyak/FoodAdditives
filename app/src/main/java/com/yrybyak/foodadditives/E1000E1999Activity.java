package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E1000E1999Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e1000_e1999_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e1000_e1999);
    }

    public void ButtonE1100Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1100_text));
        startActivity(intent);
    }

    public void ButtonE1104Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1104_text));
        startActivity(intent);
    }

    public void ButtonE1105Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1105_text));
        startActivity(intent);
    }

    public void ButtonE1400Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1400_text));
        startActivity(intent);
    }

    public void ButtonE1404Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1404_text));
        startActivity(intent);
    }

    public void ButtonE1422Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1442_text));
        startActivity(intent);
    }

    public void ButtonE1442Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1442_text));
        startActivity(intent);
    }

    public void ButtonE1450Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1450_text));
        startActivity(intent);
    }

    public void ButtonE1510Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1510_text));
        startActivity(intent);
    }

    public void ButtonE1518Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1518_text));
        startActivity(intent);
    }

    public void ButtonE1520Click(View view) {
        Intent intent = new Intent(E1000E1999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e1520_text));
        startActivity(intent);
    }
}