package com.example.dixon.buttonclick01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTV;
    private Button mBT2=null;
    private Button mBT3=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定TextView资源
        mTV=(TextView)findViewById(R.id.tv);

        //绑定button2资源
        mBT2=(Button)findViewById(R.id.btn2);
        //设置button2监听
        mBT2.setOnClickListener(new mClickListener2());

        //绑定button3资源
        mBT3=(Button)findViewById(R.id.btn3);
        //设置button3监听
        mBT3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mTV.setText("使用匿名类实现button点击事件");
                Toast.makeText(MainActivity.this,"使用匿名类实现button点击事件",Toast.LENGTH_LONG).show();
            }
        });
    }

    /* @param view */
    //myClick为xml中指定的方法名，参数是view类型
    public void myClick1(View view){
        mTV.setText("这是xml方式指定的button响应");
        Toast.makeText(this,"这是xml方式指定的button响应",Toast.LENGTH_LONG).show();
    }

    //实现OnClickListener接口
    private class mClickListener2 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            mTV.setText("使用内部类实现button点击事件");
            Toast.makeText(MainActivity.this,"使用内部类实现button点击事件",Toast.LENGTH_LONG).show();
        }
    }
}
