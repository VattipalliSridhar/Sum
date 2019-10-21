package vmax.com.sumuhurtham.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.WebView_Activity;
import vmax.com.sumuhurtham.classes.UI_Class;

public class Contact_Fragment extends Fragment {


    private View view;
    private WebView contact_page_web_view;

    private RelativeLayout our_team_layout,contact_one,contact_two,contact_three;
    private ImageView our_team_image_one,our_team_image_two,our_team_image_three;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_contact_layout, container, false);


        contact_page_web_view=view.findViewById(R.id.contact_page_web_view);
        contact_page_web_view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        contact_page_web_view.setLongClickable(false);

        contact_page_web_view.loadDataWithBaseURL(null,getString(R.string.contact_page), "text/html", "UTF-8", null);



        our_team_layout=view.findViewById(R.id.our_team_layout);

        if(UI_Class.isNetworkAvailable(getActivity()))
        {
            our_team_layout.setVisibility(View.VISIBLE);
            our_team_image_one= view.findViewById(R.id.our_team_image_one);

            Glide.with(getActivity()).load("http://sumuhurtham.in/English/images/venkatrama.jpg")
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(our_team_image_one);

            our_team_image_two= view.findViewById(R.id.our_team_image_two);
            Glide.with(getActivity()).load("http://sumuhurtham.in/English/images/ganapathi.jpg")
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(our_team_image_two);

            our_team_image_three= view.findViewById(R.id.our_team_image_three);
            Glide.with(getActivity()).load("http://sumuhurtham.in/English/images/srinivas.jpg")
                    .placeholder(R.drawable.loading).error(R.drawable.loading)
                    .into(our_team_image_three);
        }else{
            our_team_layout.setVisibility(View.GONE);
        }

        contact_one = view.findViewById(R.id.contact_one);
        contact_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(UI_Class.isNetworkAvailable(getActivity()))
                {
                    Intent intent = new Intent(getActivity(), WebView_Activity.class);
                    intent.putExtra("web_img","http://sumuhurtham.in/English/images/Ventrama_pro.jpg");
                    intent.putExtra("value","img");
                    getActivity().startActivity(intent);
                }else{

                }
            }
        });


        contact_two = view.findViewById(R.id.contact_two);
        contact_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(UI_Class.isNetworkAvailable(getActivity()))
                {
                    Intent intent = new Intent(getActivity(), WebView_Activity.class);
                    intent.putExtra("web_img","http://sumuhurtham.in/English/images/Ganaapthi_pro.jpg");
                    intent.putExtra("value","img");
                    getActivity().startActivity(intent);
                }else{

                }
            }
        });


        contact_three = view.findViewById(R.id.contact_three);
        contact_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(UI_Class.isNetworkAvailable(getActivity()))
                {
                    Intent intent = new Intent(getActivity(), WebView_Activity.class);
                    intent.putExtra("web_img","http://sumuhurtham.in/English/images/Srinivas_pro.jpg");
                    intent.putExtra("value","img");
                    getActivity().startActivity(intent);
                }else{

                }
            }
        });


        return view;
    }
}
