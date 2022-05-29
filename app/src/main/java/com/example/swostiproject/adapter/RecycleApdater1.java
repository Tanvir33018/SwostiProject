package com.example.swostiproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swostiproject.R;
import com.example.swostiproject.network_model.collection_sheet_model.CollectionSheetModel;

public class RecycleApdater1 extends RecyclerView.Adapter<RecycleApdater1.ViewHolder> {
    private CollectionSheetModel collectionSheetModel;
    public RecycleApdater1(CollectionSheetModel mCollectionSheetModel) {
        collectionSheetModel = mCollectionSheetModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item, parent, false);

        return new RecycleApdater1.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mTextView1.setText("Edit");
        holder.mTextView2.setText("HI");
        holder.mTextView3.setText("HI");
        holder.mTextView4.setText("HI");
        holder.mTextView5.setText("HI");
        holder.mTextView6.setText("HI");
        holder.mTextView7.setText("HI");
        holder.mTextView8.setText("HI");
        holder.mTextView9.setText("HI");
        holder.mTextView10.setText("HI");
        holder.mTextView11.setText("HI");
        holder.mTextView12.setText("HI");
        holder.mTextView13.setText("HI");
    }

    @Override
    public int getItemCount() {
        return collectionSheetModel.getCollectionSheetBean().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1, mTextView2, mTextView3, mTextView4, mTextView5, mTextView6, mTextView7, mTextView8, mTextView9,mTextView10,mTextView11, mTextView12,mTextView13,mTextView14;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextView1 = itemView.findViewById(R.id.one);
            mTextView2 = itemView.findViewById(R.id.two);
            mTextView3 = itemView.findViewById(R.id.three);
            mTextView4 = itemView.findViewById(R.id.four);
            mTextView5 = itemView.findViewById(R.id.five);
            mTextView6 = itemView.findViewById(R.id.six);
            mTextView7 = itemView.findViewById(R.id.seven);
            mTextView8 = itemView.findViewById(R.id.eight);
            mTextView9 = itemView.findViewById(R.id.nine);
            mTextView10 = itemView.findViewById(R.id.ten);
            mTextView11 = itemView.findViewById(R.id.eleven);
            mTextView12 = itemView.findViewById(R.id.twelve);
            mTextView13 = itemView.findViewById(R.id.thirteen);
            //mTextView14 = itemView.findViewById(R.id.fourteen);
        }
    }
}
