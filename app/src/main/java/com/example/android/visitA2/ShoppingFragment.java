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
                getString(R.string.kerrytown_website),
                getString(R.string.kerrytown_map)));
        sightList.add(new Sight(getString(R.string.mall),
                getString(R.string.mall_description),
                R.drawable.briarwood_mall,
                getString(R.string.mall_website),
                getString(R.string.mall_map)));
        sightList.add(new Sight(getString(R.string.farmers_market),
                getString(R.string.farmers_market_description),
                R.drawable.farmers_market,
                getString(R.string.farmers_market_website),
                getString(R.string.farmers_market_map)));

        // Find the RecyclerView and attach to it the corresponding adapter
        RecyclerView sightListView = (RecyclerView) rootView.findViewById(R.id.sight_list);
        sightListView.setAdapter(new SightAdapter(getActivity(), sightList));
        sightListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
