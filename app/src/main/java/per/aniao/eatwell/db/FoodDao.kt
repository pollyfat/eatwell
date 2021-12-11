package per.aniao.eatwell.db

import androidx.room.Dao
import androidx.room.Query

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
@Dao
interface FoodDao {
    @Query("SELECT * FROM Food")
    fun getAll(): List<Food>
}