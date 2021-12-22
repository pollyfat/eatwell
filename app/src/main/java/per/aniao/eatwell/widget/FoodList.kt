package per.aniao.eatwell.widget

import android.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import per.aniao.eatwell.bean.FoodType
import per.aniao.eatwell.db.Food
import per.aniao.eatwell.viewmodel.MainViewModel

/**
 *
 * @author: hmei
 * @date: 2021/12/18
 * @email: huangmei@haohaozhu.com
 *
 */
@Composable
fun FoodList(/*foods: Map<FoodType, List<Food>>*/) {
    val foods = HashMap<FoodType, List<Food>>().apply {
        put(FoodType.Vegetable, mutableListOf<Food>().apply {
            add(
                Food(0, FoodType.Vegetable, "蘑菇")
            )
        })
    }
    foods.forEach { (type, foods) ->
        Column {
            Text(text = type.name)
            LazyColumn {
                items(foods) { food ->
                    Row() {
                        Text(text = food.name, Modifier.padding(end = 20.dp))
                        Text(text = food.createDate.toString())
                    }

                }
            }
        }
    }
}

//@Preview()
//@Composable
//fun FoodListPreview() {
//    FoodList(foods = HashMap<FoodType, List<Food>>().apply {
//        put(FoodType.Vegetable, mutableListOf<Food>().apply {
//            add(
//                Food(0, FoodType.Vegetable, "蘑菇")
//            )
//        })
//    })
//}