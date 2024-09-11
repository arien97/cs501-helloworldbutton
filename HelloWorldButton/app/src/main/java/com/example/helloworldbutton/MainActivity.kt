package com.example.helloworldbutton

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldbutton.ui.theme.HelloWorldButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HWButton()
        }
    }
}

@Composable
fun HWButton() {
    var num = remember { mutableIntStateOf(0) }

    Button(modifier = Modifier.padding(all = 100.dp),
        onClick = {
            num.intValue += 1

        }) {
        Text(text = "Click Me")

    }

    if (num.intValue % 2 == 1) {
        Column(modifier = Modifier.padding(horizontal = 120.dp, vertical = 160.dp)) {
            Text(
                text = "Hello World!"

            )
        }

    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HWButton()
}