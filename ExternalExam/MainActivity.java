package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ans;
    int n1,n2,r;
    String s1,s2,s3;
    Button one,two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getNum(){

        ed1=findViewById(R.id.n1);
        ed2=findViewById(R.id.n2);
        ans=findViewById(R.id.result);

        s1=ed1.getText().toString();
        s2=ed2.getText().toString();
    }

    public void sum(View view){
        getNum();
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        r=n1+n2;
        ans.setText(Integer.toString(r));
    }
    public void sub(View view){
        getNum();
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        r=n1-n2;
        ans.setText(Integer.toString(r));
    ;


    }
    public void mul(View view){
        getNum();
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        r=n1*n2;
        ans.setText(Integer.toString(r));    }
    public void div(View view){
        getNum();
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        r=n1/n2;
        ans.setText(Integer.toString(r));
    }



}



