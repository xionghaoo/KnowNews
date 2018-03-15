package xh.zero.knownews.repo.sinaapi.data

import com.google.gson.annotations.SerializedName

/**
 * Created by G1494458 on 2018/3/15.
 */

class TopNewsResult {

    @SerializedName("status")
    var status: Int = 0
    @SerializedName("message")
    var message: String? = null
    @SerializedName("count")
    var count: Int = 0
    @SerializedName("data")
    var data: List<Data>? = null

    class Data {
        @SerializedName("news_date")
        var newsDate: String? = null
        @SerializedName("date")
        var date: String? = null
        @SerializedName("title")
        var title: String? = null
        @SerializedName("wap_title")
        var wapTitle: String? = null
        @SerializedName("img")
        var img: String? = null
        @SerializedName("type")
        var type: String? = null
        @SerializedName("pics")
        var pics: Pics? = null
        @SerializedName("link")
        var link: String? = null
        @SerializedName("comment_id")
        var commentId: String? = null
        @SerializedName("commentid")
        var commentid: String? = null
        @SerializedName("source")
        var source: String? = null
        @SerializedName("intro")
        var intro: String? = null
        @SerializedName("mediaTypes")
        var mediaTypes: String? = null
        @SerializedName("isSubject")
        var isSubject: Int = 0
        @SerializedName("isDujia")
        var isDujia: Int = 0
        @SerializedName("newsType")
        var newsType: String? = null
        @SerializedName("docID")
        var docID: String? = null
        @SerializedName("newsTag")
        var newsTag: String? = null
        @SerializedName("comment")
        var comment: Int = 0

        class Pics {
            @SerializedName("total")
            var total: Int = 0
        }
    }
}
