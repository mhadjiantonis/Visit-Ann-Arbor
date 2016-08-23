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
 * Fragment that contains a list with the Nature Category
 */
public class NatureFragment extends Fragment {

    /**
     * Required empty public constructor
     */
    public NatureFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate a layout that includes the RecyclerView
        View rootView = inflater.inflate(R.layout.list_container, container, false);

        // Create an ArrayList of instances of the class Sight and add in it the relevant elements.
        ArrayList<Sight> sightList = new ArrayList<>();
        sightList.add(new Sight(getString(R.string.arboretum),
                getString(R.string.arboretum_description),
                R.drawable.nich_arb,
                getString(R.string.arboretum_website),
                getString(R.string.arboretum_map)));
        sightList.add(new Sight(getString(R.string.botanical_gardens),
                getString(R.string.botanical_gardens_description),
                R.drawable.botanical_gardens,
                getString(R.string.botanical_gardens_website),
                getString(R.string.botanical_gardens_map)));
        sightList.add(new Sight(getString(R.string.gallup_park),
                getString(R.string.gallup_park_description),
                R.drawable.gallup_park,
                getString(R.string.gallup_park_website),
                getString(R.string.gallup_park_map)));
        sightList.add(new Sight(getString(R.string.bird_hills),
                getString(R.string.bird_hills_description),
                R.drawable.bird_hills,
                getString(R.string.bird_hills_website),
                getString(R.string.bird_hills_map)));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
