package com.aydanilozyurek.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int num;
    Runnable runnable;
    Handler handler;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        num=0;
    }

    public void start(View view)  {

        handler = new Handler();

        runnable =new Runnable() {
            @Override
            public void run() {
                textView.setText("Time " + num);
                num ++;
                textView.setText("Time " + num);
                handler.postDelayed(runnable, 1000); // her saniye başı yukardaki işelmi benim için yapm diyorum
            }
        };

            handler.post(runnable);
            button.setEnabled(false); // buton kapanır


        }


    public void stop(View view){
            button.setEnabled(true);
            handler.removeCallbacks(runnable);
            num = 0;
            textView.setText("Time: " + num);
    }
}