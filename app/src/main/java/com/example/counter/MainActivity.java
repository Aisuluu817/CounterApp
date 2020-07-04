package com.example.counter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int counter;
    TextView current;
    Button count, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = (Button) findViewById(R.id.count);
        reset = (Button) findViewById(R.id.reset);
        current = findViewById(R.id.current);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter");
        }
        current.setText(String.format("%04d", counter));

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                current.setText(String.format("%04d", counter));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                current.setText(String.format("%04d", counter));
            }
        });

    }

    @Override
    protected void onSaveInstanceState (@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);

    }
}