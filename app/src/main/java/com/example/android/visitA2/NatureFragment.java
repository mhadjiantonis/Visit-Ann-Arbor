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
                "http://www.lsa.umich.edu/mbg/see/NicholsArboretum.asp",
                "https://www.google.com/maps/place/University+of+Michigan:+Nichols+Arboretum/@42.2793164,-83.7347305,15z/data=!4m5!3m4!1s0x0:0xa08f10b09b351dca!8m2!3d42.280613!4d-83.7269166"));
        sightList.add(new Sight(getString(R.string.botanical_gardens),
                getString(R.string.botanical_gardens_description),
                R.drawable.botanical_gardens,
                "http://lsa.umich.edu/mbg/see/matthaei.asp",
                "https://www.google.com/maps/place/Matthaei+Botanical+Gardens/@42.2994081,-83.6621599,15z/data=!4m5!3m4!1s0x0:0x98f029f1869e4017!8m2!3d42.2994081!4d-83.6621599"));
        sightList.add(new Sight(getString(R.string.gallup_park),
                getString(R.string.gallup_park_description),
                R.drawable.gallup_park,
                "http://www.a2gov.org/departments/Parks-Recreation/parks-places/Pages/Gallup.aspx",
                "https://www.google.com/maps/place/Gallup+Park/@42.2748542,-83.701621,16z/data=!4m5!3m4!1s0x0:0xb4bd525408ec80d4!8m2!3d42.2730121!4d-83.6914176"));
        sightList.add(new Sight(getString(R.string.bird_hills),
                getString(R.string.bird_hills_description),
                R.drawable.bird_hills,
                "http://www.a2gov.org/departments/Parks-Recreation/parks-places/Pages/BirdHills.aspx",
                "https://www.google.com/maps/place/Bird+Hills+Nature+Area/@42.3028411,-83.7560365,15.82z/data=!4m5!3m4!1s0x0:0xf224061b8d33d148!8m2!3d42.3042216!4d-83.7610558"));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
