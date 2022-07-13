package com.hwang.demo.client.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/hwang/demo/client/example/ExampleApi;", "", "exampleapi", "Lcom/hwang/demo/client/example/model/response/PreChargeParam;", "request", "Lcom/hwang/demo/client/example/model/request/ExampleRequest;", "client-example"})
@org.springframework.cloud.openfeign.FeignClient(value = "example-api", url = "${example.api.url}")
public abstract interface ExampleApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestMapping(method = {org.springframework.web.bind.annotation.RequestMethod.POST}, value = {"/example/example-api"}, consumes = {"application/json"})
    public abstract com.hwang.demo.client.example.model.response.PreChargeParam exampleapi(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.hwang.demo.client.example.model.request.ExampleRequest request);
}