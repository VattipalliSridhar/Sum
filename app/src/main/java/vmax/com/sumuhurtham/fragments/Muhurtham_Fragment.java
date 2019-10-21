package vmax.com.sumuhurtham.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import vmax.com.sumuhurtham.R;
import vmax.com.sumuhurtham.activities.muhurtham_activities.AdoptingActivity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.BrideActivity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.Common_Muhurtham_Form_Activity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.ForAppointmentActivity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.InceptionActivity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.MarriageCeremonyActivity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.MuhurthamActivity;
import vmax.com.sumuhurtham.activities.muhurtham_activities.UpanayanamActivity;
import vmax.com.sumuhurtham.adapters.Agriculture_Muhrutham_List_Recycler_View;
import vmax.com.sumuhurtham.adapters.Normal_Muhrutham_List_Recycler_View;
import vmax.com.sumuhurtham.recycler_click_listener.ClickListener;
import vmax.com.sumuhurtham.recycler_click_listener.RecyclerTouchListener;

public class Muhurtham_Fragment extends Fragment {

    private View view;
    private String[] all_muhurtham_list, agriculture_muhurtham_list;

    private RecyclerView agriculture_muhurthams_recycler, normal_muhurthams_recycler_view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_muhurtham_layout, container, false);


        all_muhurtham_list = this.getResources().getStringArray(R.array.normal_muhurthm_list);
        normal_muhurthams_recycler_view = view.findViewById(R.id.normal_muhurthams_recycler_view);
        Normal_Muhrutham_List_Recycler_View normalMuhruthamList_recycler_view = new Normal_Muhrutham_List_Recycler_View(getActivity(), all_muhurtham_list);
        @SuppressLint("WrongConstant")
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        normal_muhurthams_recycler_view.setLayoutManager(verticalLayoutManager);
        normal_muhurthams_recycler_view.setAdapter(normalMuhruthamList_recycler_view);
        normal_muhurthams_recycler_view.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), normal_muhurthams_recycler_view, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

                switch (position) {
                    case 0:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 1:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 2:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 3:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 4:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 5:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 6:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 7:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        upanayana_intent(all_muhurtham_list[position]);

                        break;
                    case 8:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 9:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 10:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 11:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        marriage_last(all_muhurtham_list[position]);
                        break;
                    case 12:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 13:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        marriage_ceremony(all_muhurtham_list[position]);
                        break;
                    case 14:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 15:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 16:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        marriage_ceremony(all_muhurtham_list[position]);
                        break;
                    case 17:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        adopting_ceremony(all_muhurtham_list[position]);
                        break;
                    case 18:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 19:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        muhurtham_auspicious(all_muhurtham_list[position]);
                        break;
                    case 20:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 21:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 22:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        enter_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 23:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        enter_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 24:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 25:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 26:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 27:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 28:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 29:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 30:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        appointment_muhurtham(all_muhurtham_list[position]);

                        break;

                    case 31:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 32:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 33:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 34:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 35:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 36:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 37:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 38:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 39:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 40:
                        Log.e("msg", "" + all_muhurtham_list[position]);
                        enter_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 41:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                    case 42:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 43:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;
                    case 44:
                        common_muhurtham(all_muhurtham_list[position]);
                        break;

                }

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        agriculture_muhurtham_list = this.getResources().getStringArray(R.array.agriculture_muhrtham_list);
        agriculture_muhurthams_recycler = view.findViewById(R.id.agriculture_muhurthams_recycler);
        Agriculture_Muhrutham_List_Recycler_View agricultureMuhruthamListRecyclerView = new Agriculture_Muhrutham_List_Recycler_View(getActivity(), agriculture_muhurtham_list);
        @SuppressLint("WrongConstant")
        LinearLayoutManager verticalLayoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        agriculture_muhurthams_recycler.setLayoutManager(verticalLayoutManager1);
        agriculture_muhurthams_recycler.setAdapter(agricultureMuhruthamListRecyclerView);
        agriculture_muhurthams_recycler.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), agriculture_muhurthams_recycler, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

                agriculture_muhurthams(agriculture_muhurtham_list[position]);


            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        return view;
    }

    private void appointment_muhurtham(String muhurthams)
    {
        Intent intent = new Intent(getActivity(), ForAppointmentActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void muhurtham_auspicious(String muhurthams) {
        Intent intent = new Intent(getActivity(), MuhurthamActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void adopting_ceremony(String muhurthams) {
        Intent intent = new Intent(getActivity(), AdoptingActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void marriage_last(String muhurthams) {
        Intent intent = new Intent(getActivity(), MarriageCeremonyActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void marriage_ceremony(String muhurthams) {

        Intent intent = new Intent(getActivity(), BrideActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void enter_muhurtham(String muhurthams) {
        Intent intent = new Intent(getActivity(), InceptionActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void upanayana_intent(String muhurthams) {
        Intent intent = new Intent(getActivity(), UpanayanamActivity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void common_muhurtham(String muhurthams) {
        Intent intent = new Intent(getActivity(), Common_Muhurtham_Form_Activity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }

    private void agriculture_muhurthams(String muhurthams) {
        Intent intent = new Intent(getActivity(), Common_Muhurtham_Form_Activity.class);
        intent.putExtra("muhurtham", muhurthams);
        getActivity().startActivity(intent);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
