package com.hwang.demo.core.support.advice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/hwang/demo/core/support/advice/ApiControllerAdvice;", "", "()V", "logger", "Lorg/slf4j/Logger;", "handleRunTimeException", "Lorg/springframework/http/ResponseEntity;", "Lcom/hwang/demo/core/support/response/ApiResponseDTO;", "e", "Lcom/hwang/demo/core/support/exception/HandleException;", "pre-charge-api"})
@org.springframework.web.bind.annotation.RestControllerAdvice()
public class ApiControllerAdvice {
    private final org.slf4j.Logger logger = null;
    
    public ApiControllerAdvice() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.hwang.demo.core.support.exception.HandleException.class})
    public org.springframework.http.ResponseEntity<com.hwang.demo.core.support.response.ApiResponseDTO<java.lang.Object>> handleRunTimeException(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.core.support.exception.HandleException e) {
        return null;
    }
}