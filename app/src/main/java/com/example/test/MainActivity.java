package com.example.test;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recyclerview.RecyclerViewAdapt;
import com.example.test.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
//    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        dataSet = new ArrayList<>();
//        initDataset();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);
        ArrayList<String> Data = (ArrayList<String>) getIntent().getSerializableExtra("key");

        if(Data != null) {
            adapter = new RecyclerViewAdapt(Data);
            rvView.setAdapter(adapter);
        }

    }

    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), NewTask.class);
        startActivity(i);
    }

//    private void initDataset(){
//
//        /**
//         * Tambahkan item ke dataset
//         * dalam prakteknya bisa bermacam2
//         * tidak hanya String seperti di kasus ini
//         */
//        dataSet.add("Membuat Paper");
//        dataSet.add("Kumpul Himpunan");
//        dataSet.add("Mengerjakan tugas APSI");
//        dataSet.add("Rapat Departemen");
//        dataSet.add("Mengerjakan proposal PKM");
//        dataSet.add("Membuat DFD");
//        dataSet.add("Membaca Chapter 3 Software Engineering");
//        dataSet.add("Mengerjakan tugas Proyek");
//        dataSet.add("Mengerjakan tugas Matematika Diskrit");
//    }
}
