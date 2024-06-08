package com.example.functionchainingexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.functionchainingexample.ui.theme.FunctionChainingExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FunctionChainingExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Results(innerPadding)
                }
            }
        }
    }
}

@Composable
private fun Results(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding)) {
        val result = MyNumber().add(5).subtract(3).toString()
        Result(resultStr = result)
        val result2 = MyNumber(8).add(5).subtract(3).toString()
        Result(resultStr = result2)
        val result3 = MyNumber(10).add(5).subtract(3).divide(4).multiply(2).toString()
        Result(result3)
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
fun GreetingPreview() {
    FunctionChainingExampleTheme {
        Results(PaddingValues(8.dp))
    }
}