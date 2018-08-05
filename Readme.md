### TP的安卓练习仓库

#### Activity的生命周期
Activity是什么？
Activity从创建到运行到暂停.停止到消亡，从无到有再到无，这样一个过程中所经历的状态就叫做生命周期。

Activity的生命周期作用
 Activity这个组件,它处于不同状态时，针对当前状态执行相应的逻辑代码，这样可以提高组件效率，并且提高用户体验，
 让这个组件在开发中发挥更大的作用，所以研究Activity的生命周期可以让我们这个组件发挥更大的作用。

Activity生命周期方法
|    Method    |                   Description                    |    Killable   |            Next           |
| :----------- | :----------------------------------------------: | ------------: | ------------------------: |
|   onCreate   |当启动新的Activity的时候被调用                       |      No       | onStart()                 |
|   onStart    |当Activity对用户即将可见时调用                       |      No       | onResume()  or onStop()   |
|   onRestart  |重新启动Activity时调用此方法是重启留在缓存中的Activity |      No       | onStart()                 |
|   onResume   |当Activity界面可与用户交互调用                       |      No       | onPause()                 |
|   onPause    |当系统要启动一个其他的Activity时调用，用于保存当前数据  |      No       | onResume()  or onStop()   |
|   onStop     |该Activity已经不可见时调用                          |      No       | onRestart() or onDestroy()|
|   onDestroy  |当Activity被finish或手机内存不足被销毁的时候调用      |      No       | nothing                   |

Activity生命周期状态
运行状态: 一个新Activity启动后，它在屏幕最前端显示，此时它处于可见并可和用户交互的激活状态。

暂停暂停: 当Activity被另一个透明或者Dialog样式的Activity覆盖时的状态，原Activity仍然可见，但它已经失去了焦点不可与用户交互。

停止状态: 当Activity被另一个Activity覆盖，失去焦点，并不可见时处于Stopped状态。

销毁状态: 当Activity被系统杀死回收或者没有被启动时处于Killed状态。

Activity示例:
```code
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ...
        //表示创建Activity启动的时候被调用的方法
        Log.d("tp","页面被初始化----> onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        //表示Activity能够被用户看到时回调的方法
        Log.d("tp","页面被初始化----> onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //表示Activity获取用户焦点时能与用户交互时
        Log.d("tp","页面被初恢复----> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //表示Activity失去以后焦点回调的方法
        Log.d("tp","页面被初暂停----> onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //表示Activity被完全遮挡时回调的方法
        Log.d("tp","页面被停止----> onStop");
    }

    @Override
        protected void onRestart() {
        super.onRestart();
        //表示Activity处于停止状态重新被启动时回调的方法
        Log.d("tp","页面被重启----> onRestart");
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //表示Activity被销毁时回调的方法
        Log.d("tp","页面被初销毁----> onDestroy");
    }

```
