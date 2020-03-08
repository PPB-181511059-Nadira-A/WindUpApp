package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class NewTask  extends AppCompatActivity {

    ArrayList<String> dataSet = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtask);
        Bundle extras = getIntent().getExtras();
    }

    public void CallMainActivity (View V) {
        EditText newtask = (EditText) findViewById(R.id.newtask);
        String task = newtask.getText().toString();
//        ArrayList<String> dataSet = (ArrayList<String>) getIntent().getSerializableExtra("dataSet");
        dataSet.add(task);
        Intent intent = new Intent(NewTask.this, MainActivity.class);
        intent.putExtra("key", dataSet);
        startActivity(intent);

    }
}
