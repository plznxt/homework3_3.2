package com.geektechhw.homework3_32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharactersViewHolder extends RecyclerView.ViewHolder {
    private TextView character;

    public CharactersViewHolder(@NonNull View itemView) {
        super(itemView);
        character = itemView.findViewById(R.id.tv_characters);
    }

    public void bind(String charValue) {
        character.setText(charValue);
    }
}
