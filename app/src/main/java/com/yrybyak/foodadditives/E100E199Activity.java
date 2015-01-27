package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class E100E199Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e100_e199);
    }

    public void ButtonE100Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e100_text));
        startActivity(intent);
    }

    public void ButtonE101Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e101_text));
        startActivity(intent);
    }
    public void ButtonE102Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e102_text));
        startActivity(intent);
    }
    public void ButtonE103Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e103_text));
        startActivity(intent);
    }
    public void ButtonE104Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e104_text));
        startActivity(intent);
    }
    public void ButtonE105Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e105_text));
        startActivity(intent);
    }
    public void ButtonE110Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e110_text));
        startActivity(intent);
    }
    public void ButtonE120Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e120_text));
        startActivity(intent);
    }
    public void ButtonE121Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e121_text));
        startActivity(intent);
    }
    public void ButtonE122Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e122_text));
        startActivity(intent);
    }
    public void ButtonE123Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e123_text));
        startActivity(intent);
    }
    public void ButtonE124Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e124_text));
        startActivity(intent);
    }
    public void ButtonE128Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e128_text));
        startActivity(intent);
    }
    public void ButtonE129Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e129_text));
        startActivity(intent);
    }
    public void ButtonE131Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e131_text));
        startActivity(intent);
    }
    public void ButtonE132Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e132_text));
        startActivity(intent);
    }
    public void ButtonE133Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e133_text));
        startActivity(intent);
    }
    public void ButtonE140Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e140_text));
        startActivity(intent);
    }
    public void ButtonE141Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e141_text));
        startActivity(intent);
    }
    public void ButtonE142Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e142_text));
        startActivity(intent);
    }
    public void ButtonE150Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e150_text));
        startActivity(intent);
    }
    public void ButtonE150dClick(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e150d_text));
        startActivity(intent);
    }
    public void ButtonE152Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e152_text));
        startActivity(intent);
    }
    public void ButtonE153Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e153_text));
        startActivity(intent);
    }
    public void ButtonE154Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e154_text));
        startActivity(intent);
    }
    public void ButtonE160aClick(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e160a_text));
        startActivity(intent);
    }
    public void ButtonE160bClick(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e160b_text));
        startActivity(intent);
    }
    public void ButtonE160cClick(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e160c_text));
        startActivity(intent);
    }
    public void ButtonE161bClick(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e161b_text));
        startActivity(intent);
    }
    public void ButtonE162Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e162_text));
        startActivity(intent);
    }
    public void ButtonE163Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e163_text));
        startActivity(intent);
    }
    public void ButtonE164Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e164_text));
        startActivity(intent);
    }
    public void ButtonE170Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e170_text));
        startActivity(intent);
    }
    public void ButtonE171Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e171_text));
        startActivity(intent);
    }
    public void ButtonE172Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e172_text));
        startActivity(intent);
    }
    public void ButtonE173Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e173_text));
        startActivity(intent);
    }
    public void ButtonE174Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e174_text));
        startActivity(intent);
    }
    public void ButtonE175Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e175_text));
        startActivity(intent);
    }
    public void ButtonE180Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e180_text));
        startActivity(intent);
    }
    public void ButtonE181Click(View view) {
        Intent intent = new Intent(E100E199Activity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e181_text));
        startActivity(intent);
    }
}