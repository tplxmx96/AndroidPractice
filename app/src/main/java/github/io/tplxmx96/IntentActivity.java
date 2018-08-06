package github.io.tplxmx96;

import android.Manifest;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by yuweichen on 2018/8/6.
 */

public class IntentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_main);
    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                Intent intent = new Intent();
                intent.setAction("github.io.action");
//                intent.addCategory("android.intent.category.DEFAULT");
//                intent.setData(Uri.parse("io://github:90/res"));
                intent.setDataAndType(Uri.parse("io://github:90/res"),"text/*");
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent();
                intent1.setAction("github.io.intent");
                startActivity(intent1);
                break;
        }
    }
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.button1://点击按钮以隐式启动的方式启动当前应用中的activity
//                Intent intent = new Intent();
//                intent.setAction("github.io.action");
////            intent.addCategory("android.intent.category.DEFAULT");
////            intent.setData(Uri.parse("io://github:90/res"));
//            intent.setDataAndType(Uri.parse("io://github:90/res"),"text/*");
//                startActivity(intent);
//                break;
//            case R.id.button2://点击按钮启动其他应用中的activity
//                Intent intent1 = new Intent();
//                intent1.setAction("github.io.intent");
//                startActivity(intent1);
//                break;
//        }
//    }

//    public void click(View view) {
//        switch (view.getId()) {
//            case R.id.btn_start:
////                Intent intent = new Intent();
////                ComponentName componentName = new ComponentName(IntentActivity.this, OtherActivity.class);
//
////                Intent intent = new Intent();
////                intent.setClass(IntentActivity.this,OtherActivity.class);
//
//                Intent intent = new Intent();
//                intent.setClassName(IntentActivity.this,OtherActivity.class.getName());
//
////                intent.setComponent(componentName);
//                startActivity(intent);
//                break;
//        }
//    }
}

