package com.aydanilozyurek.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // kullanıcıya daha görünür olmadan yapılan işlerin yazıldığı yer
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view){ // görünüm tarafından çağrılacak demek
        // Button button = findViewById(R.id.button); ---> bunu demedik çüngü buttonla ilgili bir şey değişsin istemiyorum
        ImageView imageView = findViewById(R.id.imageView); // R.id ile id'lere erişim sağlanıyor
        imageView.setImageResource(R.drawable.queen2); // image'ıın kaynağı değişsin diye soruyor, diğer resime erişim sağladık
    }
}