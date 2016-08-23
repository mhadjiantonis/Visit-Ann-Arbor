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
 * Fragment that contains a list with the Museum & Arts Category
 */
public class MuseumFragment extends Fragment {

    /**
     * Required empty public constructor
     */
    public MuseumFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate a layout that includes the RecyclerView
        View rootView = inflater.inflate(R.layout.list_container, container, false);

        // Create an ArrayList of instances of the class Sight and add in it the relevant elements.
        ArrayList<Sight> sightList = new ArrayList<>();
        sightList.add(new Sight(getString(R.string.nat_history_museum),
                getString(R.string.nat_history_museum_description),
                R.drawable.natural_history,
                getString(R.string.nat_history_museum_website),
                getString(R.string.nat_history_museum_map)));
        sightList.add(new Sight(getString(R.string.art_museum),
                getString(R.string.art_museum_description),
                R.drawable.art_museum,
                getString(R.string.art_museum_website),
                getString(R.string.art_museum_map)));
        sightList.add(new Sight(getString(R.string.hands_on_museum),
                getString(R.string.hands_on_museum_description),
                R.drawable.hands_on,
                getString(R.string.hands_on_museum_website),
                getString(R.string.hands_on_museum_map)));
        sightList.add(new Sight(getString(R.string.archeology_museum),
                getString(R.string.archeology_museum_description),
                R.drawable.archeology_museum,
                getString(R.string.archeology_museum_website),
                getString(R.string.archelogy_museum_map)));
        sightList.add(new Sight(getString(R.string.hill_auditorium),
                getString(R.string.hill_auditorium_description),
                R.drawable.hill_auditorium,
                getString(R.string.hill_auditorium_website),
                getString(R.string.hill_auditorium_map)));
        sightList.add(new Sight(getString(R.string.michigan_theater),
                getString(R.string.michigan_theater_description),
                R.drawable.michigan_theater,
                getString(R.string.michigan_theater_website),
                getString(R.string.michigan_theater_map)));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
