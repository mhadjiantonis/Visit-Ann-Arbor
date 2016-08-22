package com.example.android.visitA2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Fragment that contains a list with the Sports Category
 */
public class SportsFragment extends Fragment {

    /**
     * Required empty public constructor
     */
    public SportsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate a layout that includes the RecyclerView
        View rootView = inflater.inflate(R.layout.list_container, container, false);

        // Create an ArrayList of instances of the class Sight and add in it the relevant elements.
        ArrayList<Sight> sightList = new ArrayList<>();
        sightList.add(new Sight(getString(R.string.stadium),
                getString(R.string.stadium_description),
                R.drawable.mich_stad,
                "http://www.mgoblue.com/facilities/michigan-stadium.html",
                "https://www.google.com/maps/place/Michigan+Stadium/@42.260801,-83.737319,15z/data=!4m5!3m4!1s0x0:0xd70008b6cc50d3ad!8m2!3d42.265837!4d-83.7486961"));
        sightList.add(new Sight(getString(R.string.ice_arena),
                getString(R.string.ice_arena_description),
                R.drawable.yost_ice,
                "http://yost.umich.edu/",
                "https://www.google.com/maps/place/Yost+Ice+Arena/@42.2673554,-83.7482302,16z/data=!4m5!3m4!1s0x0:0x925db7c4acd872de!8m2!3d42.2676164!4d-83.7409955"));
        sightList.add(new Sight(getString(R.string.golf_course),
                getString(R.string.golf_course_description),
                R.drawable.huron_golf,
                "http://www.a2gov.org/departments/Parks-Recreation/parks-places/huron-hills/Pages/default.aspx",
                "https://www.google.com/maps/place/Huron+Hills+Golf+Course/@42.2650251,-83.6900263,15z/data=!4m5!3m4!1s0x0:0x8811fbb81ad4bf47!8m2!3d42.2716565!4d-83.6968061"));
        sightList.add(new Sight(getString(R.string.ice_cube),
                getString(R.string.ice_cube_description),
                R.drawable.ice_cube,
                "http://www.a2ice3.com/",
                "https://www.google.com/maps/place/Ann+Arbor+Ice+Cube/@42.2542039,-83.7803992,17z/data=!4m5!3m4!1s0x0:0xe5989dd128b31826!8m2!3d42.2541998!4d-83.7782105"));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
