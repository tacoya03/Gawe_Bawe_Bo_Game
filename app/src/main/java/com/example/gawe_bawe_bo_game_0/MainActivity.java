package com.example.gawe_bawe_bo_game_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button start_bt;
    ImageButton bt1, bt2, bt3;
    TextView tv_1;
    ImageView iv_1;
    int i;
    int getComeHand;
    LinearLayout li_a, li_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_1 = findViewById(R.id.iv_1);

        tv_1 = findViewById(R.id.tv_1);

        start_bt = findViewById(R.id.start_bt);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);

        li_a = findViewById(R.id.li_a);
        li_b = findViewById(R.id.li_b);
        tv_1.setText("시작합니다");


        li_b.setVisibility(View.VISIBLE);
        li_a.setVisibility(View.INVISIBLE);


        start_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_1.setText(null);
                li_a.setVisibility(View.VISIBLE);
                li_b.setVisibility(View.INVISIBLE);
            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1;
                test();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 2;
                test();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i =3;
                test();
            }
        });
    }

    void test(){
        iv_1.setVisibility(View.VISIBLE);
        getComeHand = new Random().nextInt(3) + 1;
        if(i == 1){
            if(getComeHand == 1){
                iv_1.setImageResource(R.drawable.gawe);
                tv_1.setText("비겼어요");
            }
            else if(getComeHand == 2){
                iv_1.setImageResource(R.drawable.bawe);
                tv_1.setText("졌어요");
            }
            else if (getComeHand == 3){
                iv_1.setImageResource(R.drawable.bo);
                tv_1.setText("이겼어요");
            }
        }
        else if(i == 2){
            if(getComeHand == 1){
                iv_1.setImageResource(R.drawable.gawe);
                tv_1.setText("이겼어요");
            }
            else if(getComeHand == 2){
                iv_1.setImageResource(R.drawable.bawe);
                tv_1.setText("비겼어요");
            }
            else if (getComeHand == 3){
                iv_1.setImageResource(R.drawable.bo);
                tv_1.setText("졌어요");
            }
        }
        else if(i == 3){
            if(getComeHand == 1){
                iv_1.setImageResource(R.drawable.gawe);
                tv_1.setText("졌어요");
            }
            else if(getComeHand == 2){
                iv_1.setImageResource(R.drawable.bawe);
                tv_1.setText("이겼어요");
            }
            else if (getComeHand == 3){
                iv_1.setImageResource(R.drawable.bo);
                tv_1.setText("비겼어요");
            }
        }

        li_b.setVisibility(View.VISIBLE);
        li_a.setVisibility(View.INVISIBLE);
    }
}











