package per.aniao.eatwell.bean

import java.util.*

/**
 *
 * @author: hmei
 * @date: 2021/11/27
 * @email: huangmei@haohaozhu.com
 *
 */
abstract class Food {
    val name: String = ""
    val bestBeforeDate: Int = 0
    val type: FoodType = FoodType.Vegetable
    val createDate: Date = Date()
    val weigh: Float = 0f
    val measureWord: String = "g"
}