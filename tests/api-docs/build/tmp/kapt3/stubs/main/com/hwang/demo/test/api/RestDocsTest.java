package com.hwang.demo.test.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/hwang/demo/test/api/RestDocsTest;", "", "()V", "restDocumentation", "Lorg/springframework/restdocs/RestDocumentationContextProvider;", "webApplicationContext", "Lorg/springframework/web/context/WebApplicationContext;", "createMockMvc", "Lorg/springframework/test/web/servlet/MockMvc;", "given", "Lio/restassured/module/mockmvc/specification/MockMvcRequestSpecification;", "mockMvc", "setUp", "", "api-docs"})
@org.junit.jupiter.api.extension.ExtendWith(value = {org.springframework.restdocs.RestDocumentationExtension.class, org.springframework.test.context.junit.jupiter.SpringExtension.class})
@org.springframework.boot.test.context.SpringBootTest()
@org.junit.jupiter.api.Tag(value = "restdocs")
public abstract class RestDocsTest {
    @org.springframework.beans.factory.annotation.Autowired()
    private org.springframework.web.context.WebApplicationContext webApplicationContext;
    private org.springframework.restdocs.RestDocumentationContextProvider restDocumentation;
    
    public RestDocsTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public void setUp(@org.jetbrains.annotations.NotNull()
    org.springframework.restdocs.RestDocumentationContextProvider restDocumentation) {
    }
    
    private final org.springframework.test.web.servlet.MockMvc createMockMvc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected io.restassured.module.mockmvc.specification.MockMvcRequestSpecification given() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected io.restassured.module.mockmvc.specification.MockMvcRequestSpecification given(@org.jetbrains.annotations.Nullable()
    org.springframework.test.web.servlet.MockMvc mockMvc) {
        return null;
    }
}