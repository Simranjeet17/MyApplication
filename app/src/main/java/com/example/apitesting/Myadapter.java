package com.example.apitesting;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Myadapter  extends RecyclerView.Adapter<Myadapter.Viewholder> {
    List<Modal.PostAllDatum> list_item =new ArrayList<>();
    Context context;

    public Myadapter(List<Modal.PostAllDatum> list, Context applicationContext) {
        this.list_item = list;
        this.context = applicationContext;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.name.setText(list_item.get(position).getUsername());
               Picasso.get()
                .load(list_item.get(position).getVideoThumnails())
                .into(holder.Thumbnail);
               Picasso.get()
                       .load("https://klapus.kdsthsolution.com/"+list_item.get(position).getImage())
                       .into(holder.userimage);

    }

    @Override
    public int getItemCount() {
        return list_item.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView userimage , Thumbnail;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.usertxet);
            userimage = itemView.findViewById(R.id.imagetop);
            Thumbnail = itemView.findViewById(R.id.imagebtm);

        }
    }
}


