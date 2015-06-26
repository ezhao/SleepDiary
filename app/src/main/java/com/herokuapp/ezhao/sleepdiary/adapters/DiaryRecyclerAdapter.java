package com.herokuapp.ezhao.sleepdiary.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.herokuapp.ezhao.sleepdiary.R;

import java.util.List;

public class DiaryRecyclerAdapter extends RecyclerView.Adapter<DiaryRecyclerAdapter.ViewHolder> {
    private List<String> items;
    OnClickListener listener;

    public DiaryRecyclerAdapter(List<String> items, OnClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day, parent, false);
        return new ViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        String item = items.get(position);
        //viewHolder.tvDate.setText(item);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvDate;
        public TextView tvScore;

        public ViewHolder(View view, OnClickListener listener) {
            super(view);
            view.setOnClickListener(listener);
            tvDate = (TextView) view.findViewById(R.id.tvDate);
            tvScore = (TextView) view.findViewById(R.id.tvScore);
        }
    }
}
