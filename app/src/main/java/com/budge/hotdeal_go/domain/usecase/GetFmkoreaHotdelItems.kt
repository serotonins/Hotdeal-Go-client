package com.budge.hotdeal_go.domain.usecase

import com.budge.hotdeal_go.domain.repository.HotDealRepository
import javax.inject.Inject

class GetFmkoreaHotdelItems @Inject constructor(
    private val hotDealRepository: HotDealRepository
) {
    fun getItems() = hotDealRepository.getHotdealFromFmkorea()
}