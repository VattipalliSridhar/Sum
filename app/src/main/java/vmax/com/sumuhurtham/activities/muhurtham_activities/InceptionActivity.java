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

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.LocaleHelper;

public class InceptionActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {


    private TextView txt_wife_name,txt_husband_name,txt_wife_star,txt_wife_paadam,txt_wife_rasi,txt_husband_star,txt_husband_paadam,txt_husband_rasi,
            txt_place_muhurtham,txt_country,txt_near_town,txt_state,txt_required,txt_prefered_month,txt_prefered_week,txt_email,txt_write,
            txt_checks;
    private EditText et_wife_name,et_husband_name,et_place_muhurtham,et_near_town,et_required,et_email,et_write;
    private LinearLayout layout_wife_star,layout_wife_paadam,layout_wife_rasi,layout_husband_star,layout_husband_paadam,layout_husband_rasi,layout_country,
            layout_state,layout_prefered_month,layout_prefered_week,layout_checks;
    private Spinner spinner_wife_star,spinner_wife_paadam,spinner_wife_rasi,spinner_husband_star,spinner_husband_paadam,spinner_husband_rasi,
            spinner_country,spinner_state,spinner_prefered_month,spinner_prefered_week;

    private CheckBox checkBox;
    private Button btn_submit;


    private String muhurtham_type;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inception_ceremory);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InceptionActivity.this.finish();
            }
        });

        muhurtham_type = getIntent().getExtras().getString("muhurtham");
        TextView textView = findViewById(R.id.txt_title);
        textView.setText(muhurtham_type);
        //Wife name



        txt_wife_name=findViewById(R.id.txt_wife_name);
        et_wife_name=findViewById(R.id.edit_wife_name);


        //Wife star

        layout_wife_star=findViewById(R.id.layout_wife_star);
        txt_wife_star=findViewById(R.id.txt_wife_star);
        spinner_wife_star=findViewById(R.id.spinner_wife_star);


        //Wife paadam

        layout_wife_paadam=findViewById(R.id.layout_wife_paadam);
        txt_wife_paadam=findViewById(R.id.txt_wife_paadam);
        spinner_wife_paadam=findViewById(R.id.spinner_wife_paadam);

        //Wife rasi

        layout_wife_rasi=findViewById(R.id.layout_wife_rasi);
        txt_wife_rasi=findViewById(R.id.txt_wife_rasi);
        spinner_wife_rasi=findViewById(R.id.spinner_wife_rasi);

        //Husband name



        txt_husband_name=findViewById(R.id.txt_husband_name);
        et_husband_name=findViewById(R.id.edit_husband_name);


        //Husband star

        layout_husband_star=findViewById(R.id.layout_husband_star);
        txt_husband_star=findViewById(R.id.txt_husband_star);
        spinner_husband_star=findViewById(R.id.spinner_husband_star);


        //Husband paadam

        layout_husband_paadam=findViewById(R.id.layout_husband_paadam);
        txt_husband_paadam=findViewById(R.id.txt_husband_paadam);
        spinner_husband_paadam=findViewById(R.id.spinner_husband_paadam);

        //Husband rasi

        layout_husband_rasi=findViewById(R.id.layout_husband_rasi);
        txt_husband_rasi=findViewById(R.id.txt_husband_rasi);
        spinner_husband_rasi=findViewById(R.id.spinner_husband_rasi);


        //muhurtham place

        txt_place_muhurtham=findViewById(R.id.txt_place_muhurtham);
        et_place_muhurtham=findViewById(R.id.edit_place_muhurtham);


        //country
        layout_country=findViewById(R.id.layout_country);
        txt_country=findViewById(R.id.txt_country);
        spinner_country=findViewById(R.id.spinner_country);


        //near town

        txt_near_town=findViewById(R.id.txt_near_town);
        et_near_town=findViewById(R.id.edit_near_town);



        //state
        layout_state=findViewById(R.id.layout_state);
        txt_state=findViewById(R.id.txt_state);
        spinner_state=findViewById(R.id.spinner_state);


        //required muhurtham

        txt_required=findViewById(R.id.txt_required);
        et_required=findViewById(R.id.edit_required);


        //prefered month


        layout_prefered_month=findViewById(R.id.layout_perfered_month);
        spinner_prefered_month=findViewById(R.id.spinner_month);
        txt_prefered_month=findViewById(R.id.txt_perfered_month);



        //prefered week
        layout_prefered_week=findViewById(R.id.layout_perfered_week);
        spinner_prefered_week=findViewById(R.id.spinner_week);
        txt_prefered_week=findViewById(R.id.txt_perfered_week);



        //email

        txt_email=findViewById(R.id.txt_email);
        et_email=findViewById(R.id.edit_email_id);





        //write
        txt_write=findViewById(R.id.txt_write);
        et_write=findViewById(R.id.edit_write);

        //checks



        layout_checks=findViewById(R.id.layout_checks);
        txt_checks=findViewById(R.id.txt_muhuthrutam);
        checkBox=findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(this);

        //submit

        btn_submit=findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Validation()){

                }
            }
        });
    }

    private boolean Validation() {

        if(TextUtils.isEmpty(et_wife_name.getText().toString())){
            et_wife_name.setError("Please Enter Wife Name");
            et_wife_name.requestFocus();
            return false;
        }

        if(spinner_wife_star.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Wife Star ",Toast.LENGTH_SHORT).show();
            return false;
        }
        if(spinner_wife_paadam.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Wife Paadam ",Toast.LENGTH_SHORT).show();
            return false;
        }
        if(spinner_wife_rasi.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Wife Rasi ",Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(et_husband_name.getText().toString())){
            et_husband_name.setError("Please Enter Husband Name");
            et_husband_name.requestFocus();
            return false;
        }

        if(spinner_husband_star.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Husband  Star ",Toast.LENGTH_SHORT).show();
            return false;
        }
        if(spinner_husband_paadam.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Husband  Paadam ",Toast.LENGTH_SHORT).show();
            return false;
        }
        if(spinner_husband_rasi.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Husband  Rasi ",Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(et_place_muhurtham.getText().toString())){
            et_place_muhurtham.setError("Please Enter Place Of  Muhurtham");
            et_place_muhurtham.requestFocus();
            return false;
        }


        if(spinner_country.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Country",Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(et_near_town.getText().toString())){
            et_near_town.setError("Please Enter Near Town");
            et_near_town.requestFocus();
            return false;
        }

        if(spinner_state.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select State",Toast.LENGTH_SHORT).show();
            return false;
        }
        if(TextUtils.isEmpty(et_required.getText().toString())){
            et_required.setError("Please Enter Required Muhurtham");
            et_required.requestFocus();
            return false;
        }

        if(spinner_prefered_month.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Prefered Months",Toast.LENGTH_SHORT).show();
            return false;
        }

        if(spinner_prefered_week.getSelectedItemPosition()==0){
            Toast.makeText(this,"Please Select Prefered Week",Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(et_email.getText().toString())){
            et_email.setError("Please Enter Email Id");
            et_email.requestFocus();
            return false;
        }

        if(TextUtils.isEmpty(et_write.getText().toString())){
            et_write.setError("Please Enter Write  Meassage");
            et_write.requestFocus();
            return false;
        }

        return true;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
