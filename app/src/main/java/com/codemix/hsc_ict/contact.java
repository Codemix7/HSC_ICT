package com.codemix.hsc_ict;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;

public class contact extends AppCompatActivity {
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_contact);
        setTitle("সাপোর্ট সেন্টারে স্বাগতম");
        InterstitialAd interstitialAd = new InterstitialAd(this);
        this.mInterstitialAd = interstitialAd;
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        this.mInterstitialAd.loadAd(new Builder().build());
        this.mInterstitialAd.setAdListener(new AdListener() {
            public void onAdClicked() {
            }

            public void onAdClosed() {
            }

            public void onAdLeftApplication() {
            }

            public void onAdOpened() {
            }

            public void onAdLoaded() {
                contact.this.mInterstitialAd.show();
            }

            public void onAdFailedToLoad(int i) {
                Toast.makeText(contact.this, "Not load", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
