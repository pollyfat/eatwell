package per.aniao.eatwell.db

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
}