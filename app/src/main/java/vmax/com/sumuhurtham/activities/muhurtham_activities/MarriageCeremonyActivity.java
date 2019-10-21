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

public class MarriageCeremonyActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextInputLayout txt_bride_groom_name, txt_bride_name,
            txt_place_muhurtham, txt_near_town, txt_required, txt_email, txt_write;
    private TextInputEditText et_groom_name, et_bride_name, et_place_muhurtham, et_near_town, et_required, et_email, et_write;
    private LinearLayout layout_groom_star, layout_groom_paadam, layout_groom_rasi, layout_bride_star, layout_bride_paadam, layout_bride_rasi, layout_country,
            layout_state, layout_prefered_month, layout_prefered_week, layout_checks;
    private Spinner spinner_groom_star, spinner_groom_paadam, spinner_groom_rasi, spinner_bride_star, spinner_bride_paadam, spinner_bride_rasi,
            spinner_country, spinner_state, spinner_prefered_month, spinner_prefered_week;

    private CheckBox checkBox;
    private Button btn_submit;


    private String muhurtham_type;
    private TextView txt_groom_star, txt_groom_paadam, txt_groom_rasi, txt_bride_star, txt_bride_paadam, txt_bride_rasi, txt_country, txt_state,
            txt_prefered_month, txt_prefered_week, txt_checks;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_marriage_ceremony);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MarriageCeremonyActivity.this.finish();
            }
        });

        muhurtham_type = getIntent().getExtras().getString("muhurtham");
        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);

        //groom name
        txt_bride_groom_name = findViewById(R.id.txt_bride_groom);
        et_groom_name = findViewById(R.id.edit_bride_goom);


        //groom star

        txt_groom_star = findViewById(R.id.txt_groom_star);
        spinner_groom_star = findViewById(R.id.spinner_groom_star);


        //groom paadam

        txt_groom_paadam = findViewById(R.id.txt_groom_paadam);
        spinner_groom_paadam = findViewById(R.id.spinner_groom_paadam);

        //groom rasi

        txt_groom_rasi = findViewById(R.id.txt_groom_rasi);
        spinner_groom_rasi = findViewById(R.id.spinner_groom_rasi);

        //bride name
        txt_bride_name = findViewById(R.id.txt_bride);
        et_bride_name = findViewById(R.id.edit_bride);


        //bride star

        txt_bride_star = findViewById(R.id.txt_bride_star);
        spinner_bride_star = findViewById(R.id.spinner_bride_star);


        //bride paadam


        txt_bride_paadam = findViewById(R.id.txt_bride_paadam);
        spinner_bride_paadam = findViewById(R.id.spinner_bride_paadam);

        //bride rasi


        txt_bride_rasi = findViewById(R.id.txt_bride_rasi);
        spinner_bride_rasi = findViewById(R.id.spinner_bride_rasi);


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

        if (TextUtils.isEmpty(et_groom_name.getText().toString())) {
            et_groom_name.setError("Please Enter Bride Groom Name");
            et_groom_name.requestFocus();
            return false;
        }

        if (spinner_groom_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Bride Groom Star ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_groom_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Bride Groom Paadam ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_groom_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Bride Groom Rasi ", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(et_bride_name.getText().toString())) {
            et_bride_name.setError("Please Enter Bride Name");
            et_bride_name.requestFocus();
            return false;
        }

        if (spinner_bride_star.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Bride  Star ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_bride_paadam.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Bride  Paadam ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (spinner_bride_rasi.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please Select Bride  Rasi ", Toast.LENGTH_SHORT).show();
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
