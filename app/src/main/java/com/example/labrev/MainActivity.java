package com.example.labrev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=findViewById(R.id.ok);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ReadingCollectionsActivity.class);
                EditText editText=findViewById(R.id.entername);
                final String name=editText.getText().toString();
                Toast.makeText(getApplicationContext(),"Welcome "+name+"\n"+"Please enter what you read",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });


    }
}