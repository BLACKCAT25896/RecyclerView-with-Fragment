package com.example.recyclerviewwithfragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Product>productList;
    private ProductAdapter adapter;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);


        recyclerView = v.findViewById(R.id.pR);

        adapter = new ProductAdapter(productList,getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
        recyclerView.setAdapter(adapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productList = new ArrayList<>();
        productList.add(new Product("Shirt","1230",R.drawable.shirt));


    }
}
