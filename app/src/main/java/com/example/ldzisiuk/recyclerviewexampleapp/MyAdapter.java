package com.example.ldzisiuk.recyclerviewexampleapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by ldzisiuk on 28/8/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<MyModel> mDataset;

    SimpleDateFormat simpleDateFormatter =  new SimpleDateFormat("hh:mm:ss");


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txAsunto;
        public TextView txRemitente;
        public TextView txHora;
        public TextView txBody;
        public ViewHolder(View v) {
            super(v);
            txAsunto = v.findViewById(R.id.textViewAsunto);
            txRemitente = v.findViewById(R.id.textViewRemitente);
            txHora = v.findViewById(R.id.textViewHora);
            txBody = v.findViewById(R.id.textViewBody);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<MyModel> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        MyModel model = mDataset.get(position);
        holder.txAsunto.setText(model.getAsunto());
        holder.txRemitente.setText(model.getRemitente());
        holder.txHora.setText(simpleDateFormatter.format(model.getFecha()));
        holder.txBody.setText(model.getBody());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}