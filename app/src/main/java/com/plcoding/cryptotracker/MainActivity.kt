package com.plcoding.cryptotracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.plcoding.cryptotracker.crypto.presentation.CoinListScreen
import com.plcoding.cryptotracker.crypto.presentation.CoinListState
import com.plcoding.cryptotracker.crypto.presentation.composables.previewCoin
import com.plcoding.cryptotracker.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CoinListScreen(
                        state = CoinListState(
                            isLoading = false,
                            coins = listCoins,
                        )
                    )
                }
            }
        }
    }
}

val listCoins = (1..20).map {
    previewCoin
}