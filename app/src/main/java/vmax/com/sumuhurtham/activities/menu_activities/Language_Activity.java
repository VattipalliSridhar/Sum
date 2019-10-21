package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.MainActivity;
import vmax.com.sumuhurtham.activities.SplashActivity;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class Language_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_);


        findViewById(R.id.layout_two).setOnClickListener(this);
        findViewById(R.id.layout_one).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Context context;
        Resources resources;

        switch (v.getId()) {
            case R.id.layout_one:

                context = LocaleHelper.setLocale(Language_Activity.this, "te");
                resources = context.getResources();
                // startActivity(new Intent(Language_Activity.this, MainActivity.class));

                finishAffinity();
                Intent intent1 = new Intent(Language_Activity.this, MainActivity.class);
                //intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);


                break;

            case R.id.layout_two:
                context = LocaleHelper.setLocale(Language_Activity.this, "en");
                resources = context.getResources();
                //startActivity(new Intent(Language_Activity.this, MainActivity.class));

                finishAffinity();
                Intent intent = new Intent(Language_Activity.this, MainActivity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }


}
