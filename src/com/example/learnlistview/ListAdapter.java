package com.example.learnlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    
	private Context mContext;
    private static LayoutInflater inflater = null;
    
    public ListAdapter(Context c) {
        mContext = c;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        
        vi = inflater.inflate(R.layout.item_list, null);
        TextView text = (TextView) vi.findViewById(R.id.text_list);
        ImageView image = (ImageView) vi.findViewById(R.id.image_list);
//      TextView textDate = (TextView) vi.findViewById(R.id.text_date);
            
        image.setImageResource(mThumbIds[position]);
        text.setText("第"+position+"張圖");
        
        return vi;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.pic_01, R.drawable.pic_02,
            R.drawable.pic_03, R.drawable.pic_04,
            R.drawable.pic_05, R.drawable.pic_06,
            R.drawable.pic_07, R.drawable.pic_08,
            R.drawable.pic_09, R.drawable.pic_10,
    };
}