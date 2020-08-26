package com.example.labrev;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddReading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reading);

        TextView lblauthor=findViewById(R.id.lblAuthor);
        TextView lbltitle=findViewById(R.id.lblTitle);

        Button view =findViewById(R.id.View);

        Intent intent=getIntent();
        int takeExtra=intent.getIntExtra("choice",1);

        if(takeExtra==1){



           lblauthor.setText("Author: ");
           lbltitle.setText("Book Title: ");

            Fragment fragment1=new BookFragment();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment,fragment1);
            ft.commit();

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    EditText title=findViewById(R.id.txtTitle);
                    final String t=title.getText().toString();
                    EditText author=findViewById(R.id.txtAuthor);
                    final String a=author.getText().toString();

                    AlertDialog alertDialog;
                    AlertDialog.Builder builder=new AlertDialog.Builder(AddReading.this);
                    builder.setTitle("Your Reading!");

                builder.setMessage(t +" by " +a);
                    builder.setPositiveButton("OK",null);
                    alertDialog=builder.create();
                    alertDialog.show();

                }
            });


        }else if(takeExtra==2){



            lblauthor.setText("Editor: ");
            lbltitle.setText("Title of the Article: ");

            Fragment fragment2=new PaperFragment();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment,fragment2);
            ft.commit();

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    EditText title=findViewById(R.id.txtTitle);
                    final String t=title.getText().toString();
                    EditText author=findViewById(R.id.txtAuthor);
                    final String a=author.getText().toString();

                    AlertDialog alertDialog;
                    AlertDialog.Builder builder=new AlertDialog.Builder(AddReading.this);
                    builder.setTitle("Your Reading!");

                    builder.setMessage(t +" by " +a);
                    builder.setPositiveButton("OK",null);
                    alertDialog=builder.create();
                    alertDialog.show();

                }
            });

        }




    }
}