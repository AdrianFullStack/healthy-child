package com.ninosano.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ninosano.Models.Baby;
import com.ninosano.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterBaby extends RecyclerView.Adapter<AdapterBaby.ViewHolder>{
    private List<Baby> items = new ArrayList<>();
    private Context ctx;

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterBaby(Context context, List<Baby> items) {
        this.items = items;
        ctx = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.tv_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Baby b = items.get(position);
        holder.name.setText(b.name);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
