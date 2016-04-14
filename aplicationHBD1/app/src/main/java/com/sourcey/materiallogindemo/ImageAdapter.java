package com.sourcey.materiallogindemo;

import android.content.Context;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_7, R.drawable.sample_8,
            R.drawable.sample_9, R.drawable.sample_10,
            R.drawable.sample_11, R.drawable.sample_12,
            R.drawable.sample_13, R.drawable.sample_14,
            R.drawable.sample_15, R.drawable.sample_16,
            //R.drawable.sample_17, R.drawable.sample_18,
            R.drawable.sample_19, R.drawable.sample_20,
            R.drawable.sample_21, R.drawable.sample_22,
            R.drawable.sample_23, R.drawable.sample_24,
            R.drawable.sample_24,


    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 10;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
//        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }

}