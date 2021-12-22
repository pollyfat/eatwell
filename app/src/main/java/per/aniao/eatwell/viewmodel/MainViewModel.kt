package per.aniao.eatwell.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.subjects.PublishSubject
import kotlinx.coroutines.launch
import per.aniao.eatwell.bean.FoodType
import per.aniao.eatwell.db.Food
import per.aniao.eatwell.db.Repo
import per.aniao.eatwell.widget.BottomNavItem
import javax.inject.Inject

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: Repo
) : ViewModel() {
    val foodList: PublishSubject<HashMap<FoodType, MutableList<Food>>> = PublishSubject.create()
    private val _bottomNavState = mutableStateOf(BottomNavItem.REFRIGERATOR)
    val bottomNavState: State<BottomNavItem>
        get() = _bottomNavState

    fun getCurrentFood(){
    }

    fun getCurrentFoodByType(type: FoodType){
    }

    fun getSortedCurrentFood(){
        val sortedList = HashMap<FoodType, MutableList<Food>>()
        viewModelScope.launch {
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
            foodList.onNext(sortedList)
        }
    }

    fun addFood(food: Food) {
        viewModelScope.launch {
            repo.addFood(food)
        }
    }
}