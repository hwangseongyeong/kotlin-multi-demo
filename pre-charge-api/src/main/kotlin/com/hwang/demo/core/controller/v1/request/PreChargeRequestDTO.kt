package com.hwang.demo.core.controller.v1.request

import com.hwang.demo.core.domain.PreChargeRequestParam

data class PreChargeRequestDTO(
    val message: String
) {
    fun toParam(): PreChargeRequestParam {
        return PreChargeRequestParam(message)
    }
}
