package ru.mirea.makhorkin.Lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String value = (String) getIntent().getSerializableExtra("key");

        textView = findViewById(R.id.textView);
        textView.setText(value);
    }
}