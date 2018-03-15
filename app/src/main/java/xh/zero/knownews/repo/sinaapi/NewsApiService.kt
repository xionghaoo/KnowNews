package xh.zero.knownews.repo.sinaapi

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import xh.zero.knownews.repo.sinaapi.data.NewsResult
import xh.zero.knownews.repo.sinaapi.data.TopNewsResult

/**
 * Created by hyperx on 18-3-7.
 */
interface NewsApiService {
    //api/v3/get?cateid=1o&cre=tianyi&mod=wnews&merge=3&statics=1&length=20&tm=1489716199&action=0&up=0&down=0&length=18&_=1520428423714&callback=Zepto1520428423565
//    @GET("api/v3/get")
//    fun fetchNews(@Query("cateid") cateid: String,   //1o_1q国际新闻 1o_1r社会新闻 1o_1t综合新闻 1o_1p国内新闻
//                  //tianyi
//                  @Query("cre") cre: String,
//                  //wnews
//                  @Query("mod") mod: String,
//                  //3
//                  @Query("merge") merge: String,
//                  //1
//                  @Query("statics") statics: String,
//                  //20
//                  @Query("length") length: String,
//                  //1489716199
//                  @Query("tm") tm: String,
//                  //0
//                  @Query("action") action: String,
//                  //0
//                  @Query("up") up: String,
//                  //0
//                  @Query("down") down: String,
//                  //1520428423714
//                  @Query("_") none: String)
//            : Observable<NewsResult>

    //军事
    //https://cre.dp.sina.cn/api/v3/get?cateid=F&cre=tianyi&mod=wmil&merge=3&statics=1&tm=1489716199&action=0&up=0&down=0&length=18&_=1520489710406&callback=Zepto1520489710370

    //社会
    //http://cre.dp.sina.cn/api/v3/get?cateid=1o_1r&cre=tianyi&mod=wsociety&merge=3&statics=1&action=0&up=0&down=0&length=18&_=1520489896361&callback=Zepto1520489896320

    //http://interface.sina.cn/news/feed_top_news.d.json?&page=
    @GET("/news/feed_top_news.d.json")
    fun fetchTopNews(@Query("page") page: String) : Observable<TopNewsResult>



}