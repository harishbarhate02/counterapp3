package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mcount = 0;
    Button toast;
    Button increment;
    Button reset;
    Button decremenet;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.button_toast);
        reset = findViewById(R.id.button_reset);
        increment = findViewById(R.id.button_increment);
        decremenet = findViewById(R.id.button_decrement);
        mTextView = findViewById(R.id.show_count);

    }

    public void showToast(View view) {
        Toast.makeText(this, "created by harish", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mcount++;
        mTextView.setText(Integer.toString(mcount));
    }

    @SuppressLint("SetTextI18n")
    public void count_reset(View view) {
        mcount = 0;
        mTextView.setText(Integer.toString(mcount));
    }

    @SuppressLint("SetTextI18n")
    public void countdown(View view) {
        mcount--;
        mTextView.setText(Integer.toString(mcount));
    }
}