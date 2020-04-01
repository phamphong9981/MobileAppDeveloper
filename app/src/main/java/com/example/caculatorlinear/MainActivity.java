package com.example.caculatorlinear;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    String store="";
    int operator;
    int flag=0;
    TextView textView;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    Button btn17;
    Button btn18;
    Button btn19;
    Button btn20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder display=new StringBuilder("");
        AnhXa();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                store="0";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setHint("0");
                textView.setText("0");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")||textView.getText().toString().equals(""));
                else{
                    String text=textView.getText().toString();
                    textView.setText(text.substring(0,text.length()-1));
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator=4;
                if(flag==0)store=textView.getText().toString();
                textView.setText("0");
                btn4.setBackgroundResource(R.drawable.button);
                btn8.setBackgroundResource(R.drawable.button0);
                btn12.setBackgroundResource(R.drawable.button0);
                btn16.setBackgroundResource(R.drawable.button0);
                flag=1;
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("7");
                    else textView.append("7");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("8");
                    else textView.append("8");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("9");
                    else textView.append("9");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator=3;
                if(flag==0) store=textView.getText().toString();
                textView.setText("0");
                btn4.setBackgroundResource(R.drawable.button0);
                btn8.setBackgroundResource(R.drawable.button);
                btn12.setBackgroundResource(R.drawable.button0);
                btn16.setBackgroundResource(R.drawable.button0);
                flag=1;
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("4");
                    else textView.append("4");
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("5");
                    else textView.append("5");
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("6");
                    else textView.append("6");
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator=1;
                if(flag==0) store=textView.getText().toString();
                textView.setText("0");
                btn4.setBackgroundResource(R.drawable.button0);
                btn8.setBackgroundResource(R.drawable.button0);
                btn12.setBackgroundResource(R.drawable.button);
                btn16.setBackgroundResource(R.drawable.button0);
                flag=1;
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("1");
                    else textView.append("1");
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("2");
                    else textView.append("2");
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("3");
                    else textView.append("3");
                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator=2;
                if(flag==0) store=textView.getText().toString();
                textView.setText("0");
                btn4.setBackgroundResource(R.drawable.button0);
                btn8.setBackgroundResource(R.drawable.button0);
                btn12.setBackgroundResource(R.drawable.button0);
                btn16.setBackgroundResource(R.drawable.button);
                flag=1;
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString().equals(""));
                else {
                    double now=Double.parseDouble(textView.getText().toString());
                    now=-now;
                    if (now%1==0) textView.setText(String.format("%.0f",now));
                    else textView.setText(String.valueOf(now));
                }
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==13);
                else{
                    if (textView.getText().toString().equals("0")) textView.setText("0");
                    else textView.append("0");
                }
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains("."));
                else textView.append(".");
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double now;
                btn4.setBackgroundResource(R.drawable.button0);
                btn8.setBackgroundResource(R.drawable.button0);
                btn12.setBackgroundResource(R.drawable.button0);
                btn16.setBackgroundResource(R.drawable.button0);
                flag=0;
                if (store.equals("")) ;
                else {
                    double numStore=Double.parseDouble(store);
                    if(textView.getText().toString().equals("")) now=0.0;
                    else{
                        now=Double.parseDouble(textView.getText().toString());
                    }
                    Double res=0.0;
                    switch (operator){
                        case 1:
                            operator=0;
                            res=(numStore+now);
                            if(Math.log10(res)>=13){
                                NumberFormat numberFormat=new DecimalFormat("0.########E0");
                                textView.setText(numberFormat.format(res));
                            }else {
                                if(res%1==0) textView.setText(String.format("%.0f",res));
                                else textView.setText(String.valueOf(res));
                            }
                            break;
                        case 2:
                            operator=0;
                            res=(numStore-now);
                            if(Math.log10(res)>=13){
                                NumberFormat numberFormat=new DecimalFormat("0.########E0");
                                textView.setText(numberFormat.format(res));
                            }else {
                                if(res%1==0) textView.setText(String.format("%.0f",res));
                                else textView.setText(String.valueOf(res));
                            }
                            break;
                        case 3:
                            operator=0;
                            res=(numStore*now);
                            if(Math.log10(res)>=13){
                                NumberFormat numberFormat=new DecimalFormat("0.########E0");
                                textView.setText(numberFormat.format(res));
                            }else{
                                if(res%1==0) textView.setText(String.format("%.0f",res));
                                else textView.setText(String.valueOf(res));
                            }
                            break;
                        case 4:
                            if (now==0) break;
                            operator=0;
                            res=(numStore/now);
                            if(Math.log10(res)>=13){
                                NumberFormat numberFormat=new DecimalFormat("0.########E0");
                                textView.setText(numberFormat.format(res));
                            }else {
                                if(res%1==0) textView.setText(String.format("%.0f",res));
                                else textView.setText(String.valueOf(res));
                            }
                            break;
                        default:
                            if(Math.log10(now)>=13){
                                NumberFormat numberFormat=new DecimalFormat("0.########E0");
                                textView.setText(numberFormat.format(now));
                            }else {
                                if(now%1==0) textView.setText(String.format("%.0f",now));
                                else textView.setText(String.valueOf(now));
                            }
                    }
                }
            }
        });
    }

    private void AnhXa() {
        textView=findViewById(R.id.textView);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);
        btn16=findViewById(R.id.btn16);
        btn17=findViewById(R.id.btn17);
        btn18=findViewById(R.id.btn18);
        btn19=findViewById(R.id.btn19);
        btn20=findViewById(R.id.btn20);
    }
}