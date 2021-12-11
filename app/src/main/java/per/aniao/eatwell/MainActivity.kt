package per.aniao.eatwell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Create
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import per.aniao.eatwell.ui.theme.EatwellTheme
import per.aniao.eatwell.ui.theme.Purple200
import per.aniao.eatwell.viewmodel.FoodViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val vm: FoodViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EatwellTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BottomAppBar(backgroundColor = Purple200) {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Outlined.Create, "Create")
                        }
                    }
                }
            }
        }

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EatwellTheme {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colors.background
//        ) {
        BottomAppBar(backgroundColor = Purple200) {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Outlined.Create, "Create")
            }
        }
//        }
    }
}