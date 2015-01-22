package com.yrybyak.foodadditives;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class EActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_e);
        TextView ETextView = (TextView)findViewById(R.id.textView);
        String text = getIntent().getExtras().getString("text");
        ETextView.setText(Html.fromHtml(text));
    }

    public void ReturnClick(View view) {
        finish();
    }
}