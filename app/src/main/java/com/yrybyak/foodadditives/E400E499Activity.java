package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class E400E499Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.e400_e499_meaning);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e400_e499);
    }

    public void ButtonE401Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e401_text));
        startActivity(intent);
    }

    public void ButtonE406Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e406_text));
        startActivity(intent);
    }

    public void ButtonE407Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e407_text));
        startActivity(intent);
    }

    public void ButtonE410Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e410_text));
        startActivity(intent);
    }

    public void ButtonE412Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e412_text));
        startActivity(intent);
    }

    public void ButtonE414Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e414_text));
        startActivity(intent);
    }

    public void ButtonE415Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e415_text));
        startActivity(intent);
    }

    public void ButtonE420Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e420_text));
        startActivity(intent);
    }

    public void ButtonE421Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e421_text));
        startActivity(intent);
    }

    public void ButtonE422Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e422_text));
        startActivity(intent);
    }

    public void ButtonE424Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e424_text));
        startActivity(intent);
    }

    public void ButtonE425Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e425_text));
        startActivity(intent);
    }

    public void ButtonE433Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e433_text));
        startActivity(intent);
    }

    public void ButtonE440Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e440_text));
        startActivity(intent);
    }

    public void ButtonE445Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e445_text));
        startActivity(intent);
    }

    public void ButtonE450Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e450_text));
        startActivity(intent);
    }

    public void ButtonE450iClick(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e450i_text));
        startActivity(intent);
    }

    public void ButtonE451Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e451_text));
        startActivity(intent);
    }

    public void ButtonE452Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e452_text));
        startActivity(intent);
    }

    public void ButtonE466Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e466_text));
        startActivity(intent);
    }

    public void ButtonE471Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e471_text));
        startActivity(intent);
    }

    public void ButtonE472Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e472_text));
        startActivity(intent);
    }

    public void ButtonE472eClick(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e472e_text));
        startActivity(intent);
    }

    public void ButtonE475Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e475_text));
        startActivity(intent);
    }

    public void ButtonE476Click(View view) {
        Intent intent = new Intent(E400E499Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e476_text));
        startActivity(intent);
    }

    public void ReturnClick(View view) {
        finish();
    }
}