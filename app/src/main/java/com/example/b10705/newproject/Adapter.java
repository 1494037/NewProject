package com.example.b10705.newproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    ArrayList<Myitems> mData;
    Context mContext;
    int mResource;

    public Adapter(ArrayList<Myitems> data, Context context, int resource) {
        mData = data;
        mContext = context;
        mResource = resource;
    }

    @Override
    public int getCount() {
        return mData.size();
    }
    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater intflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = intflater.inflate(mResource, viewGroup, false);
        }

        ImageView text1 = (ImageView) view.findViewById(R.id.menu_image);
        TextView text2 = (TextView) view.findViewById(R.id.menu_name);
        TextView text3 = (TextView) view.findViewById(R.id.menu_price);

        text1.setImageResource(mData.get(i).getImg());
        text2.setText(mData.get(i).getName());
        text3.setText(mData.get(i).getCost());

        return view;
    }
}
