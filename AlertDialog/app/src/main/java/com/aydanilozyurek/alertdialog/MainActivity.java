package com.aydanilozyurek.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // context
    // app context  getApplicationContext kullanmalısın
    // activity context mainactivity.this kullanmalısın

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show(); // programda gösterilen mini mesajlar
    }                      // sadece this de kullanabilirsin burada

    public void save(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("save");
        alert.setMessage("Are you sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // dinleyici ara yüzler gibi düşünülebilir
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show(); // programda gösterilen mini mesajlar
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show(); // programda gösterilen mini mesajlar
            }                         // getApplicationcontext de kullanabilirsin
        });

        alert.show(); // alert mesajlarına show() yazmayı unutma
    }
}