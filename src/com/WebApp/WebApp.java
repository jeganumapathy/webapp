package com.WebApp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebApp extends Activity {
	/** Called when the activity is first created. */
	private final String GOOGLE = "http://www.google.co.in";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		WebView webView = (WebView) findViewById(R.id.wv1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setVerticalScrollBarEnabled(true);
		webView.loadUrl(GOOGLE);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				 String myAlternativeURL = "http://www.google.co.in";
				 if (!url.equals(myAlternativeURL)) {
				 view.loadUrl(myAlternativeURL);
				 }
				return true;

			}
		});
	}
}