package per.aniao.eatwell.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import per.aniao.eatwell.bean.FoodType
import per.aniao.eatwell.db.Food
import per.aniao.eatwell.db.Repo
import javax.inject.Inject

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */

@HiltViewModel
class FoodViewModel @Inject constructor(
    private val repo: Repo
) : ViewModel() {
    suspend fun getCurrentFood(): List<Food> {
        return repo.getCurrentFood()
    }

    suspend fun getCurrentFoodByType(type: FoodType): List<Food> {
        return repo.getCurrentFoodByType(type)
    }

    suspend fun getSortedCurrentFood(): Map<FoodType, List<Food>> {
        val sortedList = HashMap<FoodType, MutableList<Food>>()
        repo.getCurrentFood().forEach {
            var list = sortedList[it.type]
            if (list == null) {
                list = mutableListOf()
                list.add(it)
                sortedList[it.type] = list
            } else {
                list.add(it)
            }
        }
        return sortedList
    }

    suspend fun addFood(food: Food) {
        repo.addFood(food)
    }
}