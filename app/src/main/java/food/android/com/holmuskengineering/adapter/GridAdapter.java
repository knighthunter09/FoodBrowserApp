package food.android.com.holmuskengineering.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import food.android.com.holmuskengineering.R;
import food.android.com.holmuskengineering.network.model.FoodItem;

public class GridAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater mInflater;
    List<FoodItem> list;

    public GridAdapter(Context context, LayoutInflater inflater) {
        mContext = context;
        mInflater = inflater;
        list = new LinkedList<>();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int position) {
        return list.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.grid_item, null);
            holder = new ViewHolder();
            holder.titleTextView = (TextView) convertView.findViewById(R.id.foodName);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if (list.get(position) != null) {
            holder.titleTextView.setText(list.get(position).getName());
        }

        return convertView;
    }

    private static class ViewHolder {
        public TextView titleTextView;
    }

    public void updateData(List<FoodItem> list) {
        this.list.clear();
        this.list.addAll(list);
        this.notifyDataSetChanged();
    }
}
