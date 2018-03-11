package xh.zero.knownews.repo.sinaapi.data

import xh.zero.knownews.repo.repodata.News

/**
 * Created by Bamboo on 2018/3/8.
 */

data class NewsCategory(var newsMap: Map<String, List<News>>)
