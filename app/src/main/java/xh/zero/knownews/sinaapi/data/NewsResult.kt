package xh.zero.knownews.sinaapi.data

import com.google.gson.annotations.SerializedName

/**
 * Created by hyperx on 18-3-7.
 */

class NewsResult {

    @SerializedName("status")
    var status: Status? = null
    @SerializedName("req_time")
    var reqTime: Int = 0
    @SerializedName("data")
    var data: List<Data>? = null

    class Status {
        @SerializedName("code")
        var code: Int = 0
        @SerializedName("msg")
        var msg: String? = null
        @SerializedName("total")
        var total: Int = 0
        @SerializedName("end")
        var end: Int = 0
        @SerializedName("topf")
        var topf: Int = 0
        @SerializedName("red_point")
        var redPoint: Int = 0
    }

    class Data {
        @SerializedName("rep_rate")
        var repRate: Double = 0.toDouble()
        @SerializedName("category")
        var category: Category? = null
        @SerializedName("cate_show")
        var cateShow: String? = null      //新闻分类
        @SerializedName("muid")
        var muid: String? = null
        @SerializedName("editLevel")
        var editLevel: Int = 0
        @SerializedName("pid")
        var pid: Int = 0
        @SerializedName("surl")
        var surl: String? = null              //文章链接(wap)
        @SerializedName("short_intro")          //文章介绍
        var shortIntro: String? = null
        @SerializedName("url")
        var url: String? = null             //文章链接(pc)
        @SerializedName("vid")
        var vid: String? = null
        @SerializedName("etype")
        var etype: Int = 0
        @SerializedName("authorId")
        var authorId: String? = null
        @SerializedName("f_docid")
        var fDocid: String? = null
        @SerializedName("thumb")
        var thumb: String? = null
        @SerializedName("contentTag")
        var contentTag: String? = null
        @SerializedName("fp_iid")
        var fpIid: String? = null
        @SerializedName("title")
        var title: String? = null
        @SerializedName("labels")
        var labels: Labels? = null
        @SerializedName("new_commentid")
        var newCommentid: String? = null
        @SerializedName("classes")
        var classes: Classes? = null
        @SerializedName("bthumb")
        var bthumb: String? = null
        @SerializedName("media_id")
        var mediaId: String? = null
        @SerializedName("ltitle")
        var ltitle: String? = null     //大标题
        @SerializedName("mtime")
        var mtime: Int = 0
        @SerializedName("stitle")
        var stitle: String? = null
        @SerializedName("_id")
        var id: String? = null
        @SerializedName("commentid")
        var commentid: String? = null
        @SerializedName("intro")
        var intro: String? = null       //文章介绍，有省略号
        @SerializedName("mintro")
        var mintro: String? = null      //文章介绍
        @SerializedName("mtitle")
        var mtitle: String? = null               //中标题
        @SerializedName("comment_count_show")
        var commentCountShow: Int = 0
        @SerializedName("org_imgCount")
        var orgImgCount: Int = 0
        @SerializedName("comment_count")
        var commentCount: Int = 0           //评论数
        @SerializedName("appType")
        var appType: Int = 0
        @SerializedName("openType")
        var openType: String? = null
        @SerializedName("appProduct")
        var appProduct: String? = null
        @SerializedName("video_id")
        var videoId: String? = null
        @SerializedName("level")
        var level: Int = 0
        @SerializedName("img_count")
        var imgCount: Int = 0
        @SerializedName("ctime")
        var ctime: Int = 0
        @SerializedName("appEtime")
        var appEtime: Int = 0
        @SerializedName("media_level")
        var mediaLevel: Int = 0
        @SerializedName("uuid")
        var uuid: String? = null
        @SerializedName("media_copyright")
        var mediaCopyright: Int = 0
        @SerializedName("media_type")
        var mediaType: Int = 0
        @SerializedName("author")
        var author: String? = null        //作者，和媒体类似
        @SerializedName("appUtime")
        var appUtime: Int = 0
        @SerializedName("docid")
        var docid: String? = null
        @SerializedName("type")
        var type: Int = 0
        @SerializedName("fp")
        var fp: String? = null
        @SerializedName("iid")
        var iid: String? = null
        @SerializedName("media")
        var media: String? = null      //媒体
        @SerializedName("reason")
        var reason: Int = 0
        @SerializedName("bpic")
        var bpic: Int = 0
        @SerializedName("doct")
        var doct: Int = 0
        @SerializedName("abt")
        var abt: String? = null
        @SerializedName("index")
        var index: String? = null
        @SerializedName("is_3pics")
        var is3pics: Int = 0
        @SerializedName("no_bcard")
        var noBcard: Int = 0
        @SerializedName("is_update")
        var isUpdate: Int = 0
        @SerializedName("hotScore")
        var hotScore: Int = 0
        @SerializedName("orgUrl")
        var orgUrl: String? = null
        @SerializedName("preadtime")
        var preadtime: String? = null         //阅读次数
        @SerializedName("img_fp")
        var imgFp: String? = null
        @SerializedName("zt")
        var zt: String? = null
        @SerializedName("pctr")
        var pctr: Int = 0
        @SerializedName("area")
        var area: String? = null
        @SerializedName("ztlevel")
        var ztlevel: Int = 0
        @SerializedName("sub_classes")
        var subClasses: SubClasses? = null
        @SerializedName("pcProduct")
        var pcProduct: Long = 0
        @SerializedName("title_fp")
        var titleFp: String? = null
        @SerializedName("modifier")
        var modifier: String? = null
        @SerializedName("mt_iid")
        var mtIid: String? = null
        @SerializedName("mt_date")
        var mtDate: String? = null
        @SerializedName("stype")
        var stype: Int = 0
        @SerializedName("mthumbs")
        var mthumbs: List<String>? = null
        @SerializedName("new_labels_show")
        var newLabelsShow: List<NewLabelsShow>? = null
        @SerializedName("stocks")
        var stocks: List<*>? = null
        @SerializedName("labels_show")
        var labelsShow: List<*>? = null
        @SerializedName("new_subclass_show")
        var newSubclassShow: List<NewSubclassShow>? = null
        @SerializedName("thumbs")
        var thumbs: List<String>? = null
        @SerializedName("new_topic_show")
        var newTopicShow: List<NewTopicShow>? = null
        @SerializedName("card")
        var card: List<*>? = null

        class Category

        class Labels

        class Classes {
            @SerializedName("时政")
            var 时政: Double = 0.toDouble()
        }

        class SubClasses {
            @SerializedName("法制")
            var 法制: Double = 0.toDouble()
        }

        class NewLabelsShow {
            @SerializedName("text")
            var text: String? = null
            @SerializedName("id")
            var id: String? = null
        }

        class NewSubclassShow {
            @SerializedName("text")
            var text: String? = null
            @SerializedName("id")
            var id: String? = null
        }

        class NewTopicShow {
            @SerializedName("text")
            var text: String? = null
            @SerializedName("id")
            var id: String? = null
        }
    }
}
