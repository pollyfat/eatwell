package per.aniao.eatwell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import per.aniao.eatwell.ui.theme.EatwellTheme
import per.aniao.eatwell.viewmodel.FoodViewModel
import per.aniao.eatwell.widget.BottomNav

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val vm: FoodViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EatwellTheme {
                MainView()
            }
        }
    }
}

@Preview
@Composable
fun MainView() {
    Scaffold(
        bottomBar = { BottomNav() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
            ) {
                Image(painter = painterResource(id = R.drawable.basket_plus), contentDescription = "Add")
            }
        }
    ) {

    }
}