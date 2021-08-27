package com.example.uniapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uniapp.R;
import com.example.uniapp.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    List<User> userList;
    Context context;
    private final RecyclerViewClickListener listener;

    public UserAdapter(List<User> userList, Context context,RecyclerViewClickListener listener) {
        this.userList = userList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtCore1.setText(userList.get(position).getName());
        holder.txtCore2.setText(userList.get(position).getHelp());
        holder.imgCore.setImageResource(userList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtCore1, txtCore2;
        ImageView imgCore;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCore1 = itemView.findViewById(R.id.txtCore1);
            txtCore2 = itemView.findViewById(R.id.txtCore2);
            imgCore = itemView.findViewById(R.id.imgCore);
            itemView.setOnClickListener(this);
        }

      public void onClick(View v){
            listener.onClick(itemView, getAdapterPosition());
        }
    }
}
