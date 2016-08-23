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
                getString(R.string.stadium_website),
                getString(R.string.stadium_map)));
        sightList.add(new Sight(getString(R.string.ice_arena),
                getString(R.string.ice_arena_description),
                R.drawable.yost_ice,
                getString(R.string.ice_arena_website),
                getString(R.string.ice_arena_map)));
        sightList.add(new Sight(getString(R.string.golf_course),
                getString(R.string.golf_course_description),
                R.drawable.huron_golf,
                getString(R.string.golf_course_website),
                getString(R.string.golf_course_map)));
        sightList.add(new Sight(getString(R.string.ice_cube),
                getString(R.string.ice_cube_description),
                R.drawable.ice_cube,
                getString(R.string.ice_cube_website),
                getString(R.string.ice_cube_map)));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
