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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.menu_activities.About_Activity;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class Common_Muhurtham_Form_Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextInputLayout txt_name, txt_surname, txt_place_muhurtham, txt_require, txt_email, txt_write;
    private TextInputEditText et_name, et_surname, et_place_muhurtham, et_required, et_email, et_write;

    private LinearLayout layout_checks;
    private Spinner spinner_gender, spinner_age, spinner_star, spinner_paadam, spinner_rasi, spinner_country, spinner_state, spinner_prefered_month,
            spinner_prefered_week;
    private CheckBox checkBox;

    private Button btn_submit;

    private TextView txt_gender, txt_age, txt_star, txt_paadam, txt_rasi, txt_country, txt_state, txt_prefered_month, txt_prefered_week, txt_muhurtham;

    private String muhurtham_type;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_common_muhurtham);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common_Muhurtham_Form_Activity.this.finish();
            }
        });

        muhurtham_type = getIntent().getExtras().getString("muhurtham");

        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);

        //layout name
        txt_name = findViewById(R.id.txt_name);
        et_name = findViewById(R.id.edit_name);


        //layout sur name
        txt_surname = findViewById(R.id.txt_surname);
        et_surname = findViewById(R.id.edit_surname);


        //gender

        txt_gender = findViewById(R.id.txt_gender);
        spinner_gender = findViewById(R.id.spinner_gender);


        //age

        txt_age = findViewById(R.id.txt_age);
        spinner_age = findViewById(R.id.spinner_age);

        //star

        txt_star = findViewById(R.id.txt_star);
        spinner_star = findViewById(R.id.spinner_star);

        //paadam

        txt_paadam = findViewById(R.id.txt_paddam);
        spinner_paadam = findViewById(R.id.spinner_paddam);

        //rasi

        txt_rasi = findViewById(R.id.txt_rasi);
        spinner_rasi = findViewById(R.id.spinner_rasi);


        //place muhurtham
        txt_place_muhurtham = findViewById(R.id.txt_place_muhurtham);
        et_place_muhurtham = findViewById(R.id.edit_place_muhurtham);

        //country

        txt_country = findViewById(R.id.txt_country);
        spinner_country = findViewById(R.id.spinner_country);

        //state

        txt_state = findViewById(R.id.txt_state);
        spinner_state = findViewById(R.id.spinner_state);

        //required muhurtham
        txt_require = findViewById(R.id.txt_required);
        et_required = findViewById(R.id.edit_required);

        //prefered month

        txt_prefered_month = findViewById(R.id.txt_perfered_month);
        spinner_prefered_month = findViewById(R.id.spinner_month);

        //prerefered week

        txt_prefered_week = findViewById(R.id.txt_perfered_week);
        spinner_prefered_week = findViewById(R.id.spinner_week);

        //email
        txt_email = findViewById(R.id.txt_email);
        et_email = findViewById(R.id.edit_email_id);

        //write
        txt_write = findViewById(R.id.txt_write);
        et_write = findViewById(R.id.edit_write);

        //check box
        layout_checks = findViewById(R.id.layout_checks);
        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(this);
        txt_muhurtham = findViewById(R.id.txt_muhuthrutam);


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
        if (TextUtils.isEmpty(et_name.getText().toString())) {
            et_name.setError("Please Enter Name");
            et_name.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(et_surname.getText().toString())) {
            et_surname.setError("Please Enter Sur Name");
            et_surname.requestFocus();
            return false;
        }

        if (spinner_gender.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Gender", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_age.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Age", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Star", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Rasi", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (spinner_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Paadam", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_place_muhurtham.getText().toString())) {
            et_place_muhurtham.setError("Please Enter Place of Muhurtham");
            et_place_muhurtham.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(et_required.getText().toString())) {
            et_required.setError("Please Enter Required Muhurtham");
            et_required.requestFocus();
            return false;
        }

        if (spinner_prefered_month.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Perfered Month", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_prefered_week.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select  Perfered Week", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (!validateEmail(et_email.getText().toString())) {
            return false;

        }
        if (TextUtils.isEmpty(et_write.getText().toString())) {
            et_write.setError("Please Enter Write Message");
            et_write.requestFocus();
            return false;
        }


        return true;
    }

    private boolean validateEmail(String email) {

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,255}$";
        CharSequence inputStr = email;
        String emails = et_email.getText().toString();
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (emails.isEmpty()) {
            et_email.setError("Please Enter Email Id");
            et_email.requestFocus();
            return false;
        } else if (matcher.matches()) {

            et_email.setError("Please Enter valid Email Id");

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
