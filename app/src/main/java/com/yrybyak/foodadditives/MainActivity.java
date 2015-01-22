package com.yrybyak.foodadditives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.dark_theme) {
            themeUtils.changeToTheme(this, themeUtils.DARK);
            setContentView(R.layout.activity_main);
            return true;
        }
        else if (id == R.id.light_theme) {
            themeUtils.changeToTheme(this, themeUtils.LIGHT);
            setContentView(R.layout.activity_main);
            return true;
        }
        else if (id == R.id.about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    public void ButtonE121Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e121_text));
        startActivity(intent);
    }
    public void ButtonE123Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e123_text));
        startActivity(intent);
    }
    public void ButtonE128Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e128_text));
        startActivity(intent);
    }
    public void ButtonE142Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e142_text));
        startActivity(intent);
    }
    public void ButtonE154Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e154_text));
        startActivity(intent);
    }
    public void ButtonE173Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e173_text));
        startActivity(intent);
    }
    public void ButtonE180Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e180_text));
        startActivity(intent);
    }
    public void ButtonE216Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e216_text));
        startActivity(intent);
    }
    public void ButtonE217Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e217_text));
        startActivity(intent);
    }
    public void ButtonE240Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e240_text));
        startActivity(intent);
    }
    public void ButtonE388Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e388_text));
        startActivity(intent);
    }
    public void ButtonE389Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e389_text));
        startActivity(intent);
    }
    public void ButtonE424Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e424_text));
        startActivity(intent);
    }
    public void ButtonE425Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e425_text));
        startActivity(intent);
    }
    public void ButtonE512Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e512_text));
        startActivity(intent);
    }
    public void ButtonE537Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e537_text));
        startActivity(intent);
    }
    public void ButtonE557Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e557_text));
        startActivity(intent);
    }
    public void ButtonE912Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e912_text));
        startActivity(intent);
    }
    public void ButtonE914Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e914_text));
        startActivity(intent);
    }
    public void ButtonE916Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e916_text));
        startActivity(intent);
    }
    public void ButtonE917Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e917_text));
        startActivity(intent);
    }
    public void ButtonE918Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e918_text));
        startActivity(intent);
    }
    public void ButtonE919Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e918_text));
        startActivity(intent);
    }
    public void ButtonE922Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e922_text));
        startActivity(intent);
    }
    public void ButtonE923Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e923_text));
        startActivity(intent);
    }
    public void ButtonE925Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e925_text));
        startActivity(intent);
    }
    public void ButtonE926Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e926_text));
        startActivity(intent);
    }
    public void ButtonE929Click(View view) {
        Intent intent = new Intent(MainActivity.this, EActivity.class);
        intent.putExtra("text", getResources().getString(R.string.e929_text));
        startActivity(intent);
    }
}