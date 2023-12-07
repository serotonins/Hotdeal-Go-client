package com.budge.hotdeal_go.domain.repository

import com.budge.hotdeal_go.data.model.HotDealItem

interface HotDealRepository {
    fun getHotdealFromFmkorea(): List<HotDealItem>
}