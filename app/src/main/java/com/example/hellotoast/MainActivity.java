package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.hellotoast.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);


    }
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void nextActivity(View view)
    {
        Toast toast = Toast.makeText(this,"Hello!",Toast.LENGTH_SHORT);
        toast.show();

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        String count = Integer.toString(mCount);
        intent.putExtra(EXTRA_MESSAGE, count);
    }
}