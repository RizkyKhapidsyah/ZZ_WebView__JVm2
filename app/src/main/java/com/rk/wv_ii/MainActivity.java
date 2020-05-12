package com.rk.wv_ii;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView WV_WebView_IDJAVA;
    WebSettings X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WV_WebView_IDJAVA = findViewById(R.id.WV_WebView_IDXML);

        WV_WebView_IDJAVA.setWebViewClient(new WebViewClient());
        WV_WebView_IDJAVA.loadUrl("https://rikymetalist.blogspot.com");

        X = WV_WebView_IDJAVA.getSettings();
        X.setJavaScriptEnabled(true);
    }

}
