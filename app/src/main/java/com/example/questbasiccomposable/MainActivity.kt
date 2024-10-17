package com.example.questbasiccomposable

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable.ui.theme.QuestBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposableTheme {
               LoginScreen()
                }
            }
        }
    }


@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
Column(

) {
    Text(
        text = "Login",
        style = TextStyle(
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    )
    Text(
        text = "Ini adalah halaman login",
        style = TextStyle(
            fontSize = 16.sp,
        )
    )
}
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    QuestBasicComposableTheme {
        LoginScreen()
    }
}