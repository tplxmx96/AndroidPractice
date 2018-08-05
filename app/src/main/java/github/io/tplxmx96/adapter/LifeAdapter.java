package github.io.tplxmx96.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import github.io.tplxmx96.R;
import github.io.tplxmx96.bean.Demo;
import github.io.tplxmx96.bean.LifeRecord;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class LifeAdapter extends BaseAdapter {
    private List<LifeRecord> records = new ArrayList<>();

    private Context context;
    public LifeAdapter(Context context){
        this.context = context;
    }

    public void addData(LifeRecord record){
        records.add(record);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return records.size();
    }

    @Override
    public LifeRecord getItem(int position) {
        return records.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        try{
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_list_liferecord,null);
                holder = new ViewHolder();
                holder.tv_date = convertView.findViewById(R.id.tv_date);
                holder.tv_life_name = convertView.findViewById(R.id.tv_life_name);

            }else{
                holder = (ViewHolder) convertView.getTag();
            }

            LifeRecord record = getItem(position);

            holder.tv_life_name.setText("页面被--->" + record.name);


            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(record.date);
            holder.tv_date.setText(dateString);
        }catch (Exception e){

        }

        return convertView;
    }

    static class ViewHolder{
        TextView tv_life_name;
        TextView tv_date;
    }

}
