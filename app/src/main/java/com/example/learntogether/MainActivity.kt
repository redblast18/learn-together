package com.example.learntogether

import android.os.Bundle
import android.os.Message
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.pm.ShortcutInfoCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    GreetingImage(
                        "JetPack Compose Tutorial",
                        "Jetpack Compose is a modern toolkit for building native Android UI. " +
                                "Compose simplifies and accelerates UI development on Android with less code," +
                                "powerful tools, and intuitive Kotlin APIs.",
                        "In this tutorial, you build a simple UI component with declarative functions. " +
                                "You call Compose functions to say what elements you want and the Compose " +
                                "compiler does the rest. Compose is built around Composable functions. These" +
                                "functions let you define your app\\'s UI programmatically because they let you" +
                                "describe how it should look and provide data dependencies, rather than focus " +
                                "on the process of the UI\\'s construction, such as initializing an element and " +
                                "then attaching it to a parent. To create a Composable function, you add the " +
                                "@Composable annotation to the function name."
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(txtTitle: String, txtText1: String, txtText2: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier,
    ){
        Text(
            text = txtTitle,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = txtText1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = txtText2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun GreetingImage(txtTitle: String, txtText1: String, txtText2: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            //contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        GreetingText(
            txtTitle,
            txtText1,
            txtText2,
            modifier = Modifier
                .padding(horizontal = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun LearnCardPreview() {
    LearnTogetherTheme {
        GreetingImage(
            "JetPack Compose Tutorial",
            "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "Compose simplifies and accelerates UI development on Android with less code," +
                    "powerful tools, and intuitive Kotlin APIs.",
            "In this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say what elements you want and the Compose " +
                    "compiler does the rest. Compose is built around Composable functions. These" +
                    "functions let you define your app\\'s UI programmatically because they let you" +
                    "describe how it should look and provide data dependencies, rather than focus " +
                    "on the process of the UI\\'s construction, such as initializing an element and " +
                    "then attaching it to a parent. To create a Composable function, you add the " +
                    "@Composable annotation to the function name."
        )
    }
}
