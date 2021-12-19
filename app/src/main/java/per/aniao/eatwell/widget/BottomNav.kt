package per.aniao.eatwell.widget

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

/**
 *
 * @author: hmei
 * @date: 2021/12/18
 * @email: huangmei@haohaozhu.com
 *
 */
@Composable
fun BottomNav() {
    val items = listOf(
        BottomNavItem.REFRIGERATOR,
        BottomNavItem.MENU,
        BottomNavItem.SETTING,
    )
    val navController = rememberNavController()
    BottomNavigation() {
        items.forEach {
            BottomNavigationItem(
                icon = { Icon(painter = painterResource(id = it.icon), contentDescription = it.title) },
                selected = false,
                onClick = { /*TODO*/ },
                label = { Text(text = it.title)}
            )
        }
    }
}

@Preview
@Composable
fun BottomNavPreview() {
    BottomNav()
}