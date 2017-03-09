package com.example.cilo.eagleeye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView totalTV = (TextView) findViewById(R.id.total);

        int sum = 5 + 90;

        totalTV.setText(sum);

    }
}
