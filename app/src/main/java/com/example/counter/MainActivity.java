package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter = 0;
    TextView current ;
    public void Count(View view) {
       current = findViewById(R.id.current);
        counter++;
        current.setText(String.format("%04d", counter));

    }
    public void Reset(View view) {
        current = findViewById(R.id.current);
        counter = 0;
        current.setText(String.format("%04d", counter));
    }
}