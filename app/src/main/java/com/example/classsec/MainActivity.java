package com.example.classsec;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user=findViewById(R.id.username);
        EditText pwd=findViewById(R.id.pwd);
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在屏幕上显示提示 Toast 吐司
                if(user.getText().toString().equals("user")&&pwd.getText().toString().equals("pwd")){
                    Toast.makeText(MainActivity.this, "login success", Toast.LENGTH_SHORT).show();
                    AlertDialog alertDialog1 = new AlertDialog.Builder(MainActivity.this)
                            .setTitle("登陆成功")//标题
                            .setMessage("欢迎你"+user.getText().toString())//内容
                            .setIcon(R.mipmap.ic_launcher)//图标
                            .create();
                    alertDialog1.show();
                }
                else{
                    Toast.makeText(MainActivity.this, "login fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn=findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText degree=findViewById(R.id.editTextTextPersonName2);
                if (!degree.getText().toString().equals("")){
                    double ssd=Double.parseDouble(degree.getText().toString());
                    double hsd=ssd*1.8+32;
                    TextView output=findViewById(R.id.textView2);
                    output.setText("华氏度为:"+hsd);
                };
            }
        });

    }
}