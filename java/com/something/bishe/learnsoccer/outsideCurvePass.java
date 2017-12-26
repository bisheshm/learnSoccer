package com.something.bishe.learnsoccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class outsideCurvePass extends AppCompatActivity {

    WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outside_curve_pass);
        setPage();

    }

    private void setPage() {

        myweb = (WebView) findViewById(R.id.outsideCurvePassWeb);
        WebSettings mysetting = myweb.getSettings();
        mysetting.setJavaScriptEnabled(true);
        myweb.loadUrl("https://youtu.be/67LGR4VTgLs");
        myweb.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed(){
        if (myweb.canGoBack())
            myweb.goBack();

        else
            super.onBackPressed();
    }

}
