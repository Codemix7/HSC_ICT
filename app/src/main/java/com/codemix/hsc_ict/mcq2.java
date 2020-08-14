package com.codemix.hsc_ict;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class mcq2 extends AppCompatActivity implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;

    public void onRewarded(RewardItem rewardItem) {
    }

    public void onRewardedVideoAdClosed() {
    }

    public void onRewardedVideoAdFailedToLoad(int i) {
    }

    public void onRewardedVideoAdLeftApplication() {
    }

    public void onRewardedVideoAdOpened() {
    }

    public void onRewardedVideoCompleted() {
    }

    public void onRewardedVideoStarted() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_mcq2);
        setTitle("এম সি কিউ দ্বিতীয় অধ্যায়");
        MobileAds.initialize((Context) this, "ca-app-pub-7945850134098152~6823121897");
        RewardedVideoAd rewardedVideoAdInstance = MobileAds.getRewardedVideoAdInstance(this);
        this.mRewardedVideoAd = rewardedVideoAdInstance;
        rewardedVideoAdInstance.setRewardedVideoAdListener(this);
        this.mRewardedVideoAd.loadAd("ca-app-pub-7945850134098152/6065763365", new Builder().build());
    }

    public void onRewardedVideoAdLoaded() {
        this.mRewardedVideoAd.show();
    }

    public void onResume() {
        this.mRewardedVideoAd.resume(this);
        super.onResume();
    }

    public void onPause() {
        this.mRewardedVideoAd.pause(this);
        super.onPause();
    }

    public void onDestroy() {
        this.mRewardedVideoAd.destroy(this);
        super.onDestroy();
    }
}
