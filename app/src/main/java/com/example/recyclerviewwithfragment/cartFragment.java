package com.example.recyclerviewwithfragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class cartFragment extends Fragment {
    private RecyclerView cartRV;
    private List<Product>productList;
    private CartAdapter cartAdapter;


    public cartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cart, container, false);



        init(view);
        initRecyclerView(view);


        return view;
    }

    private void init(View view) {

        cartRV = view.findViewById(R.id.cartRV);
        cartAdapter = new CartAdapter(productList,getContext());
        cartRV.setLayoutManager(new LinearLayoutManager(getContext()));
        cartRV.setAdapter(cartAdapter);



    }

    private void initRecyclerView(View view) {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        productList = new ArrayList<>();
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));
        productList.add(new Product("Shirt","5555",R.drawable.shirt,10));

    }
}
