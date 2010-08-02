package com.WebApp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebApp extends Activity {
	/** Called when the activity is first created. */
	private final String GOOGLE = "http://www.google.co.in";
	// private final String URL = "http://www.yahoo.com";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		WebView webView = (WebView) findViewById(R.id.wv1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setVerticalScrollBarEnabled(true);
		//webView.loadUrl("http://www.yahoo.com");
		webView.loadUrl(GOOGLE);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// String myAlternativeURL = "http://www.yahoo.com";
				// if (!url.equals(myAlternativeURL)) {
				// view.loadUrl(myAlternativeURL);
				// return true;
				// }
				return false;

			}
		});
	}
}