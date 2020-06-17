package com.example.coronavirus_howlongdoesittaketorecover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Chapter1_ListAdapter extends BaseAdapter {

    Context context;
    private final String [] title;
    private final String [] subtitle;
    private final int [] images;

    public Chapter1_ListAdapter(Context context, String [] values, String [] numbers, int [] images){
        //super(context, R.layout.single_list_app_item, utilsArrayList);
        this.context = context;
        this.title = values;
        this.subtitle = numbers;
        this.images = images;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.chapter1_single_list_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.list_title);
            viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.list_subtitle);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.list_icon);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.txtName.setText(title[position]);
        viewHolder.txtVersion.setText(subtitle[position]);
        viewHolder.icon.setImageResource(images[position]);

        return convertView;
    }

    private static class ViewHolder {

        TextView txtName;
        TextView txtVersion;
        ImageView icon;

    }
}
