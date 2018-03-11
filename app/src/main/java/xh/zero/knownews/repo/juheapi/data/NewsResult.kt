package xh.zero.knownews.repo.juheapi.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Bamboo on 2018/3/10.
 */

class NewsResult {


    @SerializedName("reason")
    var reason: String? = null
    @SerializedName("result")
    var result: Result? = null

    class Result {


        @SerializedName("stat")
        var stat: String? = null
        @SerializedName("data")
        var data: List<Data>? = null

        class Data {

            @SerializedName("uniquekey")
            var uniquekey: String? = null
            @SerializedName("title")
            var title: String? = null
            @SerializedName("date")
            var date: String? = null
            @SerializedName("category")
            var category: String? = null
            @SerializedName("author_name")
            var authorName: String? = null
            @SerializedName("url")
            var url: String? = null
            @SerializedName("thumbnail_pic_s")
            var thumbnailPicS: String? = null
            @SerializedName("thumbnail_pic_s02")
            var thumbnailPicS02: String? = null
            @SerializedName("thumbnail_pic_s03")
            var thumbnailPicS03: String? = null
        }
    }
}
