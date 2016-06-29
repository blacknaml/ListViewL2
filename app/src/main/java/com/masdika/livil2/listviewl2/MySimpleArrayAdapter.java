package com.masdika.livil2.listviewl2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by blacknaml on 29/06/16.
 */
public class MySimpleArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public MySimpleArrayAdapter(Context context, String[] values){
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textview = (TextView) rowView.findViewById(R.id.label);
        ImageView imageview = (ImageView) rowView.findViewById(R.id.icon);

        textview.setText(values[position]);

        String s = values[position];
        if(s.startsWith("iPhone")){
            imageview.setImageResource(R.drawable.no);
        } else {
            imageview.setImageResource(R.drawable.ok);
        }

        return rowView;

    }
}
