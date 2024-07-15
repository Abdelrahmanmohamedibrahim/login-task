package com.oneteamplus.loginapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter <ItemListAdapter.ItemViewHolder> {
    private List <String> itemsList = new ArrayList<>();
    @NonNull
    @Override
    public ItemListAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdapter.ItemViewHolder holder, int position) {
        holder.dataItem.setText(itemsList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public void setArray(List <String> itemsList){
        this.itemsList = itemsList;
        notifyDataSetChanged();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView dataItem;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            dataItem = itemView.findViewById(R.id.data_item);
        }
    }
}
