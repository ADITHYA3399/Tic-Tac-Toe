package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int flag = 0, count = 9;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9;
    int c1 = -1, c2 = -1, c3 = -1, c4 = -1, c5 = -1, c6 = -1, c7 = -1, c8 = -1, c9 = -1;
    LinearLayout ll0, ll1, ll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);
        iv9 = findViewById(R.id.iv9);

        ll0 = findViewById(R.id.ll0);
        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);


    }

    public void box1(View view) {
        if(count > 0){
            if(flag == 0){
                iv1.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c1 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv1.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c1 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv1.setEnabled(false);
    }

    public void box2(View view) {
        if(count > 0){
            if(flag == 0){
                iv2.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c2 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv2.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c2 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv2.setEnabled(false);
    }

    public void box3(View view) {
        if(count > 0){
            if(flag == 0){
                iv3.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c3 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv3.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c3 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv3.setEnabled(false);
    }

    public void box4(View view) {
        if(count > 0){
            if(flag == 0){
                iv4.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c4 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv4.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c4 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv4.setEnabled(false);
    }

    public void box5(View view) {
        if(count > 0){
            if(flag == 0){
                iv5.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c5 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv5.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c5 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv5.setEnabled(false);
    }

    public void box6(View view) {
        if(count > 0){
            if(flag == 0){
                iv6.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c6 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv6.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c6 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv6.setEnabled(false);
    }

    public void box7(View view) {
        if(count > 0){
            if(flag == 0){
                iv7.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c7 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv7.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c7 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv7.setEnabled(false);
    }

    public void box8(View view) {
        if(count > 0){
            if(flag == 0){
                iv8.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c8 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv8.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c8 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv8.setEnabled(false);
    }

    public void box9(View view) {
        if(count > 0){
            if(flag == 0){
                iv9.setImageResource(R.drawable.o);
                count --;
                flag = 1;
                c9 = 0;
                ll2.setBackgroundResource(R.drawable.gradient2);
                ll1.setBackgroundResource(0);
                ll2.setElevation(10);
                checking(view);
            }
            else if(flag == 1) {
                iv9.setImageResource(R.drawable.x);
                count --;
                flag = 0;
                c9 = 1;
                ll1.setBackgroundResource(R.drawable.gradient1);
                ll2.setBackgroundResource(0);
                ll1.setElevation(10);
                checking(view);
            }
        }
        iv9.setEnabled(false);
    }

    public void checking(View view){
        if(c1 == 0 && c2 == 0 && c3 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c4 == 0 && c5 == 0 && c6 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c7 == 0 && c8 == 0 && c9 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c1 == 0 && c4 == 0 && c7 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c2 == 0 && c5 == 0 && c8 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c3 == 0 && c6 == 0 && c9 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c1 == 0 && c5 == 0 && c9 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }
        else if(c3 == 0 && c5 == 0 && c7 == 0){
            Toast.makeText(getApplicationContext(),"PLAYER-01 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.green);
        }


        else if(c1 == 1 && c2 == 1 && c3 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c4 == 1 && c5 == 1 && c6 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c7 == 1 && c8 == 1 && c9 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c1 == 1 && c4 == 1 && c7 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c2 == 1 && c5 == 1 && c8 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c3 == 1 && c6 == 1 && c9 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c1 == 1 && c5 == 1 && c9 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }
        else if(c3 == 1 && c5 == 1 && c7 == 1){
            Toast.makeText(getApplicationContext(),"PLAYER-02 WON 🎉🎉",Toast.LENGTH_LONG).show();
            ll0.setBackgroundResource(R.drawable.pink);
        }

        else if(count == 0){
            Toast.makeText(getApplicationContext(),"Draw Match",Toast.LENGTH_LONG).show();
        }
    }

    public void newgame(View view) {
        count = 9;

        c1 = 2;
        c2 = 2;
        c3 = 2;
        c4 = 2;
        c5 = 2;
        c6 = 2;
        c7 = 2;
        c8 = 2;
        c9 = 2;

        iv1.setImageResource(0);
        iv2.setImageResource(0);
        iv3.setImageResource(0);
        iv4.setImageResource(0);
        iv5.setImageResource(0);
        iv6.setImageResource(0);
        iv7.setImageResource(0);
        iv8.setImageResource(0);
        iv9.setImageResource(0);

        flag = 0;

        iv1.setEnabled(true);
        iv2.setEnabled(true);
        iv3.setEnabled(true);
        iv4.setEnabled(true);
        iv5.setEnabled(true);
        iv6.setEnabled(true);
        iv7.setEnabled(true);
        iv8.setEnabled(true);
        iv9.setEnabled(true);

        ll1.setBackgroundResource(R.drawable.gradient1);
        ll2.setBackgroundResource(0);
        ll1.setElevation(10);
        ll0.setBackgroundColor(Color.parseColor("#000000"));
    }
}