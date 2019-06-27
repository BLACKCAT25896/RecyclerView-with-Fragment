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
    private List<Product> productList;
    private Context context;

    public CartAdapter(List<Product> productList, Context context) {
        this.productList = productList;
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

        Product cartProduct = productList.get(position);
        holder.pName.setText(cartProduct.getProductName());
        holder.pPrice.setText(cartProduct.getProductPrice());
        holder.pQuantity.setText(cartProduct.getQuantity());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView pName, pPrice, pQuantity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pName = itemView.findViewById(R.id.productNameTV);
            pPrice= itemView.findViewById(R.id.productPriceTV);
            pQuantity = itemView.findViewById(R.id.cartProductQuantity);

        }
    }
}
