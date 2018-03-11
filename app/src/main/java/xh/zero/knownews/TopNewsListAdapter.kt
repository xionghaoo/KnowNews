package xh.zero.knownews

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import xh.zero.knownews.repo.repodata.News

/**
 * Created by Bamboo on 2018/3/8.
 */
class TopNewsListAdapter(private val mContext: Context, private val mNews: List<News>, private val mCallback: Callback)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)) {
            ITEM_TYPE_RECOMMEND -> {
                val h = holder as RecommendNewsViewHolder

            }
            ITEM_TYPE_GENERAL_NEWS -> {
                val h = holder as TopNewsViewHolder
                h.bind(mNews[position])
                h.itemView.setOnClickListener { _ ->
                    mCallback.showNewsDetail(position, mNews[position])
                }
            }
        }

    }

    override fun getItemCount(): Int {
        return mNews.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            ITEM_TYPE_RECOMMEND -> {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.news_recommend_item, parent, false)
                return RecommendNewsViewHolder(view)
            }
            ITEM_TYPE_GENERAL_NEWS -> {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.top_news_list_item, parent, false)
                return TopNewsViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.top_news_list_item, parent, false)
                return TopNewsViewHolder(view)
            }
        }
    }

    override fun getItemViewType(position: Int): Int = mNews[position].itemType

    companion object {
        const val ITEM_TYPE_RECOMMEND = 0
        const val ITEM_TYPE_GENERAL_NEWS = 1
    }

    inner class TopNewsViewHolder(private val itemV: View) : RecyclerView.ViewHolder(itemV) {

        fun bind(news: News) {
            itemV.findViewById<TextView>(R.id.news_title).text = news.title
            itemV.findViewById<TextView>(R.id.news_media).text = news.media
            itemV.findViewById<TextView>(R.id.news_type).text = news.author
            itemV.findViewById<TextView>(R.id.news_intro).text = news.intro
            itemV.findViewById<TextView>(R.id.news_time).text = NewsUtil.dateFormat(news.date!!)

            val imgContent = itemV.findViewById<ImageView>(R.id.img_content)

            Glide.with(mContext)
                    .load(news.imgContentUrl)
                    .into(imgContent)
        }
    }

    inner class RecommendNewsViewHolder(private val itemV: View) : RecyclerView.ViewHolder(itemV) {

    }

    interface Callback {
        fun showNewsDetail(pos: Int, news: News)
    }
}