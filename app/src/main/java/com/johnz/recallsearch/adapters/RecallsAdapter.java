package com.johnz.recallsearch.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.johnz.recallsearch.CPSCDetailsActivity;
import com.johnz.recallsearch.R;
import com.johnz.recallsearch.models.RecallResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 9/25/2016.
 */
public class RecallsAdapter extends RecyclerView.Adapter<RecallsAdapter.RecallViewHolder> {

    private List<RecallResponse> recalls = new ArrayList<>();
    private int rowLayout;
    private Context context;


    public class RecallViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        LinearLayout recallsLayout;
        TextView recallTitle;
        TextView date;
        TextView recallDescription;
        TextView rating;


        public RecallViewHolder(View v) {
            super(v);
            recallsLayout = (LinearLayout) v.findViewById(R.id.recalls_layout);
            recallTitle = (TextView) v.findViewById(R.id.title);
            date = (TextView) v.findViewById(R.id.date);
            recallDescription = (TextView) v.findViewById(R.id.description);
            v.setClickable(true);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            RecallResponse current = recalls.get(getAdapterPosition());
            Intent intent = new Intent(context, CPSCDetailsActivity.class);
            intent.putExtra("current_details", current);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            //Toast.makeText(context,"The Item Clicked is: "+ current.getTitle(),Toast.LENGTH_SHORT).show();
            //^ or try getLayoutPosition()
        }
    }

    public void setRecalls(List<RecallResponse> recalls) {
        this.recalls.clear();
        this.recalls.addAll(recalls);
        this.notifyItemRangeInserted(0, this.recalls.size());
    }

    public RecallsAdapter(int rowLayout, Context context) {
        //this.recalls = recalls;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RecallViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new RecallViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecallViewHolder holder, int position) {
        holder.recallTitle.setText(recalls.get(position).getTitle());
        holder.date.setText(recalls.get(position).getRecallDate());
        holder.recallDescription.setText(recalls.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return recalls.size();
    }

}