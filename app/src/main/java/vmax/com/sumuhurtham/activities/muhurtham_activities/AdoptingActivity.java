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

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;


public class AdoptingActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {




    private TextInputEditText  et_father_name, et_mother_name, et_place_muhurtham, et_near_town, et_required, et_email, et_write;
    private Spinner spinner_child_star, spinner_child_paadam, spinner_child_rasi, spinner_father_star, spinner_father_paadam, spinner_father_rasi,
            spinner_mother_star, spinner_mother_paadam, spinner_mother_rasi, spinner_country, spinner_state, spinner_prefered_month, spinner_prefered_week;

    private TextInputEditText et_child_name;


    private CheckBox checkBox;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_adopting_ceremony);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdoptingActivity.this.finish();
            }
        });

        String muhurtham_type = getIntent().getExtras().getString("muhurtham");
        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);

         et_child_name = findViewById(R.id.edit_child_name);

        //child star
        spinner_child_star = findViewById(R.id.spinner_child_star);


        //child paadam
        spinner_child_paadam = findViewById(R.id.spinner_child_paadam);


        //child rasi
        spinner_child_rasi = findViewById(R.id.spinner_child_rasi);


        //father
        et_father_name = findViewById(R.id.edit_father_name);


        //father star
        spinner_father_star = findViewById(R.id.spinner_father_star);


        //father paadam
        spinner_father_paadam = findViewById(R.id.spinner_father_paadam);

        //father rasi
        spinner_father_rasi = findViewById(R.id.spinner_father_rasi);


        //mother
        et_mother_name = findViewById(R.id.edit_mother_name);


        //mother star
        spinner_mother_star = findViewById(R.id.spinner_mother_star);


        //mother paadam
        spinner_mother_paadam = findViewById(R.id.spinner_mother_paadam);

        //mother rasi
        spinner_mother_rasi = findViewById(R.id.spinner_mother_rasi);


        //place muhurtham
        et_place_muhurtham = findViewById(R.id.edit_place_muhurtham);

        //country
        spinner_country = findViewById(R.id.spinner_country);


        //near town
        et_near_town = findViewById(R.id.edit_near_town);


        //state
        spinner_state = findViewById(R.id.spinner_state);

        //required muhurtham
        et_required = findViewById(R.id.edit_required);

        //prefered month
        spinner_prefered_month = findViewById(R.id.spinner_month);

        //prerefered week
        spinner_prefered_week = findViewById(R.id.spinner_week);

        //email
        et_email = findViewById(R.id.edit_email_id);

        //write
        et_write = findViewById(R.id.edit_write);

        //check box
        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(this);


        Button btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Validation()) {

                }

            }
        });


    }

    private boolean Validation() {

        if (TextUtils.isEmpty(et_child_name.getText().toString())) {
            et_child_name.setError("Please Enter Child Name");
            et_child_name.requestFocus();
            return false;
        }

        if (spinner_child_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Child Star", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_child_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Child Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (spinner_child_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Child Rasi", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (TextUtils.isEmpty(et_father_name.getText().toString())) {
            et_father_name.setError("Please Enter Father Name");
            et_father_name.requestFocus();
            return false;
        }

        if (spinner_father_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Father Star", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_father_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Father Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_father_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Father Rasi", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (TextUtils.isEmpty(et_mother_name.getText().toString())) {
            et_mother_name.setError("Please Enter Mother  Name");
            et_mother_name.requestFocus();
            return false;
        }


        if (spinner_mother_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Mother Star", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_mother_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Mother Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_mother_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Mother Rasi", Toast.LENGTH_SHORT).show();
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
