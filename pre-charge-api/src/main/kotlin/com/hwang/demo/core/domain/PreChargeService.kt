package com.hwang.demo.core.domain

import com.hwang.demo.db.core.repository.RedeemCodeRepository
import org.springframework.stereotype.Service

@Service
class PreChargeService(
    val redeemCodeRepository: RedeemCodeRepository
) {
    fun getCharges(preChargeRequestParam: PreChargeRequestParam): PreChargeResponseDTO {
        val result = redeemCodeRepository.findAll()
        return PreChargeResponseDTO(result.toString())
    }
}
