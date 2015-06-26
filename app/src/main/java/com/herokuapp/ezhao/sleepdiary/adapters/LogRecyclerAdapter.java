package com.herokuapp.ezhao.sleepdiary.adapters;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.herokuapp.ezhao.sleepdiary.R;
import com.herokuapp.ezhao.sleepdiary.models.Habit;

import java.util.ArrayList;

public class LogRecyclerAdapter extends RecyclerView.Adapter<LogRecyclerAdapter.ViewHolder> {
    private ArrayList<Habit> items;

    public LogRecyclerAdapter(ArrayList<Habit> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_log, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindHabit(items.get(position));
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvHabitName;
        private Button btnScore;

        public ViewHolder(View view) {
            super(view);
            tvHabitName = (TextView) view.findViewById(R.id.tvHabitName);
            btnScore = (Button) view.findViewById(R.id.btnScore);

            Typeface helveticaNeueLight = Typeface.createFromAsset(tvHabitName.getContext().getAssets(), "fonts/helveticaneuelight.ttf");
            tvHabitName.setTypeface(helveticaNeueLight);
        }

        public void bindHabit(Habit habit) {
            tvHabitName.setText(habit.getHabitName());
        }
    }
}
