package per.aniao.eatwell.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import per.aniao.eatwell.bean.FoodType

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

    @Query("SELECT * FROM Food WHERE type IN (:type)")
    fun getByType(type:FoodType): List<Food>

    @Insert
    fun addFood(food: Food)

    @Delete
    fun deleteFood(food: Food)
}