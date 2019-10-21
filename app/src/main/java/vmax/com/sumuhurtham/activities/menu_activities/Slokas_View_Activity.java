package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class Slokas_View_Activity extends AppCompatActivity {


    private String[] sloks_name;
    private String[] listItem;
    private WebView sloks_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokas__view_);


        sloks_name = this.getResources().getStringArray(R.array.sloks_array);
        loadHtml();
        TextView sloks_name_txt = findViewById(R.id.sloks_name_txt);
        sloks_name_txt.setText(sloks_name[Slokas_Activity.positions]);

        sloks_web_view = findViewById(R.id.sloks_web_view);
        sloks_web_view.loadUrl("file:///android_asset/" + listItem[Slokas_Activity.positions]);
        sloks_web_view.getSettings().setBuiltInZoomControls(true);

    }


    private void loadHtml() {
        try {
            this.listItem = getApplicationContext().getAssets().list("html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (this.listItem != null) {
            ArrayList<String> tmplist = new ArrayList<>();
            for (String aListItem : this.listItem) {
                //if (aListItem.contains("page")) {

                    tmplist.add("html/" + aListItem);
                //}
            }
            this.listItem = tmplist.toArray(new String[0]);

        }
    }



    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
