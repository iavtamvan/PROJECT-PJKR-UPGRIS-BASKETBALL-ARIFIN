package com.iav.basketball.activity.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iav.basketball.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class IdeAboutFragment extends Fragment {


    public IdeAboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ide_about, container, false);
    }

}
