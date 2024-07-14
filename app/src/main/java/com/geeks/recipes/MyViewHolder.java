package com.geeks.recipes;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    protected ImageView imageView;
    protected TextView nameView, recipeView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView= itemView.findViewById(R.id.img);
        nameView = itemView.findViewById(R.id.tv_name);
        recipeView= itemView.findViewById(R.id.tv_recipe);
    }
}