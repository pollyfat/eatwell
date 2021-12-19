package per.aniao.eatwell.widget

import per.aniao.eatwell.R

/**
 *
 * @author: hmei
 * @date: 2021/12/18
 * @email: huangmei@haohaozhu.com
 *
 */
sealed class BottomNavItem(var route: String, var icon: Int, var title: String){
    object REFRIGERATOR:BottomNavItem("refrigerator", R.drawable.fridge, "冰箱")
    object MENU:BottomNavItem("menu_list", R.drawable.clipboard_list, "菜谱")
    object SETTING:BottomNavItem("setting", R.drawable.account_cog, "设置")
}
