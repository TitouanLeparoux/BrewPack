package com.example.brewpack.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brewpack.Model.Brew;
import com.example.brewpack.R;

import java.security.PrivateKey;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CelluleJava> {
    private List<Brew> listValues;
    private final OnItemClickListener listener;
    private Context context;

    public interface OnItemClickListener {
        void onItemClick(Brew brew);
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class CelluleJava extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader;
        public TextView txtFooter;
        public ImageView image;
        public View layout;

        //Constructeur
        public CelluleJava(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            image = v.findViewById(R.id.icon);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Brew> listValues, OnItemClickListener listener, Context context) {
        this.listValues = listValues;
        this.listener = listener;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CelluleJava onCreateViewHolder(ViewGroup parent,
                                          int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.content_list, parent, false);
        // set the view's size, margins, paddings and layout parameters
        CelluleJava vh = new CelluleJava(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CelluleJava holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Brew brew = listValues.get(position);
        final String name = listValues.get(position).getName();
        final String city = listValues.get(position).getCity();
        final String country = listValues.get(position).getCountry();
        // HEADER
        holder.txtHeader.setText(name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(brew);
            }
        });
        // FOOTER
        holder.txtFooter.setText(city + ", " + country);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listValues.size();
    }

}