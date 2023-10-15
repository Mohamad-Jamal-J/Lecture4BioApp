package com.example.lecture4bioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView label;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = findViewById(R.id.result);
        edit = findViewById(R.id.editText);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(action->{
            if (label!=null && edit!=null && !edit.getText().toString().isEmpty())
                label.setText(edit.getText());
            else
                System.out.println("damn");
            label.setVisibility(View.VISIBLE);

        });
    }

}