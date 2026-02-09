package com.basiccalculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("On Restart");
    }
}