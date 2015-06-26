package com.herokuapp.ezhao.sleepdiary.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.herokuapp.ezhao.sleepdiary.R;

import java.util.ArrayList;

public class LogRecyclerAdapter extends RecyclerView.Adapter<LogRecyclerAdapter.ViewHolder> {
    private ArrayList<String> items;

    public LogRecyclerAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_log, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvHabitName;
        public Button btnScore;

        public ViewHolder(View view) {
            super(view);
            tvHabitName = (TextView) view.findViewById(R.id.tvHabitName);
            btnScore = (Button) view.findViewById(R.id.btnScore);
        }
    }
}
