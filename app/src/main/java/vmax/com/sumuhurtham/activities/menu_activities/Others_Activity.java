package vmax.com.sumuhurtham.activities.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.WebView_Activity;
import vmax.com.sumuhurtham.classes.LocaleHelper;
import vmax.com.sumuhurtham.classes.UI_Class;

public class Others_Activity extends AppCompatActivity {

    private String[] other_img_data,other_contact_original;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Others_Activity.this.finish();
            }
        });

        other_img_data = this.getResources().getStringArray(R.array.other_contact_thumb);
        other_contact_original = this.getResources().getStringArray(R.array.other_contact_original);

        LinearLayout other_contact_layout = findViewById(R.id.other_contact_layout);
        if(UI_Class.isNetworkAvailable(Others_Activity.this))
        {
          other_contact_layout.setVisibility(View.VISIBLE);
        }else{
            other_contact_layout.setVisibility(View.GONE);
        }

        ImageView other_image_one = findViewById(R.id.other_image_one);
        ImageView other_image_two = findViewById(R.id.other_image_two);
        ImageView other_image_three = findViewById(R.id.other_image_three);
        ImageView other_image_four = findViewById(R.id.other_image_four);
        ImageView other_image_five = findViewById(R.id.other_image_five);
        ImageView other_image_six = findViewById(R.id.other_image_six);
        ImageView other_image_seven = findViewById(R.id.other_image_seven);
        ImageView other_image_eight = findViewById(R.id.other_image_eight);

        if(UI_Class.isNetworkAvailable(Others_Activity.this))
        {
            Glide.with(Others_Activity.this).load(other_img_data[0])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_one);

            Glide.with(Others_Activity.this).load(other_img_data[1])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_two);

            Glide.with(Others_Activity.this).load(other_img_data[2])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_three);

            Glide.with(Others_Activity.this).load(other_img_data[3])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_four);

            Glide.with(Others_Activity.this).load(other_img_data[4])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_five);

            Glide.with(Others_Activity.this).load(other_img_data[5])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_six);

            Glide.with(Others_Activity.this).load(other_img_data[6])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_seven);

            Glide.with(Others_Activity.this).load(other_img_data[7])
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(other_image_eight);
        }


        findViewById(R.id.other_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[0]);
                intent.putExtra("value","img");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[1]);
                intent.putExtra("value","img");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[2]);
                intent.putExtra("value","img");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[3]);
                intent.putExtra("value","img");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_five).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[4]);
                intent.putExtra("value","img");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_six).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[5]);
                intent.putExtra("value","url");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_seven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[6]);
                intent.putExtra("value","url");
                startActivity(intent);
            }
        });

        findViewById(R.id.other_eight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others_Activity.this, WebView_Activity.class);
                intent.putExtra("web_img",other_contact_original[7]);
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
