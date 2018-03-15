package xh.zero.knownews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class NewsCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_category)
        title = getString(R.string.title_news_category)

    }
}
