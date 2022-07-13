package com.hwang.demo.core.support.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/hwang/demo/core/support/response/ApiResponseDTO;", "T", "", "result", "Lcom/hwang/demo/core/support/response/ResultType;", "data", "error", "Lcom/hwang/demo/core/support/error/ErrorDTO;", "(Lcom/hwang/demo/core/support/response/ResultType;Ljava/lang/Object;Lcom/hwang/demo/core/support/error/ErrorDTO;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/hwang/demo/core/support/error/ErrorDTO;", "getResult", "()Lcom/hwang/demo/core/support/response/ResultType;", "component1", "component2", "component3", "copy", "(Lcom/hwang/demo/core/support/response/ResultType;Ljava/lang/Object;Lcom/hwang/demo/core/support/error/ErrorDTO;)Lcom/hwang/demo/core/support/response/ApiResponseDTO;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "pre-charge-api"})
public final class ApiResponseDTO<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.hwang.demo.core.support.response.ResultType result = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hwang.demo.core.support.error.ErrorDTO error = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.hwang.demo.core.support.response.ApiResponseDTO.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.hwang.demo.core.support.response.ApiResponseDTO<T> copy(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.core.support.response.ResultType result, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.hwang.demo.core.support.error.ErrorDTO error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ApiResponseDTO(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.core.support.response.ResultType result, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.hwang.demo.core.support.error.ErrorDTO error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hwang.demo.core.support.response.ResultType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hwang.demo.core.support.response.ResultType getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hwang.demo.core.support.error.ErrorDTO component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hwang.demo.core.support.error.ErrorDTO getError() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0003\u001a\u00020\u0006J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/hwang/demo/core/support/response/ApiResponseDTO$Companion;", "", "()V", "error", "Lcom/hwang/demo/core/support/response/ApiResponseDTO;", "T", "Lcom/hwang/demo/core/support/error/ErrorType;", "errorData", "success", "result", "(Ljava/lang/Object;)Lcom/hwang/demo/core/support/response/ApiResponseDTO;", "pre-charge-api"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.hwang.demo.core.support.response.ApiResponseDTO<T> success() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.hwang.demo.core.support.response.ApiResponseDTO<T> success(T result) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.hwang.demo.core.support.response.ApiResponseDTO<T> error(@org.jetbrains.annotations.NotNull()
        com.hwang.demo.core.support.error.ErrorType error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.hwang.demo.core.support.response.ApiResponseDTO<T> error(@org.jetbrains.annotations.NotNull()
        com.hwang.demo.core.support.error.ErrorType error, @org.jetbrains.annotations.NotNull()
        java.lang.Object errorData) {
            return null;
        }
    }
}