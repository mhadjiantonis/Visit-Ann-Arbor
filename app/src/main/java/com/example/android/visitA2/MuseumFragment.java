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
                "https://lsa.umich.edu/ummnh/",
                "https://www.google.com/maps/place/University+of+Michigan+Museum+of+Natural+History/@42.2782941,-83.7344736,15z/data=!4m5!3m4!1s0x0:0x4fdbd3cfacc8dde6!8m2!3d42.2782941!4d-83.7344736"));
        sightList.add(new Sight(getString(R.string.art_museum),
                getString(R.string.art_museum_description),
                R.drawable.art_museum,
                "http://www.umma.umich.edu/",
                "https://www.google.com/maps/place/University+of+Michigan+Museum+of+Art/@42.2753993,-83.7397348,15z/data=!4m5!3m4!1s0x0:0xc8cff62865e159ce!8m2!3d42.2753993!4d-83.7397348"));
        sightList.add(new Sight(getString(R.string.hands_on_museum),
                getString(R.string.hands_on_museum_description),
                R.drawable.hands_on,
                "http://www.aahom.org/",
                "https://www.google.com/maps/place/Ann+Arbor+Hands-On+Museum/@42.2816444,-83.7465379,15z/data=!4m5!3m4!1s0x0:0x49f3f678c538e26f!8m2!3d42.2816444!4d-83.7465379"));
        sightList.add(new Sight(getString(R.string.archeology_museum),
                getString(R.string.archeology_museum_description),
                R.drawable.archeology_museum,
                "https://lsa.umich.edu/kelsey/",
                "https://www.google.com/maps/place/University+of+Michigan:+Kelsey+Museum+of+Archaeology/@42.2767137,-83.7413815,15z/data=!4m5!3m4!1s0x0:0x3cf3ae0521160085!8m2!3d42.2767137!4d-83.7413815"));
        sightList.add(new Sight(getString(R.string.hill_auditorium),
                getString(R.string.hill_auditorium_description),
                R.drawable.hill_auditorium,
                "https://www.music.umich.edu/about/facilities/central_campus/hill/",
                "https://www.google.com/maps/place/Hill+Auditorium/@42.2791138,-83.7390161,15z/data=!4m5!3m4!1s0x0:0x825ff43112bad153!8m2!3d42.2791138!4d-83.7390161"));
        sightList.add(new Sight(getString(R.string.michigan_theater),
                getString(R.string.michigan_theater_description),
                R.drawable.michigan_theater,
                "http://www.michtheater.org/",
                "https://www.google.com/maps/place/Michigan+Theater/@42.2796608,-83.7419874,15z/data=!4m5!3m4!1s0x0:0x5fceaacaf34695ed!8m2!3d42.2796608!4d-83.7419874"));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
