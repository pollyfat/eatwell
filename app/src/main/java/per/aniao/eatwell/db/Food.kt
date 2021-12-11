package per.aniao.eatwell.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import per.aniao.eatwell.bean.FoodType
import java.util.*

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
@Entity
data class Food(
    @PrimaryKey val fId:Int,
    @ColumnInfo val type:FoodType,
    @ColumnInfo val name: String = "",
    @ColumnInfo val weigh: Float = 0f,
    @ColumnInfo val bestBeforeDate: Int = 0,
    @ColumnInfo val createDate: Date = Date(),
    @ColumnInfo val measureWord: String = "g",
)
