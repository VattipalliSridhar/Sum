package vmax.com.sumuhurtham.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.MainActivity;

public class MenuAdapter extends BaseAdapter {

    private int[] menu_icon;
    private String[] menu_name;
    private Context context;
    private  LayoutInflater inflater=null;

    public MenuAdapter(MainActivity mainActivity, int[] menu_item_icon, String[] menu_item_name) {
        context = mainActivity;
        menu_icon = menu_item_icon;
        menu_name = menu_item_name;
        inflater = ( LayoutInflater )mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return menu_icon.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View rowView=inflater.inflate(R.layout.menu_item_layout, null,true);

        TextView menu_txt = rowView.findViewById(R.id.menu_txt);
        ImageView menu_image = rowView.findViewById(R.id.menu_image);


        Glide.with(context).load(menu_icon[position])
                .placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher)
                .into(menu_image);
        menu_txt.setText(""+menu_name[position]);


        return rowView;
    }
}
