package github.io.tplxmx96;

import android.app.Application;

/**
 * Created by yuweichen on 2018/7/16.
 */

public class MyApplication extends Application{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
