package com.example.veloxigami.delen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Anil on 18-08-2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<MyOrders> list = new ArrayList<>();
    Context context;

    public interface MyAdapterInterface{
        void onViewClick(int position);
    }

    private MyAdapterInterface myAdapterInterface;

    public MyAdapter(ArrayList<MyOrders> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void setMyAdapterInterface ( MyAdapterInterface myAdapterInterface){
        this.myAdapterInterface = myAdapterInterface;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(list.get(position).getUrl().isEmpty())
            Picasso.with(context)
                    .load("https://firebasestorage.googleapis.com/v0/b/delen-93390.appspot.com/o" +
                            "/images.png?alt=media&token=84dda21b-4cac-4564-8dd3-d612d330a76b")
                    .into(holder.profileImg);
        else
        Picasso.with(context).load(list.get(position).getUrl()).into(holder.profileImg);
        holder.cost.setText(list.get(position).getCost());
        holder.status.setText(list.get(position).getStatus());
        holder.dateAndTime.setText(list.get(position).getDateAndTime());
        holder.profession.setText(list.get(position).getProfession());
        holder.orderNo.setText(list.get(position).getOrderNo());

    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView dateAndTime, orderNo, profession, status, cost;
        ImageView profileImg;

        public MyViewHolder(View itemView) {
            super(itemView);
            dateAndTime = itemView.findViewById(R.id.date_and_time);
            orderNo = itemView.findViewById(R.id.order_no);
            profession = itemView.findViewById(R.id.profession);
            status = itemView.findViewById(R.id.job_status);
            cost = itemView.findViewById(R.id.job_cost);
            profileImg = itemView.findViewById(R.id.profile_img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myAdapterInterface.onViewClick(getAdapterPosition());
                }
            });
        }
    }
}
