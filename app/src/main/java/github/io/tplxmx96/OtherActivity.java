package github.io.tplxmx96;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OtherActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }
    public void click(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.button01:
                intent = new Intent(OtherActivity.this,MainActivity.class);
                break;
            case R.id.button02:
                intent = new Intent(OtherActivity.this,MainActivity.class);
                break;
        }
        startActivity(intent);
    }
}






















































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
























