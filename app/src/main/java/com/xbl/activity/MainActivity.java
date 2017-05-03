package com.xbl.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.chaychan.viewlib.PowerfulEditText;

/**
 * 1.删除文字（默认图标）
 * 2.删除文字（自定义右侧图标）
 * 3.明文密文（默认图标）
 * 4.明文密文（自定义图标，右侧按钮的点击事件）
 */

public class MainActivity extends AppCompatActivity {
    private PowerfulEditText powerfulEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        powerfulEditText= (PowerfulEditText) findViewById(R.id.last_edt);
        //右侧按钮的点击事件
        powerfulEditText.setOnRightClickListener(new PowerfulEditText.OnRightClickListener() {
            @Override
            public void onClick(EditText editText) {
                Toast.makeText(MainActivity.this,"右侧按钮被点击",Toast.LENGTH_LONG).show();
            }
        });
    }
}
