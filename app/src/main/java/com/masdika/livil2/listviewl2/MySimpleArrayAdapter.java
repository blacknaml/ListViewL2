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
        TextView textinfo = (TextView) rowView.findViewById(R.id.info);
        ImageView imageview = (ImageView) rowView.findViewById(R.id.icon);

        textview.setText(values[position]);

        String s = values[position];
        if(s.startsWith("Window") || s.startsWith("iPhone") || s.startsWith("Mac") || s.startsWith("OS/2")){
            imageview.setImageResource(R.drawable.no);
            textinfo.setText(s + " is not Opensource or FOSS. In other word is propietary OS. You need $ to use it. Do not PIRACY!!!.");
        } else {
            imageview.setImageResource(R.drawable.ok);
            textinfo.setText(s + " is Opensource or FOSS. In other word is Free / Open OS. You can do anythings.");
        }

        return rowView;

    }
}
