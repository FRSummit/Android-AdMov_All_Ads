package com.example.admobdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import static android.content.ContentValues.TAG;

public class RewardedAdLoad extends Activity {
    private RewardedAd rewardedAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewarded_ad_load);

        loadAd();
    }

    public void rewardedLoadBtnClick(View view) {
        loadAd();
    }

    public void rewardedShowBtnClick(View view) {
        showAd();
    }

    public void loadAd() {
        this.rewardedAd = new RewardedAd(this, "ca-app-pub-3940256099942544/5224354917");
        RewardedAdLoadCallback callback = new RewardedAdLoadCallback(){
            @Override
            public void onRewardedAdFailedToLoad(int i) {
                super.onRewardedAdFailedToLoad(i);
                Log.i(TAG, "onRewardedAdFailedToLoad");
            }

            @Override
            public void onRewardedAdLoaded() {
                super.onRewardedAdLoaded();
                Log.i(TAG, "onRewardedAdLoad");
            }
        };
        this.rewardedAd.loadAd(new AdRequest.Builder().build(), callback);
    }

    public void showAd() {
        if(this.rewardedAd.isLoaded()) {
            RewardedAdCallback callback = new RewardedAdCallback() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    Log.i(TAG, "onUserEarnedReward");
                    Toast.makeText(getApplicationContext(), "onUserEarnedReward", Toast.LENGTH_LONG).show();
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n\n\n" + "Rewarded " + rewardItem);
                    System.out.println("Type : " + (rewardItem.getType()));
                    System.out.println("Amount : " + (rewardItem.getAmount()));
                    System.out.println("Class : " + (rewardItem.getClass()));
                }

                @Override
                public void onRewardedAdOpened() {
                    super.onRewardedAdOpened();
                    Log.i(TAG, "onRewardedAdOpened");
                    Toast.makeText(getApplicationContext(), "onRewardedAdOpened", Toast.LENGTH_LONG).show();
                }

                @Override
                public void onRewardedAdClosed() {
                    super.onRewardedAdClosed();
                    Log.i(TAG, "onRewardedAdClosed");
                    Toast.makeText(getApplicationContext(), "onRewardedAdClosed", Toast.LENGTH_LONG).show();
                    loadAd();   // load ad again after close ad
                }

                @Override
                public void onRewardedAdFailedToShow(int i) {
                    super.onRewardedAdFailedToShow(i);
                    Log.i(TAG, "onRewardedAdFailedToShow");
                    Toast.makeText(getApplicationContext(), "onRewardedAdFailedToShow", Toast.LENGTH_LONG).show();
                }
            };
            this.rewardedAd.show(this, callback);
        } else {
            Log.i(TAG, "Ad is not loaded");
            Toast.makeText(getApplicationContext(), "Ad is not loaded", Toast.LENGTH_LONG).show();
        }
    }

    public void goToBanner(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goToInter(View view) {
        Intent intent = new Intent(this, InterstitialAdLoad.class);
        startActivity(intent);
    }

    public void goToNative(View view) {
        Intent intent = new Intent(this, NativeAdLoad.class);
        startActivity(intent);
    }
}
