package xh.zero.knownews.sinaapi

import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.GET
import xh.zero.knownews.sinaapi.data.NewsResult

/**
 * Created by hyperx on 18-3-7.
 */
interface NewsApiService {
    //api/v3/get?cateid=1o&cre=tianyi&mod=wnews&merge=3&statics=1&length=20&tm=1489716199&action=0&up=0&down=0&length=18&_=1520428423714&callback=Zepto1520428423565
    @GET("api/v3/get")
    fun fetchNews(@Field("cateid") cateid: String,
                  //tianyi
                  @Field("cre") cre: String,
                  //wnews
                  @Field("mod") mod: String,
                  //3
                  @Field("merge") merge: String,
                  //1
                  @Field("statics") statics: String,
                  //20
                  @Field("length") length: String,
                  //1489716199
                  @Field("tm") tm: String,
                  //0
                  @Field("action") action: String,
                  //0
                  @Field("up") up: String,
                  //0
                  @Field("down") down: String,
                  //1520428423714
                  @Field("_") none: String,
                  //Zepto1520428423565
                  @Field("callback") callback: String)
            : Observable<NewsResult>
}