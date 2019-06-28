package com.example.recyclerviewwithfragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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
public class ProductFragment extends Fragment {
    private RecyclerView productR;
    private List<Product>productList;
    private ProductAdapter adapter;


    public ProductFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_product, container, false);


        init(view);
        initRecyclerView(view);







        return view;
    }

    private void initRecyclerView(View view) {
        productR = view.findViewById(R.id.productRecyclerView);
        productR.setLayoutManager(new GridLayoutManager(getContext(),3));
        productR.setAdapter(adapter);
    }

    private void init(View view) {

        adapter = new ProductAdapter(productList,getContext());

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productList = new ArrayList<>();
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));
        productList.add(new Product("Shirt","2000",R.drawable.shirt,12));




    }
}
