package com.hwang.demo.db.core.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/hwang/demo/db/core/entity/RedeemCode;", "Lcom/hwang/demo/db/core/BaseEntity;", "redeemCodePublish", "Lcom/hwang/demo/db/core/entity/RedeemCodePublish;", "redeemCode", "", "status", "Lcom/hwang/demo/common/domain/RedeemCodeStatusType;", "(Lcom/hwang/demo/db/core/entity/RedeemCodePublish;Ljava/lang/String;Lcom/hwang/demo/common/domain/RedeemCodeStatusType;)V", "getRedeemCode", "()Ljava/lang/String;", "getRedeemCodePublish", "()Lcom/hwang/demo/db/core/entity/RedeemCodePublish;", "getStatus", "()Lcom/hwang/demo/common/domain/RedeemCodeStatusType;", "setStatus", "(Lcom/hwang/demo/common/domain/RedeemCodeStatusType;)V", "db-core"})
@javax.persistence.Entity()
public class RedeemCode extends com.hwang.demo.db.core.BaseEntity {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    @javax.persistence.PrimaryKeyJoinColumn()
    private final com.hwang.demo.db.core.entity.RedeemCodePublish redeemCodePublish = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String redeemCode = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private com.hwang.demo.common.domain.RedeemCodeStatusType status;
    
    public RedeemCode(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.db.core.entity.RedeemCodePublish redeemCodePublish, @org.jetbrains.annotations.NotNull()
    java.lang.String redeemCode, @org.jetbrains.annotations.NotNull()
    com.hwang.demo.common.domain.RedeemCodeStatusType status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.hwang.demo.db.core.entity.RedeemCodePublish getRedeemCodePublish() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getRedeemCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.hwang.demo.common.domain.RedeemCodeStatusType getStatus() {
        return null;
    }
    
    public void setStatus(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.common.domain.RedeemCodeStatusType p0) {
    }
}