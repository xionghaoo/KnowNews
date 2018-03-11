package xh.zero.knownews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_news_detail.*

class NewsDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NEWS_URL = "NewsDetailActivity.extra_news_url"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        val url = intent.getStringExtra(EXTRA_NEWS_URL)

//        web_view.webViewClient = NewsWebClient()

        web_view.loadUrl(url)
    }

//    inner class NewsWebClient : WebViewClient() {
//        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//            if (url!!.contains("")) {
//
//            }
//            return false
//        }
//    }
}
