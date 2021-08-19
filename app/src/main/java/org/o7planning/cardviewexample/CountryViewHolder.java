package org.o7planning.cardviewexample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends   RecyclerView.ViewHolder {

    ImageView flagView;
    TextView countryNameView;
    TextView populationView;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);

        this.flagView = (ImageView) itemView.findViewById(R.id.flag);
        this.countryNameView = (TextView) itemView.findViewById(R.id.name);
        this.populationView = (TextView) itemView.findViewById(R.id.population);
    }
}