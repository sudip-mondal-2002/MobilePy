package com.sudip.pythoninterpretor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;

public class MainActivity extends AppCompatActivity {
    TextView stdout;
    EditText stdin;
    EditText code;
    ImageView run;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stdout = (TextView) findViewById(R.id.stdout);
        stdout.setMovementMethod(new ScrollingMovementMethod());
        code = (EditText) findViewById(R.id.code);
        stdin = (EditText) findViewById(R.id.stdin);
        run = (ImageView) findViewById(R.id.run);
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Python py = Python.getInstance();
                PyObject pyObject = py.getModule("myScript");
                PyObject obj = pyObject.callAttr("main", code.getText().toString(), stdin.getText().toString());
                stdout.setText(obj.toString());
            }
        });
    }
}