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
public class cartFragment extends Fragment {
    private RecyclerView cartRV;
    private List<Product>cartList;
    private CartAdapter cartAdapter;


    public cartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cart, container, false);



        cartRV = view.findViewById(R.id.cartRV);
        cartAdapter = new CartAdapter(cartList,getContext());

        cartRV.setLayoutManager(new GridLayoutManager(getContext(),1));
        cartRV.setAdapter(cartAdapter);


        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cartList = new ArrayList<>();
        cartList.add(new Product("Card","2345",R.drawable.ic_account_circle_black_24dp));
        cartList.add(new Product("Card","2345",R.drawable.ic_account_circle_black_24dp));
        cartList.add(new Product("Card","2345",R.drawable.ic_account_circle_black_24dp));
        cartList.add(new Product("Card","2345",R.drawable.ic_account_circle_black_24dp));
        cartList.add(new Product("Card","2345",R.drawable.ic_account_circle_black_24dp));







    }
}
