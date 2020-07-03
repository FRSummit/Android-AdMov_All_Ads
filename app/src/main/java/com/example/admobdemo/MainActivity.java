package com.example.admobdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends Activity {
    AdView adView;
    InterstitialAd interstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * For Testing
         *
         * AdRequest adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
         * For Publishing/earning real ads
         *
         * AdRequest adRequest=new AdRequest.Builder(); //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
         *
         * AdRequest adRequest = new AdRequest.Builder()
         *         .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
         *         .addTestDevice("B86BC9402A69B031A516BC57F7D3063F")
         *         .build();
         *
        **/

        /**
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-4861848901455235/1573603101");
        AdRequest.Builder adRequestBuilder = new AdRequest.Builder();
        adRequestBuilder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR);
//        layout.addView(mAdView);
        adView.loadAd(adRequestBuilder.build());
//        setContentView(layout);
        **/

        /*System.out.println("================================================================================");
        System.out.println(AdRequest.DEVICE_ID_EMULATOR);
        System.out.println("================================================================================");*/

        adView = findViewById(R.id.adView);
        MobileAds.initialize(this, "ca-app-pub-4861848901455235~7992147502"); //App Id
        /*System.out.println("================================================================================");
        System.out.println(AdRequest.DEVICE_ID_EMULATOR);
        System.out.println("================================================================================");*/
        /**
         AdRequest adRequest = new AdRequest.Builder().build();
        **/
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB").build();
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB")
                .build();
        /*System.out.println("================================================================================");
        System.out.println(adRequest);
        System.out.println(adView);
        System.out.println("================================================================================");*/
        adView.loadAd(adRequest);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(getApplicationContext(), "Ad is loaded!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(), "Ad failed to load! error code: " + errorCode, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                Toast.makeText(getApplicationContext(), "Ad is opened!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClicked() {
                Toast.makeText(getApplicationContext(), "Ad is clicked!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLeftApplication() {
                Toast.makeText(getApplicationContext(), "Ad left application!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClosed() {
                Toast.makeText(getApplicationContext(), "Ad is closed!", Toast.LENGTH_SHORT).show();
//                adView.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    public void startInterstitialAdActivity(View view) {
        Intent intent = new Intent(this, InterstitialAdLoad.class);
        startActivity(intent);
    }

    public void startNativeAdActivity(View view) {
        Intent intent = new Intent(this, NativeAdLoad.class);
        startActivity(intent);
    }

    public void startRewardedAdActivity(View view) {
        Intent intent = new Intent(this, RewardedAdLoad.class);
        startActivity(intent);
    }
}
