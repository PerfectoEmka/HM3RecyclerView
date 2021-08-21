package com.example.hw3recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    ArrayList<Countries> countries;
    Context context;


    public void setlist(ArrayList<Countries> countries) {
        this.countries = countries;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.country_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(countries.get(position).getName()
                ,countries.get(position).getCapitalCity()
                ,countries.get(position).getFlag());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, capitalCity;
        private ImageView flag;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.country_tv);
            capitalCity = itemView.findViewById(R.id.capital_city_tv);
            flag = itemView.findViewById(R.id.flag_iv);

        }

        @SuppressLint("UseCompatLoadingForDrawables")
        public void onBind(String name, String capitalCity, int flag) {

            this.name.setText(name);
            this.capitalCity.setText(capitalCity);
            this.flag.setImageDrawable(itemView.getResources().getDrawable(flag));
        }
    }
}
