package xh.zero.knownews

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text
import xh.zero.knownews.sinaapi.data.News

/**
 * Created by Bamboo on 2018/3/8.
 */
class TopNewsListAdapter(private val mNews: List<News>) : RecyclerView.Adapter<TopNewsListAdapter.TopNewsViewHolder>() {

    override fun onBindViewHolder(holder: TopNewsViewHolder, position: Int) {
        holder.bind(mNews[position])
    }

    override fun getItemCount(): Int {
        return mNews.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopNewsViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.top_news_list_item, parent, false)
        return TopNewsViewHolder(view)
    }

    inner class TopNewsViewHolder(private val itemV: View) : RecyclerView.ViewHolder(itemV) {

        fun bind(news: News) {
            itemV.findViewById<TextView>(R.id.news_title).text = news.title
            itemV.findViewById<TextView>(R.id.news_media).text = news.media
            itemV.findViewById<TextView>(R.id.news_type).text = news.author
            itemV.findViewById<TextView>(R.id.news_intro).text = news.intro
        }
    }
}