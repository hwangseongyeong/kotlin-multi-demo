package com.hwang.demo.core.support.error

data class ErrorDTO(
    val code: String,
    val message: String,
    val data: Any?
)
