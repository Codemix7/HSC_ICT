package com.codemix.hsc_ict;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class startearning extends AppCompatActivity {
    private Button details;
    private Button onlineexam;
    private Button register;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_startearning);
        setTitle("ঘরে বসে আয় করুন");

        Button button = (Button) findViewById(R.id.onlineexam);
        this.onlineexam = button;
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                startearning.this.startActivity(new Intent(startearning.this, exam.class));
            }
        });
        Button button2 = (Button) findViewById(R.id.register);
        this.register = button2;
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                startearning.this.startActivity(new Intent(startearning.this, registration.class));
            }
        });
        Button button3 = (Button) findViewById(R.id.details);
        this.register = button3;
        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                startearning.this.startActivity(new Intent(startearning.this, Course.class));
            }
        });
    }


}
