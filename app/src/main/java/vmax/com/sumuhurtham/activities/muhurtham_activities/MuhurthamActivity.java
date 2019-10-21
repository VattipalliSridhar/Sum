package vmax.com.sumuhurtham.activities.muhurtham_activities;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class MuhurthamActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextInputLayout txt_mother_name, txt_child_name, txt_place_muhurtham, txt_near_town, txt_required, txt_email, txt_write;
    private TextInputEditText et_mother_name, et_child_name, et_place_muhurtham, et_near_town, et_required, et_email, et_write;
    private LinearLayout layout_mother_star, layout_mother_paadam, layout_mother_rasi, layout_child_star, layout_child_paadam, layout_child_rasi, layout_country,
            layout_state, layout_prefered_month, layout_prefered_week, layout_checks;
    private Spinner spinner_mother_star, spinner_mother_paadam, spinner_mother_rasi, spinner_child_star, spinner_child_paadam, spinner_child_rasi,
            spinner_country, spinner_state, spinner_prefered_month, spinner_prefered_week;

    private CheckBox checkBox;
    private Button btn_submit;
    private TextView txt_mother_star, txt_mother_paadam, txt_mother_rasi, txt_child_star, txt_child_paadam, txt_child_rasi, txt_country, txt_state,
            txt_prefered_month, txt_prefered_week, txt_checks;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_muhurtham);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MuhurthamActivity.this.finish();
            }
        });

        String muhurtham_type = getIntent().getExtras().getString("muhurtham");
        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);

        //Mother name
        txt_mother_name = findViewById(R.id.txt_mother_name);
        et_mother_name = findViewById(R.id.edit_mother_name);


        //Mother star


        txt_mother_star = findViewById(R.id.txt_mother_star);
        spinner_mother_star = findViewById(R.id.spinner_mother_star);


        //Mother paadam

        txt_mother_paadam = findViewById(R.id.txt_mother_paadam);
        spinner_mother_paadam = findViewById(R.id.spinner_mother_paadam);

        //Mother rasi


        txt_mother_rasi = findViewById(R.id.txt_mother_rasi);
        spinner_mother_rasi = findViewById(R.id.spinner_mother_rasi);

        //Child name


        txt_child_name = findViewById(R.id.txt_child_name);
        et_child_name = findViewById(R.id.edit_child_name);


        //Child star


        txt_child_star = findViewById(R.id.txt_child_star);
        spinner_child_star = findViewById(R.id.spinner_child_star);


        //Child paadam


        txt_child_paadam = findViewById(R.id.txt_child_paadam);
        spinner_child_paadam = findViewById(R.id.spinner_child_paadam);

        //Child rasi


        txt_child_rasi = findViewById(R.id.txt_child_rasi);
        spinner_child_rasi = findViewById(R.id.spinner_child_rasi);


        //muhurtham place

        txt_place_muhurtham = findViewById(R.id.txt_place_muhurtham);
        et_place_muhurtham = findViewById(R.id.edit_place_muhurtham);


        //country
        layout_country = findViewById(R.id.layout_country);
        txt_country = findViewById(R.id.txt_country);
        spinner_country = findViewById(R.id.spinner_country);


        //near town

        txt_near_town = findViewById(R.id.txt_near_town);
        et_near_town = findViewById(R.id.edit_near_town);


        //state

        txt_state = findViewById(R.id.txt_state);
        spinner_state = findViewById(R.id.spinner_state);


        //required muhurtham

        txt_required = findViewById(R.id.txt_required);
        et_required = findViewById(R.id.edit_required);


        //prefered month


        spinner_prefered_month = findViewById(R.id.spinner_month);
        txt_prefered_month = findViewById(R.id.txt_perfered_month);


        //prefered week

        spinner_prefered_week = findViewById(R.id.spinner_week);
        txt_prefered_week = findViewById(R.id.txt_perfered_week);


        //email

        txt_email = findViewById(R.id.txt_email);
        et_email = findViewById(R.id.edit_email_id);


        //write
        txt_write = findViewById(R.id.txt_write);
        et_write = findViewById(R.id.edit_write);

        //checks


        layout_checks = findViewById(R.id.layout_checks);
        txt_checks = findViewById(R.id.txt_muhuthrutam);
        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(this);

        //submit

        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Validation()) {

                }
            }
        });


    }


    private boolean Validation() {

        if (TextUtils.isEmpty(et_mother_name.getText().toString())) {
            et_mother_name.setError("Please Enter Mother Name");
            et_mother_name.requestFocus();
            return false;
        }

        if (spinner_mother_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Mother Star ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_mother_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Mother Paadam ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_mother_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Mother Rasi ", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_child_name.getText().toString())) {
            et_child_name.setError("Please Enter Child Name");
            et_child_name.requestFocus();
            return false;
        }

        if (spinner_child_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Child  Star ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_child_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Child  Paadam ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_child_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Child  Rasi ", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_place_muhurtham.getText().toString())) {
            et_place_muhurtham.setError("Please Enter Place Of  Muhurtham");
            et_place_muhurtham.requestFocus();
            return false;
        }


        if (spinner_country.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Country", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_near_town.getText().toString())) {
            et_near_town.setError("Please Enter Near Town");
            et_near_town.requestFocus();
            return false;
        }

        if (spinner_state.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select State", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(et_required.getText().toString())) {
            et_required.setError("Please Enter Required Muhurtham");
            et_required.requestFocus();
            return false;
        }

        if (spinner_prefered_month.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Prefered Months", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_prefered_week.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Prefered Week", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_email.getText().toString())) {
            et_email.setError("Please Enter Email Id");
            et_email.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(et_write.getText().toString())) {
            et_write.setError("Please Enter Write  Meassage");
            et_write.requestFocus();
            return false;
        }

        return true;
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (checkBox.isChecked()) {

        } else {
            Toast.makeText(this, "Please Select the Check Box", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
