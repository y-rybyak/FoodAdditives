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

        return super.onOptionsItemSelected(item);
    }

    public void ButtonE121Click(View view) {
        Intent intent = new Intent(MainActivity.this, E121Activity.class);
        startActivity(intent);
    }
    public void ButtonE123Click(View view) {
        Intent intent = new Intent(MainActivity.this, E123Activity.class);
        startActivity(intent);
    }
    public void ButtonE128Click(View view) {
        Intent intent = new Intent(MainActivity.this, E128Activity.class);
        startActivity(intent);
    }
    public void ButtonE142Click(View view) {
        Intent intent = new Intent(MainActivity.this, E142Activity.class);
        startActivity(intent);
    }
    public void ButtonE154Click(View view) {
        Intent intent = new Intent(MainActivity.this, E154Activity.class);
        startActivity(intent);
    }
    public void ButtonE173Click(View view) {
        Intent intent = new Intent(MainActivity.this, E173Activity.class);
        startActivity(intent);
    }
    public void ButtonE180Click(View view) {
        Intent intent = new Intent(MainActivity.this, E180Activity.class);
        startActivity(intent);
    }
    public void ButtonE216Click(View view) {
        Intent intent = new Intent(MainActivity.this, E216Activity.class);
        startActivity(intent);
    }
    public void ButtonE217Click(View view) {
        Intent intent = new Intent(MainActivity.this, E217Activity.class);
        startActivity(intent);
    }
    public void ButtonE240Click(View view) {
        Intent intent = new Intent(MainActivity.this, E240Activity.class);
        startActivity(intent);
    }
    public void ButtonE388Click(View view) {
        Intent intent = new Intent(MainActivity.this, E388Activity.class);
        startActivity(intent);
    }
    public void ButtonE389Click(View view) {
        Intent intent = new Intent(MainActivity.this, E389Activity.class);
        startActivity(intent);
    }
    public void ButtonE424Click(View view) {
        Intent intent = new Intent(MainActivity.this, E424Activity.class);
        startActivity(intent);
    }
    public void ButtonE425Click(View view) {
        Intent intent = new Intent(MainActivity.this, E425Activity.class);
        startActivity(intent);
    }
    public void ButtonE512Click(View view) {
        Intent intent = new Intent(MainActivity.this, E512Activity.class);
        startActivity(intent);
    }
    public void ButtonE537Click(View view) {
        Intent intent = new Intent(MainActivity.this, E537Activity.class);
        startActivity(intent);
    }
    public void ButtonE557Click(View view) {
        Intent intent = new Intent(MainActivity.this, E557Activity.class);
        startActivity(intent);
    }
    public void ButtonE912Click(View view) {
        Intent intent = new Intent(MainActivity.this, E912Activity.class);
        startActivity(intent);
    }
    public void ButtonE914Click(View view) {
        Intent intent = new Intent(MainActivity.this, E914Activity.class);
        startActivity(intent);
    }
    public void ButtonE916Click(View view) {
        Intent intent = new Intent(MainActivity.this, E916Activity.class);
        startActivity(intent);
    }
    public void ButtonE917Click(View view) {
        Intent intent = new Intent(MainActivity.this, E917Activity.class);
        startActivity(intent);
    }
    public void ButtonE918Click(View view) {
        Intent intent = new Intent(MainActivity.this, E918Activity.class);
        startActivity(intent);
    }
    public void ButtonE919Click(View view) {
        Intent intent = new Intent(MainActivity.this, E919Activity.class);
        startActivity(intent);
    }
    public void ButtonE922Click(View view) {
        Intent intent = new Intent(MainActivity.this, E922Activity.class);
        startActivity(intent);
    }
    public void ButtonE923Click(View view) {
        Intent intent = new Intent(MainActivity.this, E923Activity.class);
        startActivity(intent);
    }
    public void ButtonE925Click(View view) {
        Intent intent = new Intent(MainActivity.this, E925Activity.class);
        startActivity(intent);
    }
    public void ButtonE926Click(View view) {
        Intent intent = new Intent(MainActivity.this, E926Activity.class);
        startActivity(intent);
    }
    public void ButtonE929Click(View view) {
        Intent intent = new Intent(MainActivity.this, E929Activity.class);
        startActivity(intent);
    }
}