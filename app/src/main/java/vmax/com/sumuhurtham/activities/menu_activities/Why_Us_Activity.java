package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class Why_Us_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why__us_);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Why_Us_Activity.this.finish();
            }
        });

        WebView why_web_view=findViewById(R.id.why_web_view);

        why_web_view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        why_web_view.setLongClickable(false);
        why_web_view.loadDataWithBaseURL(null,getString(R.string.why_us_page), "text/html", "UTF-8", null);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
