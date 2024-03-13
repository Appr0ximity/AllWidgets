package com.example.allviews;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView number;
    View view;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.contactName);
        number = itemView.findViewById(R.id.contactNumber);
        view =itemView;
    }
}
