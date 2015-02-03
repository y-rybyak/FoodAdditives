package com.yrybyak.foodadditives;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.about_label);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_about);
        TextView AboutTextView = (TextView)findViewById(R.id.textView);
        AboutTextView.setText(Html.fromHtml(getString(R.string.about_text)));
    }

    public void ReturnClick(View view) {
        finish();
    }
}