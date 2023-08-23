package com.aydanilozyurek.lansmarkbookjava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.aydanilozyurek.lansmarkbookjava.databinding.ActivityDetailsBinding;
import com.aydanilozyurek.lansmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<LandMark> landMarkArrayList; // ihtiyaç olursa başka methodlardan da ulaşalım diye burada tanımladık ama on create içinde de tanımlayabilirdik
    private ActivityMainBinding binding;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());//inflate, kod ile xml'i bağlamaya çalıştığımız yer
        View view = binding.getRoot();
        setContentView(view);

        landMarkArrayList = new ArrayList<>();

        //Data
        LandMark pisa = new LandMark("Pisa","Italy",R.drawable.pisa);
        LandMark eiffel = new LandMark("Eiffel", "France", R.drawable.eiffel);
        LandMark collesuem = new LandMark("Collesuem", "Italy", R.drawable.collesuem );
        LandMark bridge = new LandMark("London Bridge", "UK", R.drawable.bridge );

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(collesuem);
        landMarkArrayList.add(bridge);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
/*
        //Adapter
         //List View
        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landMarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);//nerden nereye gittiğini gösteriyorsun
                intent.putExtra("landmark", landMarkArrayList.get(position));
                startActivity(intent);

            }
        });*/


    }
}