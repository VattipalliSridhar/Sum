package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.WebView_Activity;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class Quick_Contact_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick__contact_);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quick_Contact_Activity.this.finish();
            }
        });


        findViewById(R.id.contact_banner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quick_Contact_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img","http://www.onlinevedika.in/");
                intent.putExtra("value","url");
                startActivity(intent);
            }
        });

    }



    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
