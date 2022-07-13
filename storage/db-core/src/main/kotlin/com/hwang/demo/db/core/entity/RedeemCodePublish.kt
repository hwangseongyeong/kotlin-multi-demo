package com.hwang.demo.db.core.entity

import com.hwang.demo.db.core.BaseEntity
import java.time.LocalDate
import javax.persistence.Entity

@Entity
class RedeemCodePublish(

    val publishCount: Int,

    val expireAt: LocalDate,

    val price: Int,

    val reason: String

) : BaseEntity()
