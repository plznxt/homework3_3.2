package com.geektechhw.homework3_32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharactersAdapter extends RecyclerView.Adapter<CharactersViewHolder> {
    private ArrayList<String> data;

    public CharactersAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public CharactersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharactersViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_characters, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharactersViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
