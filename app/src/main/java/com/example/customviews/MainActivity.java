package com.example.customviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.customviews.Views.CustomViews;

public class MainActivity extends AppCompatActivity {

    private CustomViews customViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customViews = (CustomViews) findViewById(R.id.customView);

    }
}
