package xh.zero.knownews.repo.sinaapi.data;

/**
 * Created by G1494458 on 2018/3/15.
 */

public class TEST {
    //新闻类型
    //最新新闻
    /**
     * 最新新闻
     */
    public static final int TOP_NEWS = 0;
    private static final String TOP_URL = "http://interface.sina.cn/news/feed_top_news.d.json?&page=";

    //国际新闻
    /**
     * 国外新闻
     */
    public static final int EXTERNAL_NEWS = 1;
    private static final String EXTERNAL_URL = "http://interface.sina.cn/wap_api/layout_col.d.json?col=56262&level=1%2C2&show_num=25&page=";

    //国内新闻
    /**
     * 国内新闻
     */
    public static final int INTERNAL_NEWS = 2;
    private static final String INTERNAL_URL = "http://interface.sina.cn/wap_api/layout_col.d.json?col=56261&level=1%2C2&show_num=25&page=";

    //社会新闻
    /**
     * 社会新闻
     */
    public static final int SOCIAL_NEWS = 3;
    private static final String SOCIAL_URL = "http://interface.sina.cn/wap_api/layout_col.d.json?col=56264&level=1&show_num=25&page=";

    //军事新闻
    /**
     * 军事新闻
     */
    public static final int MILITARY_NEWS = 4;
    private static final String MILITARY_URL = "http://interface.sina.cn/ent/feed.d.json?ch=mil&col=mil&page=";

}
