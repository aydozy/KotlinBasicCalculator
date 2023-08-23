package com.aydanilozyurek.sqliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            SQLiteDatabase database = this.openOrCreateDatabase("Musicians", MODE_PRIVATE,null); //veri tabanını aç ya da daha önce yoksa oluştur
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY, name VARCHAR,age INTEGER)"); // tablo oluşturma

            //WHERE name LIKE %s gibi bir ifade kullanırsak sonu s ile biltenleri bana getir diyoruz

            // database.execSQL("INSERT INTO musicians (name, age) VALUES ('James', 50)"); //veri kaydetme
            // database.execSQL("INSERT INTO musicians (name, age) VALUES ('Lars', 60)");
            // database.execSQL("INSERT INTO musicians (name, age) VALUES ('Kirk', 55)");
            // database.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Lars'");
            database.execSQL("DELETE FROM musicians WHERE id = 2");

           // Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE id = 2", null); //sorgu yazılıyor selectionArgs filtreleme işlemleri anlamına gelir
            Cursor cursor = database.rawQuery("SELECT * FROM musicians", null);
            // WHERE ile filtreleme yapıyoruz
            int nameIx = cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");
            int idIx = cursor.getColumnIndex("id");
            while(cursor.moveToNext()){
                System.out.println("Name: " + cursor.getString(nameIx));
                System.out.println("Age: " + cursor.getInt(ageIx));
                System.out.println("ID: " + cursor.getInt(idIx));
            }
            cursor.close();


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}