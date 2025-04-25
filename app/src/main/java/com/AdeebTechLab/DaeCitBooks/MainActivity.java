package com.AdeebTechLab.DaeCitBooks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b4, b5, b6, b7, b8, b9, b10, b11, b12;


        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1v0LuLqIBBi8oVwU8wTDHdWfUtBwQ5EF4/view?usp=sharing";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1iaGxMndsVqh5JYQ2tR-jdY-04vaRSlka/view?usp=sharing";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/10hm4xqf5eUfwKGwELMt0MtjX2b8arvk1/view?usp=sharing";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/dae-cit-books/bookstore?Category=1st+Year";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/dae-cit-books/bookstore?Category=2nd+Year";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/dae-cit-books/bookstore?Category=3rd+Year";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.facebook.com/DAECIT";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/channel/UCA2EsdQyPDmjaqlmPzrDF-w";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.GCT.BWP.College";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url", url);
                startActivity(i);
            }
        });



        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Objectives();

            }
        });
    }



    public void Objectives(){
        Intent intent = new Intent(this, Objectives.class);
        startActivity(intent);




        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Syllabus();

            }
        });
    }
    public void Syllabus(){
        Intent intent = new Intent(this, Syllabus.class);
        startActivity(intent);






        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Techers();

            }
        });
    }
    public void Techers(){
        Intent intent = new Intent(this, Techers.class);
        startActivity(intent);



    }
}

