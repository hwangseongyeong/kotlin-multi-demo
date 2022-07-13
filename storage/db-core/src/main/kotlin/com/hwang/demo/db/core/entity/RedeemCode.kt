package com.hwang.demo.db.core.entity

import com.hwang.demo.common.domain.RedeemCodeStatusType
import com.hwang.demo.db.core.BaseEntity
import javax.persistence.*

@Entity
class RedeemCode(

    @PrimaryKeyJoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    val redeemCodePublish: RedeemCodePublish,

    val redeemCode: String,

    @Enumerated(EnumType.STRING)
    var status: RedeemCodeStatusType

) : BaseEntity()
