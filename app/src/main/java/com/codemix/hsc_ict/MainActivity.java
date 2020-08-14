package com.codemix.hsc_ict;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static int Timeout = 2000;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.finish();
                MainActivity.this.startActivity(new Intent(MainActivity.this, welcome.class));
            }
        }, (long) Timeout);
    }
}
