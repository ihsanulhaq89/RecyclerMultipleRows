package com.mac.recyclermultiplerows;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter {
    private final int VIEW_TYPE_1 = 1;
    private final int VIEW_TYPE_2 = 2;
    private final Context mContext;
    private final List<String> mItems;

    public MyAdapter(Context context, List<String> cards) {
        mContext = context;
        mItems = cards;
    }


    @Override
    public int getItemCount() {
        return mItems.size() + 1;
    }
    @Override
    public int getItemViewType(int position) {
        if(position == getItemCount() - 1) {
            return VIEW_TYPE_2;
        } else return VIEW_TYPE_1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_1: {
                View v = LayoutInflater.from(mContext)
                        .inflate(R.layout.row_1, parent, false);
                return new ViewHolder1(mContext, v);
            }
            case VIEW_TYPE_2: {
                View v = LayoutInflater.from(mContext)
                        .inflate(R.layout.row_2, parent, false);
                return new ViewHolder2(mContext, v);
            }

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if(getItemViewType(position) == VIEW_TYPE_1){
            ((ViewHolder1) viewHolder).invalidate(mItems.get(position));
        }else {
            ((ViewHolder2) viewHolder).invalidate("SPECIAL ITEM");
        }
    }
}
