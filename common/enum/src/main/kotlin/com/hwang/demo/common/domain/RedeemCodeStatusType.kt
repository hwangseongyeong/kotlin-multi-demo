package com.hwang.demo.common.domain

enum class RedeemCodeStatusType(
    val description: String
) {
    PUBLISH("발행"),
    GIVE("지급"),
    CONVERT("전환"),
    GIVE_EXPIRE("지급만료"),
    CONVERT_EXPIRE("전환만료")
}
