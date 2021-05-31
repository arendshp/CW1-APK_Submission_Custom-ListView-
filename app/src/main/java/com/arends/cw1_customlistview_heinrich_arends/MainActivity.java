package com.arends.cw1_customlistview_heinrich_arends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    String[] author = {"Cay Horstmann",
            "Aristeidis Bampakos",
            "Jon Duckett",
            "Jon Duckett",
            "Nate Ebel",
            "Barry Burd",
            "Erich Gamma",
            "Magnus Larsson",
            "Josephine Bush"};
    String[] title = {"Core Java Fundamentals",
            "Learning Angular",
            "JavaScript and JQuery",
            "HTML and CSS",
            "Mastering Kotlin",
            "Android Application Development For Dummies",
            "Design Patterns",
            "Hands-On Microservices with Spring Boot and Spring Cloud",
            "Learn SQL Database Programming"};
    int[] images = {R.drawable.java,
            R.drawable.angular,
            R.drawable.javascript,
            R.drawable.html,
            R.drawable.kotlin,
            R.drawable.android_development,
            R.drawable.design_patterns,
            R.drawable.microservices,
            R.drawable.sql };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listViewItems);
        ProgramAdapter programAdapter = new ProgramAdapter(this, author, images, title);
        mListView.setAdapter(programAdapter);
    }
}