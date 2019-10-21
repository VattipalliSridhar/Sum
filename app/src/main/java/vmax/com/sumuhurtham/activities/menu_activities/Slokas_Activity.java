package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class Slokas_Activity extends AppCompatActivity {


    private String[] sloks_data;
    private ListView slokas_list_view;
    public static int positions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokas_);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Slokas_Activity.this.finish();
            }
        });


        sloks_data = this.getResources().getStringArray(R.array.sloks_array);

        ListView slokas_list_view = findViewById(R.id.slokas_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, sloks_data);
        slokas_list_view.setAdapter(adapter);

        slokas_list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                positions = position;
                startActivity(new Intent(Slokas_Activity.this, Slokas_View_Activity.class));
            }
        });


    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
