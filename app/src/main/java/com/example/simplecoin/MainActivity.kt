package com.example.simplecoin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplecoin.ui.theme.MyGrayWhite
import com.example.simplecoin.ui.theme.MyWhite
import com.example.simplecoin.ui.theme.SimpleCoinTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCoinTheme {

                val reshka = painterResource(id = R.drawable.reshka)
                val orel = painterResource(id = R.drawable.orel)
                val pravo = painterResource(id = R.drawable.pravo)
                val levo = painterResource(id = R.drawable.levo)
                val currentIndex = remember { mutableStateOf(0) }
                val images = listOf(reshka, pravo, orel, levo)

                @Composable
                fun SpinTheThing() {
                    LaunchedEffect(currentIndex.value) {
                        while (true) {
                            delay(500)
                            currentIndex.value = (currentIndex.value + 1) % images.size
                        }
                    }
                }

                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(MyWhite)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = currentIndex.value),
                                contentDescription = "",
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                            Button(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(160.dp),
                                colors = ButtonDefaults.buttonColors(MyGrayWhite),
                                onClick = {
                                    SpinTheThing()
                                }
                            ) {
                                Text(
                                    text = "Spin",
                                    fontSize = 80.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = MyWhite
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

