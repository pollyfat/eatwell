package per.aniao.eatwell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import per.aniao.eatwell.ui.theme.EatwellTheme
import per.aniao.eatwell.viewmodel.MainViewModel
import per.aniao.eatwell.widget.BottomNav
import per.aniao.eatwell.widget.BottomNavItem
import per.aniao.eatwell.widget.NavGraph

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val vm: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EatwellTheme {
                MainScreenView()
            }
        }
    }
}
@Preview
@Composable
fun MainScreenView(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNav(navController = navController)
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
            ) {
                Icon(
                    tint = Color.White,
                    painter = painterResource(id = R.drawable.basket_plus),
                    contentDescription = "Add"
                )
            }
        },
    ) {
//        NavGraph(navController = navController)
    }
}
