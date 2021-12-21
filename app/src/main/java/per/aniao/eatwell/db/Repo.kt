package per.aniao.eatwell.db

import per.aniao.eatwell.bean.FoodType
import javax.inject.Inject

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
class Repo @Inject constructor(
    private val foodDao: FoodDao
) {
    suspend fun getCurrentFood() = foodDao.getAll()
    suspend fun getCurrentFoodByType(type: FoodType) = foodDao.getByType(type)
    suspend fun addFood(f:Food) = foodDao.addFood(f)
    suspend fun deleteFood(f: Food) = foodDao.deleteFood(f)
}