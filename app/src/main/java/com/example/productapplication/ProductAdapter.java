package com.example.productapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    ArrayList<ProductModel> info = new ArrayList<ProductModel>();

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.product_list, parent, false);
        return new ProductViewHolder(view);
    }


    public void addText(ArrayList<ProductModel> list) {

        info = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.onBind(info.get(position));


    }
    /*public void addItem(ArrayList<ProductModel> list) {
        info.add(ArrayList<ProductModel> list);
        notifyItemInserted(info.size());
    }*/

    @Override
    public int getItemCount() {
        return info.size();
    }


}
