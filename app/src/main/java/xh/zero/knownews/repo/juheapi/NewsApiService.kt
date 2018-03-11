package xh.zero.knownews.repo.juheapi

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import xh.zero.knownews.repo.juheapi.data.NewsResult

/**
 * Created by Bamboo on 2018/3/10.
 */

interface NewsApiService {
    //type=top&key=4ad9aac48c9b4a83c575e4b65471b466
    @GET("/toutiao/index")
    fun fetchNews(@Query("type") type: String,
                  @Query("key") key: String) : Observable<NewsResult>
}
