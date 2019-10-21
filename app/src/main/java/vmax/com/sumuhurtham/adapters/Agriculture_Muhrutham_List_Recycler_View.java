package vmax.com.sumuhurtham.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import vmax.com.sumuhurtham.R;

public class Agriculture_Muhrutham_List_Recycler_View extends RecyclerView.Adapter<Agriculture_Muhrutham_List_Recycler_View.ViewHolders> {

    private String[] muhurtham_list;
    private Context context;

    public Agriculture_Muhrutham_List_Recycler_View(FragmentActivity activity, String[] all_muhurtham_list) {
        context = activity;
        muhurtham_list = all_muhurtham_list;

    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.muhurtham_list_adapter, parent, false);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders holder, int position) {

        holder.muhurtham_list_txt.setText(muhurtham_list[position]);
       // holder.muhurtham_list_txt.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return muhurtham_list.length;
    }

    public class ViewHolders extends RecyclerView.ViewHolder {

        TextView muhurtham_list_txt;
        public ViewHolders(@NonNull View itemView) {
            super(itemView);

            muhurtham_list_txt = itemView.findViewById(R.id.muhrutham_txt);
        }
    }
}
