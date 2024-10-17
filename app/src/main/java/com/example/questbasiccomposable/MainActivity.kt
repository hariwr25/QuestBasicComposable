package com.example.questbasiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Top,
    modifier = Modifier
        .fillMaxSize()
        .padding(50.dp)
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
            color = Color.Gray
        )
    )
    Image(
        painter = painterResource(id = R.drawable.logo_umy),
        contentDescription = "Logo UMY",
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(250.dp)
    )

    Spacer(modifier = Modifier.height(16.dp))

    Text(
        text = "Nama",
        style = TextStyle(
            fontSize = 20.sp,
            color = Color.Black
        )
    )

    Text(
        text = "Hari Wahyu Ramadhan",
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
    )

    Text(
        text = "20210140031",
        style = TextStyle(
            fontSize = 28.sp,
            color = Color.Black
        )
    )

    Image(
        painter = painterResource(id = R.drawable.foto),
        contentDescription = "Profil",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp))
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