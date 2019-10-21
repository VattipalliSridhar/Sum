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


public class UpanayanamActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextInputLayout txt_name, txt_star, txt_rasi, txt_paadam, txt_father_name, txt_father_star, txt_father_rasi, txt_father_paadam, txt_mother_name, txt_mother_star, txt_mother_rasi,
            txt_mother_paadam, txt_place_muhurtham, txt_near_town, txt_country, txt_state, txt_required, txt_prefered_month, txt_prefered_week, txt_email, txt_write, txt_checks;
    private TextInputEditText et_name, et_father_name, et_mother_name, et_place_muhurtham, et_near_town, et_required, et_email, et_write;
    private LinearLayout layout_checks;
    private Spinner spinner_star, sppiner_rasi, spinner_paadam, spinner_father_star, spinner_father_rasi, spinner_father_paadam, spinner_mother_star, spinner_mother_paadam,
            spinner_mother_rasi, spinner_country, spinner_state, spinner_prefered_month, spinner_prefered_week;
    private CheckBox checkBox;

    private Button btn_submit;

    private String muhurtham_type;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_upanayanam);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpanayanamActivity.this.finish();
            }
        });

        muhurtham_type = getIntent().getExtras().getString("muhurtham");
        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);


        txt_name = findViewById(R.id.txt_name);
        et_name = findViewById(R.id.edit_name);


        //star
        spinner_star = findViewById(R.id.spinner_birth_star);

        //rasi
        sppiner_rasi = findViewById(R.id.spinner_rasi);
        //paadam
        spinner_paadam = findViewById(R.id.spinner_paadam);

        //father name


        txt_father_name = findViewById(R.id.txt_father_name);
        et_father_name = findViewById(R.id.edit_father_name);

        //star
        spinner_father_star = findViewById(R.id.spinner_father_star);

        //rasi
        spinner_father_rasi = findViewById(R.id.spinner_father_rasi);


        //paadam
        spinner_father_paadam = findViewById(R.id.spinner_father_paadam);


        //mother

        txt_mother_name = findViewById(R.id.txt_mother_name);
        et_mother_name = findViewById(R.id.edit_mother_name);


        //star
        spinner_mother_star = findViewById(R.id.spinner_mother_star);


        //paadam
        spinner_mother_paadam = findViewById(R.id.spinner_mother_paadam);

        //rasi
        spinner_mother_rasi = findViewById(R.id.spinner_mother_rasi);


        //muhurtham place

        txt_place_muhurtham = findViewById(R.id.txt_place_muhurtham);
        et_place_muhurtham = findViewById(R.id.edit_place_muhurtham);


        //country
        spinner_country = findViewById(R.id.spinner_country);


        //near town

        txt_near_town = findViewById(R.id.txt_near_town);
        et_near_town = findViewById(R.id.edit_near_town);


        //state
        spinner_state = findViewById(R.id.spinner_state);


        //required muhurtham

        txt_required = findViewById(R.id.txt_required);
        et_required = findViewById(R.id.edit_required);


        //prefered month
        spinner_prefered_month = findViewById(R.id.spinner_month);


        //prefered week
        spinner_prefered_week = findViewById(R.id.spinner_week);


        //email

        txt_email = findViewById(R.id.txt_email);
        et_email = findViewById(R.id.edit_email_id);


        //write
        txt_write = findViewById(R.id.txt_write);
        et_write = findViewById(R.id.edit_write);

        //checks


        layout_checks = findViewById(R.id.layout_checks);
        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(this);

        //submit

        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validation()) {

                }
            }
        });


    }

    private boolean validation() {

        if (TextUtils.isEmpty(et_name.getText().toString())) {
            et_name.setError("Please Enter name");
            et_name.requestFocus();
            return false;
        }

        if (spinner_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Star", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (sppiner_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Rasi", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (TextUtils.isEmpty(et_father_name.getText().toString())) {
            et_father_name.setError("Please Enter Father Name");
            et_father_name.requestFocus();
            return false;
        }


        if (spinner_father_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Star", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (spinner_father_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_father_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Rasi", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (TextUtils.isEmpty(et_mother_name.getText().toString())) {
            et_mother_name.setError("Please Enter Mother Name");
            et_mother_name.requestFocus();
            return false;
        }

        if (spinner_mother_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Star", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (spinner_mother_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_mother_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Rasi", Toast.LENGTH_SHORT).show();
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
