package com.example.fmi.courseproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        this.getSupportActionBar().setTitle("Categories");
        RelativeLayout tech = (RelativeLayout) findViewById(R.id.techCategory);
        final Context context = this;
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent articles = new Intent(context,ArticlesActivity.class);
                context.startActivity(articles);
            }
        });

    }
}
