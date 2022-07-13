package com.hwang.demo.client.example

import com.hwang.demo.client.example.model.ExampleResult
import com.hwang.demo.client.example.model.request.ExampleRequest
import org.springframework.stereotype.Component

@Component
class ExampleClient internal constructor(
    private val exampleProperty: ExampleProperty,
    private val exampleApi: ExampleApi
) {
    fun examplecall(
        example: String
    ): ExampleResult {
        val request = ExampleRequest(
            exampleapi = "${exampleProperty.exampleValue}-api"
        )
        return exampleApi.exampleapi(request).toResult()
    }
}
