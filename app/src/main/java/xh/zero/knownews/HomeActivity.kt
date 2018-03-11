package xh.zero.knownews

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.MenuItem
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.content_home.*
import xh.zero.knownews.repo.juheapi.NewsApiRequest
import xh.zero.knownews.repo.juheapi.data.NewsResult
//import xh.zero.knownews.repo.sinaapi.NewsApiRequest
import xh.zero.knownews.repo.repodata.News
//import xh.zero.knownews.repo.sinaapi.data.NewsResult


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        top_news_list.layoutManager = LinearLayoutManager(this)


        //测试leancloud
//        val testObject = AVObject("TestObject")
//        testObject.put("words", "Hello World!")
//        testObject.saveInBackground(object : SaveCallback() {
//            override fun done(e: AVException?) {
//                Log.d("saved", "err: " + e?.localizedMessage)
//                if (e == null) {
//                    Log.d("saved", "success!")
//                }
//            }
//        })

//        Log.d("test", "time = " + System.currentTimeMillis())

//        val request = NewsApiRequest()
//        request.fetchNews("1o", "tianyi", "wnews", "3",
//                "1", "18", "1489716199",
//                "0", "0", "0", "" + System.currentTimeMillis())
//                .flatMap({ result: NewsResult? ->
//                    Observable.fromIterable(result?.data)
//                })
//                .flatMap({data: NewsResult.Data? ->
//                    val news = News(0,
//                            data?.ltitle,
//                            data?.surl,
//                            data?.commentCount,
//                            data?.media,
//                            data?.author,
//                            "top",
//                            data?.intro,
//                            data?.preadtime)
//                    Observable.just(news)
//                })
//                .toList()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe({newsList: List<News>? ->
//                    Log.d("test", "result: " + newsList?.size)
//                    top_news_list.adapter = TopNewsListAdapter(newsList!!)
//                }, {t: Throwable? ->
//                    Log.d("test", "error: " + t?.localizedMessage)
//                })
        
        NewsApiRequest().fetchNews("top")
                .flatMap { result ->
                    Observable.fromIterable(result.result?.data)
                }
                .flatMap { data ->
                    val news = News(TopNewsListAdapter.ITEM_TYPE_GENERAL_NEWS, data.title, data.url, 0,
                            data.authorName, data.category, "top", data.title,
                            "0", data.date, data.thumbnailPicS)
                    Observable.just(news)
                }
                .toList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({newsList: MutableList<News>? ->
                    newsList?.add(0, News(TopNewsListAdapter.ITEM_TYPE_RECOMMEND))
                    top_news_list.adapter = TopNewsListAdapter(this@HomeActivity, newsList!!, object : TopNewsListAdapter.Callback {
                        override fun showNewsDetail(pos: Int, news: News) {
                            val intent = Intent(this@HomeActivity, NewsDetailActivity::class.java)
                            intent.putExtra(NewsDetailActivity.EXTRA_NEWS_URL, news.url)
                            startActivity(intent)
                        }
                    })
                }, {t: Throwable? ->
                    Log.d("test", "error: " + t?.localizedMessage)
                })
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.home, menu)
//        return true
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        when (item.itemId) {
//            R.id.action_settings -> return true
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
