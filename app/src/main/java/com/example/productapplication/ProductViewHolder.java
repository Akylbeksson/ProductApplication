package com.example.productapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView title;
    TextView desc;
    TextView count;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.tv1);
        desc = itemView.findViewById(R.id.tv2);
        count = itemView.findViewById(R.id.tv_count);


    }

    public void onBind(ProductModel info) {
        title.setText(info.title);
        desc.setText(info.desc);
        count.setText(String.valueOf(info.count));
    }

    @Override
    public void onClick(View v) {

    }
}
