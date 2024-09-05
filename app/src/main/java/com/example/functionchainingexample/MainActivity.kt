package com.example.functionchainingexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.functionchainingexample.MyNumber.Companion.MyNumber
import com.example.functionchainingexample.ui.theme.FunctionChainingExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FunctionChainingExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Results(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
private fun Results(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        val result = MyNumber().add(5).subtract(3).toString()
        Result(resultStr = result)
        val result2 = MyNumber(8).add(5).subtract(3).toString()
        Result(resultStr = result2)
        val result3 = MyNumber(10).add(5).subtract(3).divide(4).multiply(2).toString()
        Result(result3)

        val result4 = MyNumber.add(5).subtract(7).toString()
        // Companion object, also used in class Modifier
        Result(result4)
    }
}

@Composable
fun Result(resultStr: String, modifier: Modifier = Modifier) {
    Text(
        text = "Result $resultStr",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ChainingPreview() {
    FunctionChainingExampleTheme {
        Results()
    }
}