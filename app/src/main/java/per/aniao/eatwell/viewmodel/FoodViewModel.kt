package per.aniao.eatwell.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
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
}