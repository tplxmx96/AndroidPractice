package github.io.tplxmx96.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import github.io.tplxmx96.R;
import github.io.tplxmx96.bean.Demo;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class DemoAdapter extends BaseAdapter {

    private List<Demo> data = new ArrayList<>();
    private Context context;

    public DemoAdapter(Context context) {
        this.context = context;
        data.addAll(Demo.getList());
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Demo getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_demo, null);
            holder.tvName = convertView.findViewById(R.id.tv_name);
            holder.tvRank = convertView.findViewById(R.id.tv_rank);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Demo demo = getItem(position);

        holder.tvName.setText(demo.getName());
        holder.tvRank.setText((position + 1) + "");
        return convertView;
    }


    static class ViewHolder {
        TextView tvName;
        TextView tvRank;

    }
}
