package per.aniao.eatwell.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
@Database(entities = [Food::class], version = 1)
abstract class MyDB : RoomDatabase() {
    abstract fun foodDao(): FoodDao
}