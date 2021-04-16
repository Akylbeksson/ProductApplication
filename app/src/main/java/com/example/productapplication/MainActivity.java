package com.example.productapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ProductAdapter adapter;
    ArrayList<ProductModel> list;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recycler = findViewById(R.id.rv);
        adapter = new ProductAdapter();

        recycler.setAdapter(adapter);

        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(this);

        recycler.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0, new ProductModel("Title", "Description", 1));
        list.add(1, new ProductModel("Title", "Description", 2));
        list.add(2, new ProductModel("Title", "Description", 3));
        list.add(3, new ProductModel("Title", "Description", 4));
        list.add(4, new ProductModel("Title", "Description", 5));
        list.add(5, new ProductModel("Title", "Description", 6));
        list.add(6, new ProductModel("Title", "Description", 7));


        adapter.addText(list);
    }
}