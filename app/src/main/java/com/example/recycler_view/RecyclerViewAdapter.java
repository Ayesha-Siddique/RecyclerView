package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler_view.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    Context context;
    ArrayList<contactModel> arrContacts;

    public RecyclerViewAdapter(Context context, ArrayList<contactModel> arrContacts)
    {
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.textName.setText(arrContacts.get(position).name);
        holder.textMsg.setText(arrContacts.get(position).text);

    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textName, textMsg;
        ImageView imgContact;

        public ViewHolder( View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textView);
            textMsg = itemView.findViewById(R.id.textView2);;
            imgContact = itemView.findViewById(R.id.imageView);

        }
    }


}

