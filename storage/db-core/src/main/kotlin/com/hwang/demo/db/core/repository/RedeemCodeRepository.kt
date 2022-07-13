package com.hwang.demo.db.core.repository

import com.hwang.demo.db.core.entity.RedeemCode
import org.springframework.data.jpa.repository.JpaRepository

interface RedeemCodeRepository : JpaRepository<RedeemCode, Long>
