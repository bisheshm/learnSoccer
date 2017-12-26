package com.something.bishe.learnsoccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class passingDrill4 extends AppCompatActivity {

    WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_drill4);
        setPage();

    }

    private void setPage() {

        myweb = (WebView) findViewById(R.id.passingDrill4Web);
        WebSettings mysetting = myweb.getSettings();
        mysetting.setJavaScriptEnabled(true);
        myweb.loadUrl("https://youtu.be/Bu7q__wqDkA");
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