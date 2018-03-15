package xh.zero.knownews

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Bamboo on 2018/3/11.
 */
class NewsUtil {
    companion object {
        //2018-03-04 12:50:00
        val dateParser: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA)
        val dateFormat: SimpleDateFormat = SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.CHINA)

        fun dateFormat(date: String) : String {
            return dateFormat.format(dateParser.parse(date))
        }
    }
}