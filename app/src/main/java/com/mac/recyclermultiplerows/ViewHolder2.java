package com.mac.recyclermultiplerows;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class ViewHolder2 extends RecyclerView.ViewHolder{

    private final Context mContext;
    private String data;
    private TextView name;

    public ViewHolder2(Context context, View itemView) {
        super(itemView);
        this.mContext = context;
        name = (TextView) itemView.findViewById(R.id.name);
    }

    public void invalidate(String data) {
        name.setText(data);

    }


}
