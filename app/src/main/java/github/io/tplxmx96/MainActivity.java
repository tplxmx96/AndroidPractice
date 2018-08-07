package github.io.tplxmx96;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import github.io.tplxmx96.adapter.TestAdapter;
import github.io.tplxmx96.bean.Test;

/**
 * 演示Activity的启动模式
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        findViewById(R.id.btn03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void onClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.btn01:
                intent = new Intent(MainActivity.this,OtherActivity.class);
                break;
            case R.id.btn02:
                intent = new Intent(MainActivity.this,OtherActivity.class);
                break;
        }
        startActivity(intent);
    }
}






//    演示ListView  使用
//    private ListView listView;
//    private TestAdapter adapter;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview);
//        listView = findViewById(R.id.listview);
//        adapter = new TestAdapter(this);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Test test = adapter.getItem(position);
//                if (position == 0){
//                    Toast.makeText(MainActivity.this,test.getName() + ", pos:" + position,Toast.LENGTH_LONG).show();
//                }else if (position == 1){
//                    AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
//                            .setTitle(test.getName())
//                            .setIcon(R.drawable.images_info1)
//                            .setMessage("呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵")
//                            .setPositiveButton(R.string.btn_ok,null)
//                            .setNegativeButton("取消",null)
//                            .create();
//                    dialog.show();
//                }else if (position == 2){
//                    Test data = new Test();
//                    data.setName("我是被动态创建的数据, 我的位置:" + adapter.getCount());
//                    adapter.addData(data);
//                }else{
//
//                }
//
//
//            }
//        });
//














//        listView = findViewById(R.id.listview);
//        adapter =  new TestAdapter(this);
//        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Test test = adapter.getItem(position);
//                if (position == 0){
//                    Toast.makeText(MainActivity.this,test.getName() + ", pos：" + position ,Toast.LENGTH_LONG).show();
//                }else if (position == 1){
//                    AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
//                            .setTitle(test.getName())
//                            .setIcon(R.drawable.images_info1)
//                            .setMessage("好几个结核杆菌钢结构几号给")
//                            .setPositiveButton(R.string.btn_ok,null)
//                            .setNegativeButton("取消",null)
//                            .create();
//                    dialog.show();
//                }else if (position == 2){
//                    Test data = new Test();
//                    data.setName("我是被动态创建的数据, 我的位置: " + adapter.getCount());
//                    adapter.addData(data);
//                }
//
//
//
//
//            }
//        });


//    }
//}






























//    private View contentView;
//    private PopupWindow mWindow;
//    private ImageView ivReturn, ivCollect, ivShare;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_popupwindow);
//        initView();
//
//    }
//
//    private void initView() {
//        ivReturn = findViewById(R.id.iv_return);
//        ivCollect = findViewById(R.id.iv_collect);
//        ivShare = findViewById(R.id.iv_share);
//
//        ivReturn.setOnClickListener(this);
//        ivCollect.setOnClickListener(this);
//        ivShare.setOnClickListener(this);
//    }
//
//    private void initPopupWindow() {
//
//        contentView = getLayoutInflater().inflate(R.layout.activity_popupwindow1, null);
//        //contentView：内容视图
//        mWindow = new PopupWindow(contentView,
//                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        //设置触摸PopupWindow外面的区域时是否可以使得这个PopupWindow消失。
//        mWindow.setOutsideTouchable(true);
//        mWindow.showAsDropDown(ivCollect);
//        //设置背景
//        //mWindow.setBackgroundDrawable(background);
//        //设置PopupWindow是否可以触摸时会有响应
//        //mWindow.setTouchable(true);
//    }
//
//    //处理某个按键的方法
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        switch (keyCode) {
//            case KeyEvent.KEYCODE_MENU://监听menu键
//                //isShowing()：判断PopupWindow是否正在展示
//                if (mWindow.isShowing()) {
//                    //PopupWindow消失的方法
//                    mWindow.dismiss();
//                } else {
//                    //显示PopupWindow---->在某个位置显示
//                    mWindow.showAtLocation(contentView, Gravity.BOTTOM, 0, 0);
//                    //作为下拉视图显示
//                    //mWindow.showAtLocation(anchor,xoff,yoff);
//                }
//                break;
//            case KeyEvent.KEYCODE_BACK://监听返回键
//                if (mWindow.isShowing()) {
//                    mWindow.dismiss();
//                }
//                break;
//        }
//
//        return super.onKeyDown(keyCode, event);
//    }
//
//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.iv_collect){
//            initPopupWindow();
//        }
//    }
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
//}


//    //演示PopupMenu 弹出菜单
//    private TextView tvMsg;
//    private float fontSize = 15.0f;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_popupmenu);
//
//        tvMsg=findViewById(R.id.tv_msg);
//        tvMsg.setTextSize(fontSize);
//    }
//    public void showPopup(View v){
//        //anchor:锚点
//        PopupMenu popup=new PopupMenu(this,v);
//
//        getMenuInflater().inflate(R.menu.popup_menu,popup.getMenu());
//        //显示菜单
//        popup.show();
//
//        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.acyion_add:
//                        fontSize += 5;
//                        break;
//                    case R.id.action_sub:
//                        fontSize -= 5;
//                        break;
//                }
//                tvMsg.setTextSize(fontSize);
//                return false;
//            }
//        });
//
//    }
//}


// 演示ContextMenu  上下文菜单
//    private TextView tvMsg;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activit_menu);
//
//        tvMsg=findViewById(R.id.tv_msg);
//        //注册上下文菜单
//        registerForContextMenu(tvMsg);
//    }
//    //创建上下文菜单
//
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//
//
//        //将comtext_menu.xml文件填充到menu对象中
//        getMenuInflater().inflate(R.menu.comtext_menu,menu);
//    }
//    //处理上下文菜单的点击事件
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.action_width://获取控件宽度
//                //设置标题内容
//                setTitle("控件的宽度="+tvMsg.getWidth());
//                break;
//            case R.id.action_height://获取控件高度
//                setTitle("控件的高度="+tvMsg.getHeight());
//                break;
//        }
//        return super.onContextItemSelected(item);
//    }
//}


//      演示Menu的使用  选项菜单
//    //创建选项菜单---OptionsMenu
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        //菜单填充器
//        MenuInflater menuInflater=getMenuInflater();
//        //将menu的xml文件转换成menu对象
//        menuInflater.inflate(R.menu.options_menu,menu);
//
//        menu.add(Menu.NONE,Menu.NONE,Menu.NONE,"扫一扫");
//        //ture：使得菜单可以被显示出来
//        return true;
//    }
//    //处理OptionsMenu的点击事件
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.action_search:
//                Toast.makeText(MainActivity.this,"搜索",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.action_setting1:
//                Toast.makeText(MainActivity.this,"设置",Toast.LENGTH_SHORT).show();
//                break;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}
//    /**
//     * 演示gridview的使用
//     * @param savedInstanceState
//     */
//    private static final int REQUEST_CODE=1;
//    private ImageView iv;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gridview02);
//        iv=findViewById(R.id.iv_show);
//    }
//    //点击按钮跳转到resultactivity界面选择头像并且展示
//    public void onClick(View view){
//        Intent intent=new Intent(MainActivity.this,ResultActivity.class);
//        startActivityForResult(intent,REQUEST_CODE);
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode==REQUEST_CODE && resultCode== Activity.RESULT_OK){
//            int imageId=data.getIntExtra("imageId",R.drawable.ic_launcher_background);//获取回传选择头像图片资源id 并且进行展示
//            iv.setImageResource(imageId);
//        }
//    }
//}


//    /**
//     * 演示listview优化
//     * @param savedInstanceState
//     */
//    private ListView Iv;
//    private List<String>list;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview001);
//        Iv=findViewById(R.id.Iv);
//        list=new ArrayList<String>();
//        for (int i = 0; i < 100; i++) {
//            list.add("item"+i);
//        }
//        MybaseAdapter adapter=new MybaseAdapter();
//        Iv.setAdapter(adapter);
//    }
//    class MybaseAdapter extends BaseAdapter{
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
////            TextView tv=null;
//            ViewHolder holder=null;
//            if (convertView==null){
//                LayoutInflater inflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                convertView=inflater.inflate(R.layout.activity_listview002,null);
//
//                holder=new ViewHolder();
//                holder.tv=convertView.findViewById(R.id.tv);
//                convertView.setTag(holder);
////                tv=convertView.findViewById(R.id.tv);
////                convertView.setTag(tv);//setTag()给可复用的textview添加标记方便获取
//            }else {
//                //存在可复用的布局
////                tv= (TextView) convertView.getTag();
//                holder=(ViewHolder)convertView.getTag();
//            }
////            tv.setText(list.get(position));
//            holder.tv.setText(list.get(position));
////            Log.i("tag",position+"-----------convertView-----------"+convertView);
//            return convertView;
//        }
//    }
//    //定义一个用来描述存储需要被复用的类
//    static class ViewHolder{
//        TextView tv;
//    }
//}


//    /**
//     * 演示BaseAaapter的基本使用
//     * 自定义适配器的步骤
//     * 1、定义子类继承BaseAdapter
//     * 2、需要重写自定义适配器中的相应的函数
//     * 3、创建自定义适配器对象并且使用
//     */
//    private ListView Iv;
//    private List<String>list;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_baseadapter1);
//        Iv=findViewById(R.id.Iv);
//        list=new ArrayList<String>();
//        for (int i=0;i<=10;i++){
//            list.add("item"+i);
//        }
//        MyBaseAdapter adapter=new MyBaseAdapter();
//        Iv.setAdapter(adapter);
//    }
//
//    /**
//     * 定义内部类实现 BaseAdapter
//     */
//    class MyBaseAdapter extends BaseAdapter{
//        /**
//         * 表示当前适配器中加载的数据总条目
//         * @return
//         */
//        @Override
//        public int getCount() {
//            return list.size();
//        }
//
//        /**
//         * 表示根据指定下标获取对应item的 view
//         * @param position
//         * @return
//         */
//        @Override
//        public Object getItem(int position) {
//            return list.get(position);
//        }
//
//        /**
//         * 表示根据指定下标获取当前item的id
//         * @param position
//         * @return
//         */
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        /**
//         * 表示根据指定下标获取适配器控件中每个item对应的view对象
//         * @param position  表示当前绘制的item的下标
//         * @param convertView  表示可复用的view对象
//         * @param parent    表示当前绘制的item所属的listview控件
//         * @return
//         */
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            //代码构建控件
////            TextView tv=new TextView(MainActivity.this);
////            tv.setTextSize(25);
////            tv.setText(list.get(position));
//
//            //LayoutInflater 布局填充器 布局加载器 XML文件转换成view对象
//            LayoutInflater inflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View view=inflater.inflate(R.layout.activity_baseadapter2,null);//将list_item这个xml文件转换成view对象
//            TextView tv=view.findViewById(R.id.tv);//获取list_item布局中的textview控件
//            tv.setText(list.get(position));
//
//            return view;
//        }
//    }
//}


//    private ListView Iv;
//    private List<Map<String,Object>>list;
//    private int[] images={R.drawable.ic_a,R.drawable.ic_t,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_p};
//    /**
//     * 演示SimpleAdaper的使用
//     * @param savedInstanceState
//     */
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_simpleadapter1);
//        Iv=findViewById(R.id.Iv);
//        //1、准备数据源
//        list=new ArrayList<Map<String, Object>>();
//        for (int i = 0; i < 5; i++) {
//            Map<String,Object>map=new HashMap<String, Object>();
//            map.put("img",images[i]);
//            map.put("text","item"+i);
//            list.add(map);
//        }
//        //2、就数据源的数据加载到适配器中
//        /**
//         * SimpleAdapter构造函数
//         * context,上下文对象
//         * data,  表示加载到适配器的数据源对象
//         * resource,  表示adapter控件中每项布局资源id
//         * feom,    表示数据源中map中key的数组 表示key指定的数值
//         * to   表示需要展示对应数据的控件资源id
//         * 通过from和to的对应 就from中key定义的数据指定的值显示到to指定资源id的控件中
//         */
//        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,list,R.layout.activity_simpleadapter2,
//                new String[]{"img","text"},
//                new int[]{R.id.iv,R.id.tv});
//        //3、将适配器的数据展示到控件中
//        Iv.setAdapter(adapter);
//
//    }
//}


////    演示listview的常用方法
//    private ListView iv;
//    private List<String> list;
//    private ArrayAdapter<String>adapter;
//    private TextView tv;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview01);
//        iv=findViewById(R.id.iv);
//        tv=findViewById(R.id.tv);
//        list=new ArrayList<String>();
//        for (int i = 0; i < 20; i++) {
//            list.add("item"+i);
//        }
//        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,list);
//
//        ImageView Iv=new ImageView(MainActivity.this);
//        Iv.setLayoutParams(new AbsListView.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.WRAP_CONTENT));
//        Iv.setImageResource(R.drawable.ic_launcher_background);
//        //将参数中指定的控件view添加到listview的头部
//        //注意：addHeaderView()方法必须在setAdapter()方法执行之前设置
//        iv.addHeaderView(Iv);
//
//        Button btn=new Button(MainActivity.this);
//        btn.setText("加载更多...");
//        btn.setTextSize(20);
//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int index=list.size();
//                for (int i = index; i < index+20; i++) {
//                    list.add("item"+i);
//                }
//                adapter.notifyDataSetChanged();
//            }
//        });
//        iv.addFooterView(btn);//在listview的尾部添加指定的view视图
//
//        iv.setAdapter(adapter);
//
//        iv.setEmptyView(tv);//表示如果listview中没有显示的数据时显示参数指定的listview视图
//    }
//}

//    /**
//     * 演示listview的基本使用
//     */
//    private ListView iv;
//    private ArrayAdapter<String> adapter;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview);
//        iv=findViewById(R.id.iv);
//        //1、准备数据源
//        final String[] citys=getResources().getStringArray(R.array.citys);
//        //2、将数据源的数据加载到适配器中
//        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,citys);
//        //3、将适配器中的数据加载到控件中
//        iv.setAdapter(adapter);
//
//        //表示当listview控件中每项item被点击的监听事件
//        iv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            //表示当前listview中被item被点击时回调的方法
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //1、从数据源中获取
//                String s1=citys[position];
//                //2、从适配器中获取数据
//                String s2=adapter.getItem(position);
//                //3、在parent中获取
//                String s3=parent.getItemAtPosition(position).toString();
//                //4、在listvirew控件中获取
//                String s4=iv.getItemAtPosition(position).toString();
//                Toast.makeText(MainActivity.this,"s1="+s1+",s2="+s2+",s3="+s3+",s4="+s4,Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        //listview长按事件
//        iv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            /**
//             * 表示当listview中的item被长按时回调的函数
//             * listview即绑定了点击事件又绑定了长按事件
//             * 返回值如果返回false  表示对事件被处理(对长按事件和点击事件都会触发)
//             * 如果返回true表示对事件处理
//             * @param parent
//             * @param view
//             * @param position
//             * @param id
//             * @return
//             */
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,"长按事件!",Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });
//
//
//    }
//}
// AsyncTask取消方法
//    private ImageView iv;
//    private String imgePath="https://d2j3coy501s4ze.cloudfront.net/images/11511/700/ff42ba91ff49e2309d4a35cc5c305c934b626d0e_57e8ca8b49d96.jpeg";
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_asynctask01);
//        iv=findViewById(R.id.iv);
//    }
//    public void downLoadImg(View view){
//        new DownLoadAsyncTask(MainActivity.this,iv).execute(imgePath);
//    }
//}


///**
// * 演示启动AsyncTask下载网络图片显示下载进度
// */
//    private ImageView iv;
//    private String imagePath="https://d2j3coy501s4ze.cloudfront.net/images/11511/700/ff42ba91ff49e2309d4a35cc5c305c934b626d0e_57e8ca8b49d96.jpeg";
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_asynctask1) ;
//        iv=findViewById(R.id.iv);
//    }
//    //点击按钮下载图片并且展示下载进度
//    public void downLoadImg(View view){
//        new MyAsyncTask().execute(imagePath);
//    }
//    class MyAsyncTask extends AsyncTask<String,Integer,byte[]>{
//        private ProgressDialog pd;
//        @Override
//        protected void onPreExecute() {
//            pd=new ProgressDialog(MainActivity.this);
//            pd.setTitle(" 提示进度");
//            pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//            pd.show();
//        }
//
//        @Override
//        protected byte[] doInBackground(String... params) {
//            ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
//            try {
//                URL url=new URL(params[0]);
//                HttpURLConnection conn= (HttpURLConnection) url.openConnection();
//                conn.setDoInput(true);
//                conn.setRequestMethod("GET");
//                conn.connect();
//                int responseCode = conn.getResponseCode();
//                if (responseCode == 200){
//                    InputStream inputStream=conn.getInputStream();
//                    //获取下载图片设计文件的总长度
//                    long totalLength=conn.getContentLength();
//                    int currentLength=0;//表示当前下载的图片文件长度
//                    byte[] data=new byte[1024];
//                    int temp=0;
//                    while ((temp=inputStream.read(data))!=-1){
//                        currentLength+=temp;//将每次循环读取的内容添加到当前的长度变量中
//                        //根据文件的总长度与当前下载的长度计算 获取图片的下载进度
//                        int progress= (int) ((currentLength/(float)totalLength)*100);
//                        //将进度发布到主线程中
//                        publishProgress(progress);
//                        outputStream.write(data,0,temp);
//                        outputStream.flush();
//                    }
//                }
//            }catch (ProtocolException e) {
//                e.printStackTrace();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return outputStream.toByteArray();
//        }
//
//        /**
//         * 表示运行在主线程中用来更新进度的回调方法
//         * 如果doInBackground()方法中调用publishProgress()方法向主线程发布进度 由该方法获取进度后更新ui界面进度
//         * @param values
//         */
//        @Override
//        protected void onProgressUpdate(Integer... values) {
//            Log.i("tag",Thread.currentThread().getName()+"-----onProgressUpdate-----");
//            pd.setProgress(values[0]);//设置更新进度
//        }
//
//        @Override
//        protected void onPostExecute(byte[] result) {
//            if ((result!=null && result.length!=0)){
//                Bitmap bm=BitmapFactory.decodeByteArray(result,0,result.length);
//                iv.setImageBitmap(bm);
//            }else {
//                Toast.makeText(MainActivity.this,"图片下载失败!",Toast.LENGTH_SHORT).show();
//            }
//            pd.dismiss();
//        }
//    }
//}


//    /**
//     * 演示点击按钮下载图片
//     */
//    private ImageView iv_show;
//    private String imagePath="https://d2j3coy501s4ze.cloudfront.net/images/11511/700/ff42ba91ff49e2309d4a35cc5c305c934b626d0e_57e8ca8b49d96.jpeg";
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_asynctask);
//        iv_show=findViewById(R.id.iv_show);
//    }
//    //点击按钮下载图片
//    public void downLoadImg(View view){
//        new MyAsyncTask().execute(imagePath);//启动asynctask
//    }
//
//    /**
//     * AsyncTask类三个规范
//     * Params表示当前的AsyncTask操作时需要的参数的类型
//     * Progress 表示当前AsyncTask耗时操作时的进度类型
//     * Result 表示当前AsyncTask耗时操作结果的数据类型
//     */
//    class MyAsyncTask extends AsyncTask<String,Void,byte[]>{
//        /**
//         * 表示在AsyncTask执行之前运行在ui线程中的准备方法  初始化操作
//         */
//        @Override
//        protected void onPreExecute() {
//            Log.i("tag",Thread.currentThread().getName()+"-----onPreExecute-----");
//        }
//
//        /**
//         * 表示在onPreExecute()方法执行结束后立即执行
//         * 该方法运行在工作线程中  主要执行耗时操作
//         * 该方法的参数类型与类中范型第一个参数类型一致
//         * 返回值与类中范型第三个参数一致
//         * @param
//         * @return
//         */
//        @Override
//        protected byte[] doInBackground(String... params) {
//            Log.i("tag",Thread.currentThread().getName()+"-----doInBackgroud-----");
//
//            ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
//            byte[] images=null;
//            try {
//                URL url=new URL(params[0]);
//                HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//                conn.setDoInput(true);
//                conn.setRequestMethod("GET");
//                conn.connect();
//                int responseCode=conn.getResponseCode();
//                if (responseCode==200){
//                    InputStream input =conn.getInputStream();
//                    byte[] data=new byte[1024];
//                    int temp= 0;
//                    while ((temp=input.read(data))!=-1){
//                        outputStream.write(data,0,temp);
//                    }
//                }
//            }catch (MalformedURLException e){
//                e.printStackTrace();
//            }catch (ProtocolException e){
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            images=outputStream.toByteArray();
//            return images;
//        }
//
//        /**
//         * 当doInBackgroud()方法执行完毕后将耗时操作的结果符合给该方法
//         * 该方法负责就数据结果展示到ui界面
//         * @param
//         */
//        @Override
//        protected void onPostExecute(byte[] result) {
//            Log.i("tag",Thread.currentThread().getName()+"-----doInBackgroud-----");
//            if (result !=null && result.length!=0){
//                //将图片的字节数组转换成图片对象 bimap对象
//                Bitmap bm= BitmapFactory.decodeByteArray(result,0,result.length);
//                iv_show.setImageBitmap(bm);
//            }else {
//                Toast.makeText(MainActivity.this,"图片下载失败！",Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//}
///**
// * 线程演示
// */
//    private TextView tv;
//    private int count=0;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_thread1);
//        tv=findViewById(R.id.tv);
//
//        //违反了ui线程模型的第一条规定  主线程阻塞
////        while (true){
////            count++;
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////            tv.setText(count+"");
////        }
//
////        违反ui线程模型的第二条规则   非ui线程不能操作ui工具包
////        android.view.ViewRootImpl$CalledFromWrongThreadException
////         Only the original thread that created a view hierarchy can touch its views.
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    count++;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    tv.setText(count+"");
//                }
//            }
//        }).start();
//    }
//}

///**
// * 演示隐式启动
// */
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_intent001);
//    }
//
//    public void onClick(View view){
//        switch (view.getId()){
//        case R.id.button01://点击按钮以隐式启动的方式启动当前应用中的activity
//            Intent intent=new Intent();
//            intent.setAction("github.io.action");
////            intent.addCategory("android.intent.category.DEFAULT");
////            intent.setData(Uri.parse("io://github:90/res"));
//            intent.setDataAndType(Uri.parse("io://github:90/res"),"text/*");
//            startActivity(intent);
//            break;
//        case R.id.button02://点击按钮启动其他应用中的activity
//            Intent intent1=new Intent();
//            intent1.setAction("github.io.intent");
//            startActivity(intent1);
//            break;
//        }
//    }
//}


//  intent的属性演示
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_intent01);
//    }
//
//    public void click(View view) {
//        switch (view.getId()) {
//            case R.id.btn_start://点击按钮启动activity
//                //方法1
////            Intent intent=new Intent();
////            ComponentName componentName=new ComponentName(MainActivity.this,ResultActivity.class);
////            intent.setComponent(componentName);
//                //方法2
////        Intent intent = new Intent();
////        intent.setClass(MainActivity.this,ResultActivity.class);
//                //方法3
//                Intent intent1= new Intent();
//                intent1.setClassName(MainActivity.this, ResultActivity.class.getName());
//                startActivity(intent1);
//                break;
//            case R.id.btn_call:
//                //Uri.parse(string s)uri抽象类 调用静态的parse()方法 指定action操作的数据
//                Intent intent2=new Intent(Intent.ACTION_CALL,Uri.parse("tel://10086"));
//                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    //    ActivityCompat#requestPermissions
//                    // here to request the missing permissions, and then overriding
//                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                    //                                          int[] grantResults)
//                    // to handle the case where the user grants the permission. See the documentation
//                    // for ActivityCompat#requestPermissions for more details.
//                    return;
//                }
//                startActivity(intent2);
//                break;
//            case R.id.btn_send://发送短信
//                Intent intent3=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms://10010"));
//                startActivity(intent3);
//                break;
//            case R.id.btn_openview://打开网页
//                Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.baidu.com"));
//                startActivity(intent4);
//                break;
//            case R.id.btn_play:
//                Intent intent5=new Intent(Intent.ACTION_VIEW);
////                intent5.setData(Uri.parse("file:///"+ Environment.getExternalStorageDirectory().getAbsolutePath()+"Far.mp3"));
////                intent5.setType("audio/*");
//                intent5.setDataAndType(Uri.parse("file:///"+ Environment.getExternalStorageDirectory().getAbsolutePath()+"Far.mp3"),
//                "audio/*");
//                startActivity(intent5);
//                break;
//
//        }
//    }
//}


//Acativity的启动模式
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_activity01);
//    }
//    public void onClick(View view){
//        Intent intent = null;
//        switch (view.getId()){
//            case R.id.btn01://启动01
//                intent=new Intent(MainActivity.this,MainActivity.class);
//                break;
//            case R.id.btn02:
//                intent=new Intent(MainActivity.this,OtherActivity.class);
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
//        setContentView(R.layout.activity_task);
//    }
//    public void click(View view){
//        startActivity(new Intent(MainActivity.this,OtherActivity.class));
//    }
//}


///**
// * 演示Application传递数据
// * 1、创建类继承Application  将需要存储的数据定义为application的属性
// * 2、发送的activity中 存储数据
// * 3、接收的activity中 获取数据操作
// * 4、在清单文件中进行注册
// */
//    private MyApplication application;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_application);
//    }
//    //点击按钮将数据存储到Application中
//    public void click(View view){
//        application= (MyApplication) getApplication();
//        application.setName("小明");
//        application.setAge(18);
//
//        startActivity(new Intent(MainActivity.this,ResultActivity.class));
//
//    }
//}


//Activity之间通过Bundle传值
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bundle);
//    }
//    //点击按钮通过bundle将数据传递到目标activity
//    public void onClick(View view){
//        //1、创建intent意图对象
//        Intent intent= new Intent(MainActivity.this,ResultActivity.class);
//        //2、创建bundle对象  用来存储需要传递的数据
//        Bundle bundle = new Bundle();
//        //3、就需要传递的数据存储到bundle对象中
//        bundle.putString("name","凤姐");
//        bundle.putInt("age",30);
//        bundle.putDouble("score",80.5);
//        bundle.putChar("sex",'女');
//        //4、将bundle对象存储到intent对象中
//        intent.putExtras(bundle);
//        //5、启动activity
//        startActivity(intent);
//
//    }
//}


//Activity之间通过intent传值
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_intent);
//    }
//    //点击按钮传递数据到指定的actvity中
//    public void send(View view){
//        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
//        //putExtra(String key) key表示唯一标示当前值的键  value为具体类型
//        intent.putExtra("name","zhangsan");
//        intent.putExtra("age",20);
//        intent.putExtra("score",98.5);
//        intent.putExtra("sex",'男');
//        intent.putExtra("bl",true);
//
//
//        startActivity(intent);
//    }
//}


//    /**
//     * 演示Activity的生命周期
//     */
//}
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_activitymain);
//        Log.i("tag","--------MainActivity------onCreate()----");
//    }
//    public void click(View view){
//        Intent intent = new Intent(MainActivity.this,OtherActivity.class);
//        startActivity(intent);
//    }
//
//    /**
//     * 表示activity能够被用户看到时回调的方法
//     */
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i("tag","--------MainActivity------onStart()----");
//    }
//
//    /**
//     * 表示activity获取用户焦点时  能与用户交互时    */
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i("tag","--------MainActivity------onResume()----");
//    }
//
//    /**
//     * 表示activity失去以后焦点时回调的方法
//     */
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i("tag","--------MainActivity------onPause()----");
//    }
//
//    /**
//     * 表示activity被完全遮挡时回调的方法
//     */
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i("tag","--------MainActivity------onStop()----");
//    }
//
//    /**
//     * 表示activity处于停止状态重新被启动时回调的方法
//     */
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i("tag","--------MainActivity------onRestart()----");
//    }
//
//    /**
//     * 表示activity被销毁时回调的方法
//     */
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i("tag","--------MainActivity------onDestroy()----");
//    }
//}


//      跳转
//    public void onClick(View view){
//        Intent intent=new Intent(MainActivity.this,OtherActivity.class);//通过intent意图对象描述启动的activity
//        startActivity(intent);//启动
//    }


//    /**
//     * 演示AutoCompleteTextView的使用
//     */
//    private AutoCompleteTextView autoview; //获得AutoCompleteTextView
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_autocompletetxetview);
//        autoview = findViewById(R.id.auto);   //autoview放入R.id
//        //1、准备数据源
//        String[] countrys = getResources().getStringArray(R.array.country);
//        //2、将数据源数据加载到适配器中
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
//                R.layout.support_simple_spinner_dropdown_item, countrys);
//        //3、将适配器数据加载到控件中
//        autoview.setAdapter(adapter);
//        //表示当AutoCompleteTextView控件中某一项被点击的监听事件
//        autoview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String str = parent.getItemAtPosition(position).toString();//根据下标获取点击item的信息
//                Toast.makeText(MainActivity.this, "当前被选中了" + str, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }


//    /**
//     * 演示Spinner的使用
//     */
//    private Spinner spinner;
//    private String[] plantes;
//    private ArrayAdapter<String> adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_spinner);
//        spinner = findViewById(R.id.sp);
//        //1、准备需要加载展示的数据源
//        plantes = getResources().getStringArray(R.array.plantes_array);
//        //2、将数据源的数据加载到适配器
//        /**
//         * context, 上下文对象
//         * resource,表示列表item的布局资源id
//         * objects，表示加载的数据源
//         */
//        adapter = new ArrayAdapter<String>(MainActivity.this,
//                R.layout.support_simple_spinner_dropdown_item, plantes);
//        //3、将适配器中的数据加载到控件中
//        spinner.setAdapter(adapter);
//        //表示当spinner控件中item被选中时触发的监听事件
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            /**
//             * 表示当spinner控件中心item被选中时回调的方法
//             * AdapterView<?>parent  表示当前触发事件的适配器控件对象 spinner
//             * View view    表示当前被选中itew的对象
//             * int position  表示当前被选中的itew的下标
//             * long id      表示当前被选中的itew的id
//             * @param parent
//             * @param view
//             * @param position
//             * @param id
//             */
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
////                String child = adapter.getItem(position);
////                Toast.makeText(view.getContext(), child, Toast.LENGTH_SHORT).show();
//                String s1 = plantes[position]; //在数据源中获取
//                String s2 = adapter.getItem(position); //根据下标在适配器中获取
//                String s3 = spinner.getItemAtPosition(position).toString();//根据下标在spinner控件中获取
//                Toast.makeText(MainActivity.this,"s1="+s1+"s2="+s2+"s3="+s3,Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//            }
//        });
//    }


// Toast
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_toast);
//    }
//    /**
//     * 点击按钮弹出toast
//     */
//    public void click(View view){
//        switch (view.getId()){
//        case R.id.btn01:
//            //makeText(创建Toast上下文对象，表示弹出提示信息文本，表示弹出Toast持续时间 毫秒)
////          Toast toast =Toast.makeText(MainActivity.this,"我是Toast!",Toast.LENGTH_SHORT);
////          toast.show();//展示Toast
//
//            Toast.makeText(MainActivity.this,"我是Toast!",Toast.LENGTH_SHORT).show();
//
//
//        break;
//        case R.id.button1://点击按钮弹出toast更改位置
//            Toast toast = Toast.makeText(MainActivity.this,"网络中断，请检查！",Toast.LENGTH_SHORT);
//            //setGravity(gravity,xOffset,yOffset)
//            //setGravity(设置当前Toast的位置，表示设置x轴的偏移量，表示设置y轴的偏移量)
//            toast.setGravity(Gravity.CENTER,0,0);
//            toast.show();
//        break;
//
//        }
//    }
//


//    /**
//     * 需求：选择checkbox时提示选中的文本信息 点击确定按钮时打印最终的选择文本信息 实现全选
//     * 1、先绑定checkbox的状态监听事件 选中某一项时给出提示信息
//     * 2、绑定按钮的单击事件  点击时判断最终选择的checkbox 将选中的文本给出提示
//     * 3、实现全选功能
//     * 全选
//     * 如果所有的checkbox全部被选中则全选被选中
//     * 如果全选被选中则所有的checkbox均都被选中
//     * 如果取消全选则所有的checkbox都取消选中
//     *
//     */
//    private CheckBox cd1,cd2,cd3;
//    private MyOnCheckedChangeListener listener = new MyOnCheckedChangeListener();
//    private CheckBox cd_all;
//        @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_checkbox);
//        cd1=findViewById(R.id.cd1);
//        cd2=findViewById(R.id.cd2);
//        cd3=findViewById(R.id.cd3);
//        cd_all=findViewById(R.id.cd_all);
//
//
//        cd1.setOnCheckedChangeListener(listener);
//        cd2.setOnCheckedChangeListener(listener);
//        cd3.setOnCheckedChangeListener(listener);
//
//    }
//    //点击事件调用的函数
//    public void click(View view){
//        switch (view.getId()){
//        case R.id.btn_true:
//            String str=checkedString();
//            Toast.makeText(MainActivity.this,"您的爱好是:"+str,Toast.LENGTH_SHORT).show();
//            break;
//        case R.id.cd_all://点击全选的checkbox
//            boolean bl = cd_all.isChecked();
//            cd1.setChecked(bl);
//            cd2.setChecked(bl);
//            cd3.setChecked(bl);
//             break;
//
//        }
//    }
//    //获取checkbox中最选择的文本
//    public String checkedString(){
//        StringBuffer sb=new StringBuffer();
//        if (cd1.isChecked()){
//            sb.append(cd1.getText().toString());
//        }
//        if (cd2.isChecked()){
//            sb.append(cd2.getText().toString());
//        }
//        if (cd3.isChecked()){
//            sb.append(cd3.getText().toString());
//        }
//        return sb.toString();
//    }
//
//    /**
//     * 以内部类的形式选中状态改变的监听事件
//     */
//    class MyOnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {
//        /**
//         * CompoundButton buttonView. 表示当前状态切换的控件对象
//         * booleam isChecked 表示当前控件对象的选中状态
//         *
//         */
//        @Override
//        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//获取选中状态的文本并且给出提示
//            CheckBox cd = (CheckBox) buttonView;
//            String str = cd.getText().toString();
//            if (isChecked) {
//                Toast.makeText(MainActivity.this,"当前选中的爱好是:"+str,Toast.LENGTH_SHORT).show();
//            }
//
//            //如果发现列表中的checkbox全部被选中则全选被选中 否则全选不被选中
//            if (cd1.isChecked() && cd2.isChecked() && cd3.isChecked()){
//                cd_all.setChecked(true);
//            }else {
//                cd_all.setChecked(false);
//            }
//
//        }
//
//    }


//    R
//    /**
//     * 演示radiobutton
//     */
//    private Button btn;
//    private RadioGroup rg;
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_radio);
//        btn=findViewById(R.id.rb_true);
//        rg=(RadioGroup)findViewById(R.id.rg);
//        //表示RadioGroup中的radiobutton状态切换时触发的监听
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            /**
//             * 当RadioGroup中的radiobutton状态切换时回调的方法
//             * RadioGroup group, 表示当前状态切换的radiobutton属于那个radiogroup对象
//             * int checkedId 表示选中状态的radiobuttom的资源id
//             */
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                //根据回传的选中的radiobutton的对象的资源id获取radiobutton对象
//                RadioButton rb =(RadioButton)findViewById(checkedId);
//                String str=rb.getText().toString();//获取选中radiobutton的文本
//                Toast.makeText(MainActivity.this,"您选中的是:"+str,Toast.LENGTH_SHORT).show();
//            }
//        });
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int checkedId=rg.getCheckedRadioButtonId();//获取radiogroup中选中radiobutton的资源id
//                RadioButton rb=(RadioButton)findViewById(checkedId);
//                Toast.makeText(MainActivity.this,"您最终确定是:"+rb.getText().toString(),Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }


//    /**
//     * 演示imageview实现图片切换器
//     * 将需要展示的图片存储到容器
//     * 点击上一张 获取当前图片在容器中的上一张图片动态展示  如果已经是第一张  需要展示第一张即可
//     * 点击下一张 获取当前图片在容器中的下一张图片动态展示 如果已经是最后一张 需要展示最后一张即可
//     */
//    private int[] images={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
//    private ImageView iv;
//    private int index;//数组的下标
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_switch);
//    }
//    public void click(View view){
//        switch (view.getId()){
//        case R.id.btn_last://点击上一张
//            index--;
//            break;
//        case R.id.btn_next://点击下一张
//            index++;
//            break;
//        }
//        if (index < 0){
//            index=0;
//        }
//        if (index>images.length-1){
//            index=images.length-1;
//        }
//        //确定当前展示的图片的资源id setImageResource(int imageId)根据参数指定的图片资源id动态展示对应图片
//        iv.setImageResource(images[index]);
//
//    }


//      button中的方法调用
//    private Button btn,btn01;
//    private MyOnClickListener listener = new MyOnClickListener();
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_switch);
//        btn=(Button)findViewById(R.id.btn);//根据资源id获取view视图
//        btn01=(Button)findViewById(R.id.btn02);
//
//        btn.setOnClickListener(this);
//        btn01.setOnClickListener(this);

//        //方式二 内部类的形式
//        btn.setOnClickListener(listener);
//        btn01.setOnClickListener(listener);


//        方式一：匿名内部类的形式 给button按钮设置点击事件监听
//        btn.setOnClickListener(new View.OnClickListener() {
//            //当按钮被点击时回调的方法
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"我被点击了！",Toast.LENGTH_SHORT).show();
//            }
//        });
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn:
//                Toast.makeText(MainActivity.this,"第一个按钮被点击了！",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn02:
//                Toast.makeText(MainActivity.this,"第二个按钮被点击了！",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn03:
//                Toast.makeText(MainActivity.this,"点击成功请继续",Toast.LENGTH_SHORT).show();
//            case R.id.btn04:
//                Toast.makeText(MainActivity.this,"哈哈哈哈哈哈哈",Toast.LENGTH_SHORT).show();
//
//        }
//    }

//    class MyOnClickListener implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()){
//            case R.id.btn:
//                Toast.makeText(MainActivity.this,"第一个按钮被点击了！",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn02:
//                Toast.makeText(MainActivity.this,"第二个按钮被点击了！",Toast.LENGTH_SHORT).show();
//                break;
//
//            }
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//


//      activity_main4中
//    /**
//     * 演示Button的点击事件
//     * 1、在需要绑定点击事件的Button标签中设置android:onClick属性值
//     * 2、在加载当前layout布局的activity中添加方法
//     * public修饰符  没有返回值 void 并且有唯一的view类型的参数
//     * 要求方法名称必须和onClick属性值相同
//     * 3、在该方法中添加点击按钮的操作代码
//     */
//    //点击button按钮时调用的方法
//    public void onClick(View view){
//        int id = view.getId(); //获取点击控件的id
//        switch (id){
//        case R.id.btn:
//            Toast.makeText(MainActivity.this,"第一个按钮被点击了！",Toast.LENGTH_SHORT).show();
//            break;
//        case R.id.btn02:
//            Toast.makeText(MainActivity.this,"第二个按钮被点击了！",Toast.LENGTH_SHORT).show();
//
//            break;
//
//        }
//    }
//}
