package vmax.com.sumuhurtham.recycler_click_listener;

import android.view.View;

/**
 * Created by sridhar on 13/02/2019.
 */

public interface ClickListener {

    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
