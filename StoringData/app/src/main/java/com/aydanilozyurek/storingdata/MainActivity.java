package com.aydanilozyurek.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);

         sharedPreferences = this.getSharedPreferences("com.aydanilozyurek.storingdata", Context.MODE_PRIVATE); // küçük dataları store etmek için kullanıyoruz kullanıcı şifresi gibi
         int storedAge= sharedPreferences.getInt("storedAge", 0); // kullanıcı verisini kaydetmeyi başardık bu sayede kullanıcı uygulamayı bir daha açtığında veri girmesine gerek kalmayacak


         if(storedAge == 0){
             textView.setText(0);
         }else {
         textView.setText("Your Age: " + storedAge);}
    }

    public void saveAge(View view){

        if(!editText.getText().toString().matches("")){ // eğer kullanıcı bana hiçbir şey girmemişse bir işlem yapmama gerek yok
            int userAge = Integer.parseInt(editText.getText().toString());
            textView.setText("Your age: " + userAge);

            sharedPreferences.edit().putInt("storedAge", userAge).apply(); // küçük bir veri tabanında saklama işlemi

        }
    }

    public void delete(View view){
        int storedData = sharedPreferences.getInt("storedAge", 0);
        if(storedData != 0){
            sharedPreferences.edit().remove("storedAge").apply(); // silme işlemi remove ile yapılıyor
            textView.setText("Your age: ");
        }
    }

}