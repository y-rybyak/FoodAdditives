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

        /*
        Закомментированный код для пункта меню "О программе".
        Раскомментировать здесь и menu_main.xml
        else if (id == R.id.about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        */

        return super.onOptionsItemSelected(item);
    }

    public void ButtonE100E199Click(View view) {
        Intent intent = new Intent(MainActivity.this, E100E199Activity.class);
        startActivity(intent);
    }
}