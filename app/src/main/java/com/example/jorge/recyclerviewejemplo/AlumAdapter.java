package com.example.jorge.recyclerviewejemplo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jorge on 25/02/2018.
 */

public class AlumAdapter extends RecyclerView.Adapter<AlumAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Alumnos> alumnosList;


    public AlumAdapter(Context mCtx, List<Alumnos> alumnosList) {
        this.mCtx = mCtx;
        this.alumnosList = alumnosList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_names, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Alumnos alumnos = alumnosList.get(position);
        holder.textViewTitle.setText(alumnos.getTitle());
        holder.textViewShortDesc.setText(alumnos.getShortdesc());
        holder.textViewPrice.setText(String.valueOf(alumnos.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(alumnos.getImage()));

    }


    @Override
    public int getItemCount() {
        return alumnosList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
