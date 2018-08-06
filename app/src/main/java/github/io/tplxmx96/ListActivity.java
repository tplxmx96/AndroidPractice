package github.io.tplxmx96;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import github.io.tplxmx96.adapter.DemoAdapter;
import github.io.tplxmx96.bean.Demo;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class ListActivity extends AppCompatActivity{


    private ListView listView;
    private DemoAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listview);
        adapter = new DemoAdapter(this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Demo demo = adapter.getItem(position);

                Intent intent = new Intent();
                intent.setClass(ListActivity.this,demo.getClz());
                startActivity(intent);
            }
        });

    }
    public void click(View view){
        switch (view.getId()){
            case R.id.btn_start:
                Intent intent1 = new Intent();
                ComponentName componentName = new ComponentName(ListActivity.this,OtherActivity.class);
                intent1.setComponent(componentName);
                startActivity(intent1);
                break;
        }
    }

}
