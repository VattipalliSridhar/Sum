package vmax.com.sumuhurtham.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.classes.UI_Class;

public class Home_Fragment extends Fragment {

    private View view;
    private WebView home_page_web_view;


    private FragmentActivity context;

    public static final String DEVELOPER_KEY="AIzaSyAKehA6iAEl6qEetr4IKqlouDgmkFFpYMg";
    public static final String VIDEO_ID="OAR4hxBOjL8";
    public static final int RECOVERY_DIALOG_REQUEST=1;

    private YouTubePlayer YPlayer;
    @Override
    public void onAttach(Activity activity) {

        if (activity instanceof FragmentActivity) {
            context = (FragmentActivity) activity;
        }
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home_layout, container, false);

        context=getActivity();


        home_page_web_view=view.findViewById(R.id.home_page_web_view);
        home_page_web_view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        home_page_web_view.setLongClickable(false);
        home_page_web_view.loadDataWithBaseURL(null,getString(R.string.home_page), "text/html", "UTF-8", null);


        if(UI_Class.isNetworkAvailable(getActivity()))
        {
            YouTubePlayerSupportFragment youTubePlayerFragment = new YouTubePlayerSupportFragment();
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.add(R.id.youtube,youTubePlayerFragment).commit();
            youTubePlayerFragment.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {

                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider arg0, YouTubePlayer youTubePlayer, boolean b) {
                    if (!b) {
                        YPlayer = youTubePlayer;
                        //YPlayer.setFullscreen(true);
                        YPlayer.cueVideo(VIDEO_ID);
                        //YPlayer.play();
                    }
                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider arg0, YouTubeInitializationResult arg1) {
                    // TODO Auto-generated method stub

                }
            });
        }


        return view;
    }


}
