package github.io.tplxmx96;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuweichen on 2018/7/9.
 */

/**
 * 演示intent
 */
public class ResultActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherintent);

    }
}
///**演示gridview的使用
// *
// */
//public class ResultActivity extends Activity {
//    private GridView gv;
//    private List<Map<String,Object>>list;
//    private int[] images={R.drawable.images_info2,R.drawable.images_info3,R.drawable.images_info4,R.drawable.images_info5,R.drawable.images_info6,R.drawable.images_info7,R.drawable.images_info9,R.drawable.images_info10,R.drawable.ic_p};
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gridview01);
//        gv=findViewById(R.id.gv);
//        list=new ArrayList<Map<String,Object>>();
//        for (int i = 0; i < images.length; i++) {
//            Map<String,Object>map=new HashMap<String,Object>();
//            map.put("img",images[i]);
//            map.put("text","头像-"+i);
//            list.add(map);
//        }
//        MyBaseAdapter adapter=new MyBaseAdapter();
//        gv.setAdapter(adapter);
//
//        //表示点击gridview中某一项时触发回调的方法
//        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent=new Intent();
//                intent.putExtra("imagesId",images[position]);//获取当前点击头像的资源id
//                setResult(Activity.RESULT_OK,intent);//将资源id存储到intent中进行回传
//                ResultActivity.this.finish();
//            }
//        });
//    }
//    class MyBaseAdapter extends BaseAdapter{
//
//        @Override
//        public int getCount() {
//            return list.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return list.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            ViewHolder holder=null;
//            if (convertView==null){
//                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                convertView=inflater.inflate(R.layout.activity_gridview001,null);
//                holder=new ViewHolder();
//                holder.iv=convertView.findViewById(R.id.imageView1);
//                holder.tv=convertView.findViewById(R.id.textView1);
//                convertView.setTag(holder);
//            }else {
//                holder= (ViewHolder) convertView.getTag();
//            }
//            holder.tv.setText((CharSequence) list.get(position).get("text"));
//            holder.iv.setImageResource((Integer) list.get(position).get("img"));
//            return convertView;
//
//        }
//    }
//    static class ViewHolder{
//        ImageView iv;
//        TextView tv;
//    }
//}























//Application
//    private TextView tv;
//    private MyApplication application;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_application1);
//        tv=findViewById(R.id.tv);
//
//        application= (MyApplication) getApplication();
//        String name=application.getName();
//        int age= application.getAge();
//
//        tv.setText("name："+name+"age："+age);
//    }
//}





















//Activity之间通过Bundle传值
//    private TextView tv_showInfo;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bundle1);
//        tv_showInfo=findViewById(R.id.tv_showinfo);
//        //1、获取激活activity的intent对象
//        Intent intent =getIntent();
//        //2、获取传递的bundle对象
//        Bundle bundle=intent.getExtras();
//        //3、在bundle中根据key获取具体数据
//        String name=bundle.getString("name");
//        int age=bundle.getInt("age");
//        double score=bundle.getDouble("score");
//        char sex=bundle.getChar("sex");
//        //4、将数据展示到TextVity对象中
//        tv_showInfo.setText("name:"+name+"\nage:"+age+"\bscore:"+score+"\bsex:"+sex);
//    }
//}

















//Activity之间通过intent传值
//    private TextView tv;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_intent1);
//        tv=findViewById(R.id.tv_show);
//        //1、获取激活组件的intent对象
//        Intent intent = getIntent();
//        //2、根据key获取传递的数据
//        String name = intent.getStringExtra("name");
//        int age = intent.getIntExtra("age",0);//getIntExtra(表示获取数据的key,如果根据key没有获取数据显示的默认值)
//        double score = intent.getDoubleExtra("score",0.0);
//        char sex = intent.getCharExtra("sex",' ');
//        boolean bl = intent.getBooleanExtra("bl",false);
//        //3、将数据展示到TextView控件中
//        tv.setText("name:"+name+"\nage:"+age+"\nscore:"+score+"\bsex:"+sex+"\bbl:"+bl);
//    }
//}
