package com.hwang.demo.core.controller.v1;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/hwang/demo/core/controller/v1/PreChargeController;", "", "preChargeService", "Lcom/hwang/demo/core/domain/PreChargeService;", "(Lcom/hwang/demo/core/domain/PreChargeService;)V", "getPreChargeService", "()Lcom/hwang/demo/core/domain/PreChargeService;", "examGet", "Lcom/hwang/demo/core/support/response/ApiResponseDTO;", "Lcom/hwang/demo/core/controller/v1/response/PreChargeResponseDTO;", "preChargeId", "", "examPost", "request", "Lcom/hwang/demo/core/controller/v1/request/PreChargeRequestDTO;", "pre-charge-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1"})
@org.springframework.web.bind.annotation.RestController()
public class PreChargeController {
    @org.jetbrains.annotations.NotNull()
    private final com.hwang.demo.core.domain.PreChargeService preChargeService = null;
    
    public PreChargeController(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.core.domain.PreChargeService preChargeService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.hwang.demo.core.domain.PreChargeService getPreChargeService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/pre-charge"}, consumes = {"application/json"}, produces = {"application/json"})
    public com.hwang.demo.core.support.response.ApiResponseDTO<com.hwang.demo.core.controller.v1.response.PreChargeResponseDTO> examPost(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.hwang.demo.core.controller.v1.request.PreChargeRequestDTO request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/charge/{preChargeId}"})
    public com.hwang.demo.core.support.response.ApiResponseDTO<com.hwang.demo.core.controller.v1.response.PreChargeResponseDTO> examGet(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable()
    java.lang.String preChargeId) {
        return null;
    }
}