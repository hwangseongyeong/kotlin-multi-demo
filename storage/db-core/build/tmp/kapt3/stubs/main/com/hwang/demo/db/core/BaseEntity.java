package com.hwang.demo.db.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR*\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/hwang/demo/db/core/BaseEntity;", "", "()V", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "<set-?>", "updatedAt", "getUpdatedAt", "setUpdatedAt", "(Ljava/time/LocalDateTime;)V", "db-core"})
@javax.persistence.MappedSuperclass()
public abstract class BaseEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "created_at", updatable = false)
    @org.hibernate.annotations.CreationTimestamp()
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "updated_at")
    @org.hibernate.annotations.UpdateTimestamp()
    private java.time.LocalDateTime updatedAt;
    
    public BaseEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
    
    protected void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0) {
    }
}