package per.aniao.eatwell.widget

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

/**
 *
 * @author: hmei
 * @date: 2021/12/18
 * @email: huangmei@haohaozhu.com
 *
 */
@Composable
fun BottomNav(navController: NavController) {
    val items = listOf(
        BottomNavItem.REFRIGERATOR,
        BottomNavItem.MENU,
        BottomNavItem.SETTING,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation() {
        items.forEach {
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = it.icon),
                        contentDescription = it.title
                    )
                },
                selected = currentRoute == it.route,
                onClick = {
                    navController.navigate(it.route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                label = { Text(text = it.title) }
            )
        }
    }
}

@Preview
@Composable
fun BottomNavPreview() {
}