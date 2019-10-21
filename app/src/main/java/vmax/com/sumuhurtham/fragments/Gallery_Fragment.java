package vmax.com.sumuhurtham.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.adapters.Gallery_Recycler_View;
import vmax.com.sumuhurtham.recycler_click_listener.ClickListener;
import vmax.com.sumuhurtham.recycler_click_listener.RecyclerTouchListener;

public class Gallery_Fragment extends Fragment {

    private View view;
    private RecyclerView gallery_recycler_view;
    private String[] gallery_item_data;
    private String[] gallery_item_large_data;


    private Dialog customDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_gallery_layout, container, false);

        gallery_item_data = getActivity().getResources().getStringArray(R.array.gallery_thumb_array);
        gallery_item_large_data = getActivity().getResources().getStringArray(R.array.gallery_large_img);

        gallery_recycler_view = view.findViewById(R.id.gallery_recycler_view);
        GridLayoutManager mLManager_efct1 = new GridLayoutManager(getActivity(), 3);
        gallery_recycler_view.setLayoutManager(mLManager_efct1);
        gallery_recycler_view.setHasFixedSize(true);


        Gallery_Recycler_View recyclerViewAdapter = new Gallery_Recycler_View(getActivity(), gallery_item_data);
        gallery_recycler_view.setAdapter(recyclerViewAdapter);

        gallery_recycler_view.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), gallery_recycler_view, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

                gallery_img(position);


            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        return view;
    }

    private void gallery_img(int position)
    {
        customDialog = new Dialog(getActivity(), android.R.style.Theme_Translucent);
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        customDialog.setCancelable(false);
        customDialog.setContentView(R.layout.gallery_img_view_layout);

        ImageView gallery_img = customDialog.findViewById(R.id.img_view_gallery);
        Glide.with(getActivity()).load(gallery_item_large_data[position])
                .placeholder(R.drawable.loading).error(R.drawable.loading)
                .into(gallery_img);
        customDialog.findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog.dismiss();
            }
        });
        customDialog.show();
    }
}
