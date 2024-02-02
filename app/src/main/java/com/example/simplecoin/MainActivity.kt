package com.example.simplecoin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.graphics.drawable.toDrawable
import com.example.simplecoin.ui.theme.MyWhite
import com.example.simplecoin.ui.theme.SimpleCoinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCoinTheme {
                val reshka = painterResource(id = R.drawable.reshka)
                val orel = painterResource(id = R.drawable.orel)
                val pravo = painterResource(id = R.drawable.pravo)
                val levo = painterResource(id = R.drawable.levo)
                
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(MyWhite)
                    ) {
                        Image(
                            painter = reshka,
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                    Button(
                        onClick = 
                    ) {
                        Text(text = "Spin")
                    }
                }
            }
        }
    }
}

