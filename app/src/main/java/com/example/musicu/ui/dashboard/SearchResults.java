package com.example.musicu.ui.dashboard;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.musicu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchResults extends Fragment {

    public SearchResults() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_search_results, container, false);

        TextView queryTextView = root.findViewById(R.id.searchQuery);
        queryTextView.setText(getArguments().getString(("query")));

        return root;
    }

}
