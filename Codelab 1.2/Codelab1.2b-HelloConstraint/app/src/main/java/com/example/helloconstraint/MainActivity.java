package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mshowCount;
    private Button button, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount = (TextView) findViewById(R.id.show_count);
        button = findViewById(R.id.button_count);
        button1 = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void CountUp(View view) {
        mCount++;
        button1.setBackgroundColor(getResources().getColor(R.color.teal_200));
        if (mshowCount != null) {
            mshowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0) {
            button.setBackgroundColor(getResources().getColor(R.color.purple_200));
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.teal_700));
        }
    }

    public void ChangeBackground(View view) {
               mshowCount.setText("0");
               mCount = 0;
               button1.setBackgroundColor(getResources().getColor(R.color.gray));
    }
}