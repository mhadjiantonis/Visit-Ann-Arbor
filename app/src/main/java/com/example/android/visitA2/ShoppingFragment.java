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
 * Fragment that contains a list with the Shopping Category
 */
public class ShoppingFragment extends Fragment {

    /**
     * Required empty public constructor
     */
    public ShoppingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate a layout that includes the RecyclerView
        View rootView = inflater.inflate(R.layout.list_container, container, false);

        // Create an ArrayList of instances of the class Sight and add in it the relevant elements.
        ArrayList<Sight> sightList = new ArrayList<>();
        sightList.add(new Sight(getString(R.string.kerrytown),
                getString(R.string.kerrytown_description),
                R.drawable.kerrytown,
                "http://kerrytown.com/",
                "https://www.google.com/maps/place/Kerrytown+Market+%26+Shops/@42.28455,-83.7484971,17z/data=!3m1!4b1!4m5!3m4!1s0x883cae15c4b397b9:0x82edafecf0befe13!8m2!3d42.2845461!4d-83.7463084"));
        sightList.add(new Sight(getString(R.string.mall),
                getString(R.string.mall_description),
                R.drawable.briarwood_mall,
                "http://www.simon.com/mall/briarwood-mall",
                "https://www.google.com/maps/place/Briarwood+Mall/@42.24039,-83.746537,15z/data=!4m5!3m4!1s0x0:0x8bcc4027e6efdfc3!8m2!3d42.2404129!4d-83.7465933"));
        sightList.add(new Sight(getString(R.string.farmers_market),
                getString(R.string.farmers_market_description),
                R.drawable.farmers_market,
                "http://www.a2gov.org/departments/Parks-Recreation/parks-places/farmers-market/Pages/default.aspx",
                "https://www.google.com/maps/place/Ann+Arbor+Farmers+Market/@42.283908,-83.7485497,17z/data=!3m1!4b1!4m5!3m4!1s0x883cae160996500d:0x10ba5066906402d3!8m2!3d42.283908!4d-83.746361"));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
