package github.io.tplxmx96.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuweichen on 2018/8/5.
 */

public class Test{
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

    public static List<Test> getList(){
        List<Test> tests = new ArrayList<>();

        Test test = new Test();
        test.setName("Tosat测试");
        tests.add(test);

        Test test2 = new Test();
        test2.setName("AlertDiolog测试");
        tests.add(test2);


        Test test3 = new Test();
        test3.setName("动态添加数据测试");
        tests.add(test3);
        return tests;
    }
}
