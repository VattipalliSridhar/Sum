package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class About_Activity extends AppCompatActivity {

    private WebView about_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                About_Activity.this.finish();
            }
        });

        about_web_view=findViewById(R.id.about_web_view);

        about_web_view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        about_web_view.setLongClickable(false);
        about_web_view.loadDataWithBaseURL(null,getString(R.string.about_us_page), "text/html", "UTF-8", null);


    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
