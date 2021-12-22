package per.aniao.eatwell.widget

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 *
 * @author: hmei
 * @date: 2021/12/22
 * @email: huangmei@haohaozhu.com
 *
 */
@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.REFRIGERATOR.route) {
        composable(BottomNavItem.REFRIGERATOR.route) {
            FoodList()
        }
        composable(BottomNavItem.MENU.route) {
            MenuContent()
        }
        composable(BottomNavItem.SETTING.route) {
            SettingContent()
        }
    }
}