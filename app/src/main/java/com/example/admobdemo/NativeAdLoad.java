package com.example.admobdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NativeAdLoad extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_ad_load);
    }

    public void loadAdBtnClick(View view) {
    }

    public void showAdBtnClick(View view) {
    }

    public void BannerClickFromNative(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void interstitialClickFromNative(View view) {
        Intent intent = new Intent(this, InterstitialAdLoad.class);
        startActivity(intent);
    }

    public void rewardedClickFromNative(View view) {
        Intent intent = new Intent(this, RewardedAdLoad.class);
        startActivity(intent);
    }
}
