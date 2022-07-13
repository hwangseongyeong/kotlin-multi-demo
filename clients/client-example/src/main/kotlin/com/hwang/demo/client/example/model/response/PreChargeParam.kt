package com.hwang.demo.client.example.model.response

import com.hwang.demo.client.example.model.ExampleResult

internal data class PreChargeParam(
    val charge: String
) {
    fun toResult(): com.hwang.demo.client.example.model.ExampleResult {
        return com.hwang.demo.client.example.model.ExampleResult(charge)
    }
}
