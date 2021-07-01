package com.sudip.pythoninterpretor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView stdout = (TextView) findViewById(R.id.stdout);
    EditText stdin = (EditText) findViewById(R.id.stdin);
    EditText code = (EditText) findViewById(R.id.code);
    ImageView run = (ImageView) findViewById(R.id.run);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}