package com.hwang.demo.db.core.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/hwang/demo/db/core/entity/RedeemCodePublish;", "Lcom/hwang/demo/db/core/BaseEntity;", "publishCount", "", "expireAt", "Ljava/time/LocalDate;", "price", "reason", "", "(ILjava/time/LocalDate;ILjava/lang/String;)V", "getExpireAt", "()Ljava/time/LocalDate;", "getPrice", "()I", "getPublishCount", "getReason", "()Ljava/lang/String;", "db-core"})
@javax.persistence.Entity()
public class RedeemCodePublish extends com.hwang.demo.db.core.BaseEntity {
    private final int publishCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate expireAt = null;
    private final int price = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason = null;
    
    public RedeemCodePublish(int publishCount, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate expireAt, int price, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        super();
    }
    
    public int getPublishCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.time.LocalDate getExpireAt() {
        return null;
    }
    
    public int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getReason() {
        return null;
    }
}