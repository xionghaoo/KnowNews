package xh.zero.knownews.sinaapi

import io.reactivex.Observable
import retrofit2.Retrofit
import xh.zero.knownews.sinaapi.data.NewsResult
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import javax.xml.datatype.DatatypeConstants.SECONDS
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit


/**
 * Created by hyperx on 18-3-7.
 */
class NewsApiRequest : NewsApiService{
    companion object {
        val HOST_SINA = "https://cre.dp.sina.cn/"
    }

    private lateinit var apiService: NewsApiService

    init {
        apiService = getRetrofit(HOST_SINA).create(NewsApiService::class.java)
    }

    override fun fetchNews(cateid: String,
                           cre: String,
                           mod: String,
                           merge: String,
                           statics: String,
                           length: String,
                           tm: String,
                           action: String,
                           up: String,
                           down: String,
                           none: String,
                           callback: String): Observable<NewsResult> {
        return apiService.fetchNews(cateid, cre, mod, merge, statics, length, tm, action, up, down, none, callback)
    }

    fun getRetrofit(url: String): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}