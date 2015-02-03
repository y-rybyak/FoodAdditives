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

    public void ButtonE913Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e913_text));
        startActivity(intent);
    }

    public void ButtonE914Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e914_text));
        startActivity(intent);
    }

    public void ButtonE916Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e916_text));
        startActivity(intent);
    }

    public void ButtonE917Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e917_text));
        startActivity(intent);
    }

    public void ButtonE918Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e918_text));
        startActivity(intent);
    }

    public void ButtonE919Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e919_text));
        startActivity(intent);
    }

    public void ButtonE922Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e922_text));
        startActivity(intent);
    }

    public void ButtonE923Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e923_text));
        startActivity(intent);
    }

    public void ButtonE925Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e925_text));
        startActivity(intent);
    }

    public void ButtonE926Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e926_text));
        startActivity(intent);
    }

    public void ButtonE929Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e929_text));
        startActivity(intent);
    }

    public void ButtonE950Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e950_text));
        startActivity(intent);
    }

    public void ButtonE951Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e951_text));
        startActivity(intent);
    }

    public void ButtonE952Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e952_text));
        startActivity(intent);
    }

    public void ButtonE953Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e953_text));
        startActivity(intent);
    }

    public void ButtonE954Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e954_text));
        startActivity(intent);
    }

    public void ButtonE965Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e965_text));
        startActivity(intent);
    }

    public void ButtonE967Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e967_text));
        startActivity(intent);
    }

    public void ButtonE999Click(View view) {
        Intent intent = new Intent(E900E999Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e999_text));
        startActivity(intent);
    }

    public void ReturnClick(View view) {
        finish();
    }
}