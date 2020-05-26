package com.test.swiperecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kevin.crop.view.UCropView;

public class MainActivity extends AppCompatActivity {
    
    UCropView ucropView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
