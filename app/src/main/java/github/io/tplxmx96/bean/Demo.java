package github.io.tplxmx96.bean;

import java.util.ArrayList;
import java.util.List;

import github.io.tplxmx96.IntentActivity;
import github.io.tplxmx96.LifecycleActivity;
import github.io.tplxmx96.MainActivity;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class Demo {
    private String name;
    private Class clz;  //Activity

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
    }

    public static List<Demo> getList(){
        List<Demo> demos = new ArrayList<>();

        Demo demo = new Demo();
        demo.setName("生命周期测试");
        demo.setClz(LifecycleActivity.class);
        demos.add(demo);

        Demo demo2 = new Demo();
        demo2.setName("Intent测试(隐式 & 显示)");
        demo2.setClz(IntentActivity.class);
        demos.add(demo2);

        Demo demo3 = new Demo();
        demo3.setName("Activity的启动模式");
        demo3.setClz(MainActivity.class);
        demos.add(demo3);

        Demo demo4 = new Demo();
        demo4.setName("布局文件的深入学习");
        demos.add(demo4);

        Demo demo5 = new Demo();
        demo5.setName("Handler & Lopper & Message的深入学习");
        demos.add(demo5);

        Demo demo6 = new Demo();
        demo6.setName("onTouch的事件传递过程");
        demos.add(demo6);

        Demo demo7 = new Demo();
        demo7.setName("View的绘制原理");
        demos.add(demo7);

        Demo demo8 = new Demo();
        demo8.setName("ListView练习");
        demo8.setClz(MainActivity.class);
        demos.add(demo8);

        return demos;
    }

}
