package xh.zero.knownews.repo.juheapi

import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import xh.zero.knownews.repo.juheapi.data.NewsResult
import java.util.concurrent.TimeUnit

/**
 * Created by Bamboo on 2018/3/10.
 */
class NewsApiRequest {

    companion object {
        val NEWS_HOST = "http://v.juhe.cn"
        val REQUET_KEY = "4ad9aac48c9b4a83c575e4b65471b466"
    }

    private var apiService: NewsApiService

    init {
        apiService = getRetrofit(NEWS_HOST).create(NewsApiService::class.java)
    }

    fun fetchNews(type: String): Observable<NewsResult> = apiService.fetchNews(type, REQUET_KEY)

    private fun getRetrofit(url: String): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
//                .addInterceptor({chain: Interceptor.Chain? ->
//                    val response = chain?.proceed(chain.request())
//                    val body = response?.body()?.string()
//
//                    return@addInterceptor response
//                })
                .build()
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}