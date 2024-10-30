package com.plcoding.cryptotracker.crypto.presentation

import androidx.compose.runtime.Immutable

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)