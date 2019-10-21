package vmax.com.sumuhurtham.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        findViewById(R.id.telugu_button).setOnClickListener(this);
        findViewById(R.id.english_button).setOnClickListener(this);

        TextView telugu_txt = findViewById(R.id.telugu_txt);
        Typeface face = Typeface.createFromAsset(getAssets(), "font/Potti Sreeramulu.otf");
        telugu_txt.setTypeface(face);
    }

    @Override
    public void onClick(View v) {
        Context context;
        Resources resources;

        switch (v.getId()) {
            case R.id.english_button:
                context = LocaleHelper.setLocale(SplashActivity.this, "en");
                resources = context.getResources();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
                break;

            case R.id.telugu_button:
                context = LocaleHelper.setLocale(SplashActivity.this, "te");
                resources = context.getResources();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
                break;
        }

    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
