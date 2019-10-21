package vmax.com.sumuhurtham.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import vmax.com.sumuhurtham.R;

public class WebView_Activity extends AppCompatActivity {

    private String web_data,value;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_);


        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView_Activity.this.finish();
            }
        });

        TextView txt_web_page = findViewById(R.id.txt_web_page);
        webView =findViewById(R.id.web_view_page);

        web_data = getIntent().getStringExtra("web_img");
        value = getIntent().getStringExtra("value");
        Log.e("msg",""+web_data);


        if(value.equals("img"))
        {
            String html = "<html><head></head><body> <img src=\""+ web_data + "\" > </body></html>";
            webView.loadDataWithBaseURL("", html, "text/html", "UTF-8", "");
            //This the the enabling of the zoom controls
            webView.getSettings().setBuiltInZoomControls(true);
            //This will zoom out the WebView
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.setInitialScale(120);

        }else {

            startWebView(web_data);

        }



    }

    private void startWebView(String url)
    {
        //Create new webview Client to show progress dialog
        //When opening a url or click on link

        webView.setWebViewClient(new WebViewClient() {
            ProgressDialog progressDialog;

            //If you will not use this method url links are opeen in new brower not in webview
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            //Show loader on url load
            public void onLoadResource (WebView view, String url) {
                if (progressDialog == null) {
                    // in standard case YourActivity.this
                    progressDialog = new ProgressDialog(WebView_Activity.this);
                    progressDialog.setMessage("Loading...");
                    progressDialog.show();
                }
            }
            public void onPageFinished(WebView view, String url) {
                try{
                    //if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        //progressDialog = null;
                    //}
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }

        });

        // Javascript inabled on webview
        webView.getSettings().setJavaScriptEnabled(true);
        //Load url in webview
        webView.loadUrl(url);
    }

    @Override
    // Detect when the back button is pressed
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}
