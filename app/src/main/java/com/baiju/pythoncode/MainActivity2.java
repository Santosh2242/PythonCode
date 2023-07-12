package com.baiju.pythoncode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity2 extends AppCompatActivity {

    WebView webView;
    private AdView mAdView,mAdView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView = findViewById(R.id.webView);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest2);



        int position = getIntent().getIntExtra("story_key",0);
                if(position == 0){
                    webView.loadUrl("file:///android_asset/helloworld.html");
                }else if(position == 1){
                    webView.loadUrl("file:///android_asset/AddtwoNumber.html");
                }else if(position == 2){
                    webView.loadUrl("file:///android_asset/AddthreeNumber.html");
                } else if(position == 3){
                    webView.loadUrl("file:///android_asset/squareroot.html");
                }else if(position == 4){
                    webView.loadUrl("file:///android_asset/areaoftringle.html");
                }else if(position == 5){
                    webView.loadUrl("file:///android_asset/swaptwovarialble.html");
                }else if(position == 6){
                    webView.loadUrl("file:///android_asset/randomnumber.html");
                }else if(position == 7){
                    webView.loadUrl("file:///android_asset/ConvertKmtoMiles.html");
                }else if(position == 8){
                    webView.loadUrl("file:///android_asset/fareheit.html");
                }else if(position == 9){
                    webView.loadUrl("file:///android_asset/positivenegativeNumber.html");
                }else if(position == 10){
                    webView.loadUrl("file:///android_asset/oddoreven.html");
                }else if(position == 11){
                    webView.loadUrl("file:///android_asset/leapyear.html");
                }else if(position == 12){
                    webView.loadUrl("file:///android_asset/calenderdisplay.html");
                }else if(position == 13){
                    webView.loadUrl("file:///android_asset/primeNumber.html");
                }else if(position == 14){
                    webView.loadUrl("file:///android_asset/factorialnumber.html");
                }else if(position == 15){
                    webView.loadUrl("file:///android_asset/multiplicationtable.html");
                }else if(position == 16){
                    webView.loadUrl("file:///android_asset/fibonacciseries.html");
                }else if(position == 17){
                    webView.loadUrl("file:///android_asset/armstrong.html");
                }else if(position == 18){
                    webView.loadUrl("file:///android_asset/sumofnaturalnumber.html");
                }else if(position == 19){
                    webView.loadUrl("file:///android_asset/largestthreenumber.html");
                }else if(position == 20){
                    webView.loadUrl("file:///android_asset/divisblebyanothernumber.html");
                }else if(position == 21){
                    webView.loadUrl("file:///android_asset/deciamlbinaloctualhexadecimal.html");
                }else if(position == 22){
                    webView.loadUrl("file:///android_asset/asciiValue.html");
                }else if(position == 23){
                    webView.loadUrl("file:///android_asset/hcf.html");
                }else if(position == 24){
                    webView.loadUrl("file:///android_asset/LCM.html");
                }



    }
}