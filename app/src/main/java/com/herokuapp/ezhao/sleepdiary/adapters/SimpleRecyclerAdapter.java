package com.herokuapp.ezhao.sleepdiary.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.SimpleItemViewHolder>{
    private List<String> items;

    public SimpleRecyclerAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public SimpleItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        return new SimpleItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SimpleItemViewHolder viewHolder, int position) {
        String item = items.get(position);
        viewHolder.label.setText(item);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public final static class SimpleItemViewHolder extends RecyclerView.ViewHolder {
        public TextView label;

        public SimpleItemViewHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }
}
