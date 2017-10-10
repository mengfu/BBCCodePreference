package com.jxkj.bbccode.bbccodepreference.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.jxkj.bbccode.bbccodepreference.R;

/**
 * Created by hp on 2017/10/9.
 */

public class WebviewFragment extends Fragment {
    protected View view;
    private WebView webView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_webview,container,false);
        webView=(WebView)view.findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);//设置支持javascript
        webView.loadUrl("https://www.anxiuyun.com/web/article/1cc914c54fb14cf99088da65a54f7a7e");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;//返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
            }
        }

        );
        return view;// super.onCreateView(inflater, container, savedInstanceState);
    }
}
