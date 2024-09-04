package com.example.viikko2_in00ct07_3007

import android.content.res.Resources.Theme
import android.os.Bundle
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.viikko2_in00ct07_3007.ui.theme.Viikko2IN00CT073007Theme
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import com.example.viikko2_in00ct07_3007.ui.theme.Viikko2IN00CT073007Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Viikko2IN00CT073007Theme {
              Surface(
                  modifier = Modifier.fillMaxSize(),

              ){
                BmiCalculator(

                )
              }
            }
        }
    }
}
@Composable
fun BmiCalculator() {
    var heightinput: String by remember { mutableStateOf("") }

    Column{
        Text(
        text = "BMI Calculator",
        fontSize = 24.sp,
        color = Color.Black,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 16.dp)
        )
        OutlinedTextField(
            value=heightinput,
            onValueChange = {heightinput = it.replace(',', '.')},
            label = { Text("Height (cm)") },

            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Viikko2IN00CT073007Theme {
        BmiCalculator()
    }
}
