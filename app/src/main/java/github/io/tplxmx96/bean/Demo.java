package github.io.tplxmx96.bean;

import java.util.ArrayList;
import java.util.List;

import github.io.tplxmx96.LifecycleActivity;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class Demo {
    private String name;
    private Class clz;

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
        demos.add(demo2);

        return demos;
    }

}
