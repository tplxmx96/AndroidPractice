package github.io.tplxmx96;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OtherActivity extends AppCompatActivity{
    private List<String>list;
    private ListView iv;
    private ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview01);

    }
}

































//Acativity的启动模式
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_activity02);
//    }
//    public void click(View view){
//        Intent intent=null;
//        switch (view.getId()){
//            case R.id.button01:
//                intent=new Intent(OtherActivity.this,MainActivity.class);
//                break;
//            case R.id.button02:
//                intent=new Intent(OtherActivity.this,OtherActivity.class);
//                break;
//        }
//        startActivity(intent);
//    }
//}




















///**
// * 演示Task
// */
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_task1);
//    }
//    //点击按钮打开发送短信的界面
//    public void click(View view){
//        Intent intent =new Intent(Intent.ACTION_SENDTO,Uri.parse("sms://10010"));
//        startActivity(intent);
//    }
//
//}























///**
// *演示创建Activity
// * 1、继承Activity
// * 2、重写onCreate()方法
// * 3、提供xml布局文件  需要在onCreate()方法调用setContentView()方法加载xml布局
// * 4、配置
// */
//
//public class OtherActivity extends AppCompatActivity {
//    /**
//     * 表示当Activity被创建时回调的方法  由系统开机调用
//     * Bundle 键为String的map集合
//     * @param savedInstanceState
//     */
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_other);
//    }
//}
