package vmax.com.sumuhurtham.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import vmax.com.sumuhurtham.R;

public class Gallery_Recycler_View extends RecyclerView.Adapter<Gallery_Recycler_View.ViewHolderClasses> {

    private String[] galllery_item;
    private Context context;

    public Gallery_Recycler_View(FragmentActivity activity, String[] gallery_item_data) {
        context = activity;
        galllery_item = gallery_item_data;
    }

    @NonNull
    @Override
    public Gallery_Recycler_View.ViewHolderClasses onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.gallery_item_layout, parent, false);
        return new ViewHolderClasses(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Gallery_Recycler_View.ViewHolderClasses holder, int position) {

        Glide.with(context).load(galllery_item[position])
                .placeholder(R.drawable.loading).error(R.drawable.loading)
                .into(holder.gallery_img);
    }

    @Override
    public int getItemCount() {
        return galllery_item.length;
    }

    public class ViewHolderClasses extends RecyclerView.ViewHolder {
        private ImageView gallery_img;

        public ViewHolderClasses(@NonNull View itemView) {
            super(itemView);
            gallery_img = itemView.findViewById(R.id.gallery_img);
        }
    }
}
