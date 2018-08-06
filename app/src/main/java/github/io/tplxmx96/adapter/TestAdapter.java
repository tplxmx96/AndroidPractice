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
import github.io.tplxmx96.bean.Test;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class TestAdapter extends BaseAdapter {
    private List<Test> tests = new ArrayList<>();
    private Context context;

    public TestAdapter(Context context){
        this.context=context;
        tests.addAll(Test.getList());
    }

    public void addData(Test test){
        tests.add(test);
        notifyDataSetChanged();
    }



    @Override
    public int getCount() {
        return tests.size();
    }

    @Override
    public Test getItem(int position) {
        return tests.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_test,null);
            holder.tvTest= convertView.findViewById(R.id.tv_name);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Test test = getItem(position);
        holder.tvTest.setText(test.getName());
        return convertView;
    }
    static class ViewHolder{
        TextView tvTest;
    }


}
