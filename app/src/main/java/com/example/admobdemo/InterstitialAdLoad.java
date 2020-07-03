package com.example.admobdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialAdLoad extends Activity {
    private InterstitialAd mInterstitialAd,mInterstitialVideoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial_add_load);

        Button button = (Button) findViewById(R.id.interBtn);
        /*button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });*/

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialVideoAd = new InterstitialAd(this);

        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712"); // Interstitial
        mInterstitialVideoAd.setAdUnitId("ca-app-pub-3940256099942544/8691691433"); // Interstitial Video

        AdRequest request = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(request);
        mInterstitialVideoAd.loadAd(request);

        adEvent();
    }

    public void interBtnClick(View view) {
        if(mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Toast.makeText(this, "The interstitial wasn't loaded yet.", Toast.LENGTH_LONG).show();
        }
    }

    public void interVideoBtnClick(View view) {
        if(mInterstitialVideoAd.isLoaded()) {
            mInterstitialVideoAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Toast.makeText(this, "The interstitial wasn't loaded yet.", Toast.LENGTH_LONG).show();
        }
    }

    public void adEvent() {
        // ADD EVENTS
        // To further customize the behavior of your ad, you can hook onto a number of events in the ad's lifecycle: loading, opening, closing, and so on. You can listen for these events through the AdListener class.
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(getApplicationContext(), "Ad is loaded", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(), "Ad failed to load", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdOpened() {
                Toast.makeText(getApplicationContext(), "Ad is opened", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdClicked() {
                Toast.makeText(getApplicationContext(), "Ad is clicked", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdLeftApplication() {
                Toast.makeText(getApplicationContext(), "Ad left application", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdClosed() {
                Toast.makeText(getApplicationContext(), "Ad is closed", Toast.LENGTH_LONG).show();
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


        mInterstitialVideoAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(getApplicationContext(), "Ad is loaded", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(), "Ad failed to load", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdOpened() {
                Toast.makeText(getApplicationContext(), "Ad is opened", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdClicked() {
                Toast.makeText(getApplicationContext(), "Ad is clicked", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdLeftApplication() {
                Toast.makeText(getApplicationContext(), "Ad left application", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdClosed() {
                Toast.makeText(getApplicationContext(), "Ad is closed", Toast.LENGTH_LONG).show();
                mInterstitialVideoAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void startBannerAdActivityfromInterstitial(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startNativeAdActivityfromInterstitial(View view) {
        Intent intent = new Intent(this, NativeAdLoad.class);
        startActivity(intent);

    }

    public void startRewardedAdActivityfromInterstitial(View view) {
        Intent intent = new Intent(this, RewardedAdLoad.class);
        startActivity(intent);

    }
}
