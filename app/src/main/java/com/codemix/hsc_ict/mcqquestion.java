package com.codemix.hsc_ict;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class mcqquestion extends AppCompatActivity {
    private Button fifth;
    private Button first;
    private Button forth;
    private Button second;
    private Button sixth;
    private Button third;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_mcqquestion);
        setTitle("এম সি কিউ প্রশ্ন ");

        Button button = (Button) findViewById(R.id.first);
        this.first = button;
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mcqquestion.this.startActivity(new Intent(mcqquestion.this, mcq1.class));
            }
        });
        Button button2 = (Button) findViewById(R.id.second);
        this.second = button2;
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mcqquestion.this.startActivity(new Intent(mcqquestion.this, mcq2.class));
            }
        });
        Button button3 = (Button) findViewById(R.id.third);
        this.third = button3;
        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mcqquestion.this.startActivity(new Intent(mcqquestion.this, mcq3.class));
            }
        });
        Button button4 = (Button) findViewById(R.id.forth);
        this.forth = button4;
        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mcqquestion.this.startActivity(new Intent(mcqquestion.this, mcq4.class));
            }
        });
        Button button5 = (Button) findViewById(R.id.fifth);
        this.fifth = button5;
        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mcqquestion.this.startActivity(new Intent(mcqquestion.this, mcq5.class));
            }
        });
        Button button6 = (Button) findViewById(R.id.sixth);
        this.sixth = button6;
        button6.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mcqquestion.this.startActivity(new Intent(mcqquestion.this, mcq6.class));
            }
        });
    }
}
