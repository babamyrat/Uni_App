package com.example.uniapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uniapp.R;
import com.example.uniapp.model.Group;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupViewAdapter> {
    private final List<Group> groupList;
    private final Context context;
    private final RecyclerViewClickListener listener;

    public GroupAdapter(List<Group> groupList, Context context, RecyclerViewClickListener listener) {
        this.groupList = groupList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public GroupViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_item, parent, false);
        return new GroupViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewAdapter holder, int position) {

        holder.txtCore1.setText(groupList.get(position).getName2());
        holder.txtCore2.setText(groupList.get(position).getHelp2());
        holder.imgCore.setImageResource(groupList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }
    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class GroupViewAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtCore1, txtCore2;
        ImageView imgCore;

        public GroupViewAdapter(@NonNull View itemView) {
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
