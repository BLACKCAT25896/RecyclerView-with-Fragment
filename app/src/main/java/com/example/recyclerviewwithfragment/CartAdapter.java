package com.example.recyclerviewwithfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {


    private List<Product>cartList;
    private Context context;

    public CartAdapter(List<Product> cartList, Context context) {
        this.cartList = cartList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Product currentCart = cartList.get(position);
        holder.proName.setText(currentCart.getProductName());
        holder.proPrice.setText(currentCart.getProductPrice());
//        holder.proQuantity.setText(currentCart.getCartProductQuantity());

    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView proName, proPrice, proQuantity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            proName = itemView.findViewById(R.id.productNameTV);
            proPrice = itemView.findViewById(R.id.productPriceTV);
            //proQuantity = itemView.findViewById(R.id.cartProductQuantity);


        }
    }
}
