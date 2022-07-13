package com.hwang.demo.core.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/hwang/demo/core/domain/PreChargeService;", "", "redeemCodeRepository", "Lcom/hwang/demo/db/core/repository/RedeemCodeRepository;", "(Lcom/hwang/demo/db/core/repository/RedeemCodeRepository;)V", "getRedeemCodeRepository", "()Lcom/hwang/demo/db/core/repository/RedeemCodeRepository;", "getCharges", "Lcom/hwang/demo/core/domain/PreChargeResponseDTO;", "preChargeRequestParam", "Lcom/hwang/demo/core/domain/PreChargeRequestParam;", "pre-charge-api"})
@org.springframework.stereotype.Service()
public class PreChargeService {
    @org.jetbrains.annotations.NotNull()
    private final com.hwang.demo.db.core.repository.RedeemCodeRepository redeemCodeRepository = null;
    
    public PreChargeService(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.db.core.repository.RedeemCodeRepository redeemCodeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.hwang.demo.db.core.repository.RedeemCodeRepository getRedeemCodeRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.hwang.demo.core.domain.PreChargeResponseDTO getCharges(@org.jetbrains.annotations.NotNull()
    com.hwang.demo.core.domain.PreChargeRequestParam preChargeRequestParam) {
        return null;
    }
}