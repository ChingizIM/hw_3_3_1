package com.example.hw_3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName, tvNumber, tvAddress;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.name);
        tvNumber = itemView.findViewById(R.id.number);
        tvAddress = itemView.findViewById(R.id.address);
    }
    public void bind(Person person){

        tvName.setText(person.getName());
        tvNumber.setText(person.getNumber());
        tvAddress.setText(person.getAddress());
    }
}