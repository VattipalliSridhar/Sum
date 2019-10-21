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

public class ForAppointmentActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextInputLayout txt_owner_name, txt_servant_name,
            txt_place_muhurtham, txt_near_town,txt_required,  txt_email, txt_write;

    private TextInputEditText et_owner_name, et_servant_name, et_place_muhurtham, et_near_town, et_required, et_email, et_write;
    private LinearLayout layout_owner_star, layout_owner_paadam, layout_owner_rasi, layout_servant_star, layout_servant_paadam, layout_servant_rasi, layout_country,
            layout_state, layout_prefered_month, layout_prefered_week, layout_checks;
    private Spinner spinner_owner_star, spinner_owner_paadam, spinner_owner_rasi, spinner_servant_star, spinner_servant_paadam, spinner_servant_rasi,
            spinner_country, spinner_state, spinner_prefered_month, spinner_prefered_week;

    private CheckBox checkBox;
    private Button btn_submit;
    private TextView txt_owner_star, txt_owner_paadam, txt_owner_rasi, txt_servant_star,txt_servant_paadam,txt_servant_rasi,
            txt_prefered_month, txt_prefered_week, txt_checks,txt_country,txt_state;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_appointment);


        findViewById(R.id.back_button).setOnClickListener(v -> ForAppointmentActivity.this.finish());

        String muhurtham_type = getIntent().getExtras().getString("muhurtham");
        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);


        //owner name
        txt_owner_name = findViewById(R.id.txt_ower_name);
        et_owner_name = findViewById(R.id.edit_owner_name);


        //owner star


        txt_owner_star = findViewById(R.id.txt_owner_star);
        spinner_owner_star = findViewById(R.id.spinner_owner_star);


        //owner paadam


        txt_owner_paadam = findViewById(R.id.txt_owner_paadam);
        spinner_owner_paadam = findViewById(R.id.spinner_owner_paadam);

        //owner rasi


        txt_owner_rasi = findViewById(R.id.txt_owner_rasi);
        spinner_owner_rasi = findViewById(R.id.spinner_owner_rasi);

        //servant name


        txt_servant_name = findViewById(R.id.txt_servant_name);
        et_servant_name = findViewById(R.id.edit_servant_name);


        //servant star


        txt_servant_star = findViewById(R.id.txt_servant_star);
        spinner_servant_star = findViewById(R.id.spinner_servant_star);


        //servant paadam


        txt_servant_paadam = findViewById(R.id.txt_servant_paadam);
        spinner_servant_paadam = findViewById(R.id.spinner_servant_paadam);

        //servant rasi


        txt_servant_rasi = findViewById(R.id.txt_servant_rasi);
        spinner_servant_rasi = findViewById(R.id.spinner_servant_rasi);


        //muhurtham place

        txt_place_muhurtham = findViewById(R.id.txt_place_muhurtham);
        et_place_muhurtham = findViewById(R.id.edit_place_muhurtham);


        //country

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

        if (TextUtils.isEmpty(et_owner_name.getText().toString())) {
            et_owner_name.setError("Please Enter Owner Name");
            et_owner_name.requestFocus();
            return false;
        }

        if (spinner_owner_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Owner Star ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_owner_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Owner Paadam ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_owner_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Owner Rasi ", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_servant_name.getText().toString())) {
            et_servant_name.setError("Please Enter Servant Name");
            et_servant_name.requestFocus();
            return false;
        }

        if (spinner_servant_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Servant  Star ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_servant_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Servant  Paadam ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_servant_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Servant  Rasi ", Toast.LENGTH_SHORT).show();
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

        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
