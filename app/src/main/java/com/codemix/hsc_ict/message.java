package com.codemix.hsc_ict;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;

public class message extends AppCompatActivity {
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    private WebView webView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_message);
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
                message.this.mInterstitialAd.show();
            }

            public void onAdFailedToLoad(int i) {
                Toast.makeText(message.this, "Not load", 1).show();
            }
        });
        setTitle("প্রশিক্ষন আপডেট");
        WebView webView2 = (WebView) findViewById(R.id.webviewid);
        this.webView = webView2;
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.loadUrl("https://forms.gle/CXAv3bF8APzKB2q26");
    }

    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
