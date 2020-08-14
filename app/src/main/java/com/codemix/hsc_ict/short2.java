package com.codemix.hsc_ict;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;

public class short2 extends AppCompatActivity {
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_short2);
        setTitle("সংক্ষিপ্ত প্রশ্ন দ্বিতীয় অধ্যায়");
        InterstitialAd interstitialAd = new InterstitialAd(this);
        this.mInterstitialAd = interstitialAd;
        interstitialAd.setAdUnitId("ca-app-pub-7945850134098152/2509661738");
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
                short2.this.mInterstitialAd.show();
            }

            public void onAdFailedToLoad(int i) {
                Toast.makeText(short2.this, "Not load", 1).show();
            }
        });
    }
}
