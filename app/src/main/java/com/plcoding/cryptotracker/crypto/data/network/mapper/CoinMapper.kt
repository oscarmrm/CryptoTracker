package com.plcoding.cryptotracker.crypto.data.network.mapper

import com.plcoding.cryptotracker.crypto.data.network.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hrs = changePercent24Hr
    )
}