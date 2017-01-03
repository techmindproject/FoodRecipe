package com.techmindproject.foodrecipe.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techmindproject.foodrecipe.R;

/**
 * Created by DECENTJEET on 02-01-2017.
 */

public class FavouritesFragment extends Fragment {

    public FavouritesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.favourites, container, false);

        return rootView;
    }

}