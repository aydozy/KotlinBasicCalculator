package com.aydanilozyurek.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String userName;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);

        userName = "";
    }

    public void changeActivity(View view){

        userName = editText.getText().toString();

        // diğer aktiviteye gitmek için kullandığımız obje Intent
        Intent intent = new Intent(MainActivity.this, MainActivity2.class); // başlanılan yer, gidilmek istenen yer

        intent.putExtra("userInput", userName); // kullanıcıdan aldıktan sonra ikinci aktiviteye yolluyor


        startActivity(intent);

        // intentler kullanılarak bilgi aktarımı yapılabilir



    }
}