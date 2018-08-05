package github.io.tplxmx96;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.Date;

import github.io.tplxmx96.adapter.LifeAdapter;
import github.io.tplxmx96.bean.LifeRecord;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class LifecycleActivity extends AppCompatActivity{

    private ListView listView;
    private LifeAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listview);
        adapter = new LifeAdapter(this);
        listView.setAdapter(adapter);

        adapter.addData(new LifeRecord(new Date(),"onCreate"));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                AlertDialog dialog = new AlertDialog.Builder(LifecycleActivity.this)
//                        .setTitle("TP生命周期测试")
//                        .create();
//                dialog.show();

                Intent intent = new Intent();
                intent.setClass(LifecycleActivity.this,OtherActivity.class);
                startActivity(intent);

            }
        });

        Log.d("tp","页面被初始化----> onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tp","页面被初始化----> onStart");
        adapter.addData(new LifeRecord(new Date(),"onStart"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tp","页面被初恢复----> onResume");
        adapter.addData(new LifeRecord(new Date(),"onResume"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tp","页面被初暂停----> onPause");
        adapter.addData(new LifeRecord(new Date(),"onPause"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tp","页面被停止----> onStop");
        adapter.addData(new LifeRecord(new Date(),"onStop"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tp","页面被初销毁----> onDestroy");
        adapter.addData(new LifeRecord(new Date(),"onDestroy"));
    }
}
