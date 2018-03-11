package xh.zero.knownews.repo.repodata

/**
 * Created by Bamboo on 2018/3/8.
 */
data class News(var itemType: Int,
                var title: String?,
                var url: String?,
                var commentCount: Int?,
                var media: String?,
                var author: String?,
                var newsClass: String?,
                var intro: String?,
                var readTimes: String?,
                var date: String?,
                var imgContentUrl: String?
) {


    constructor(itemType: Int) : this(itemType, null, null,
            null, null, null,
            null, null, null, null, null)
}