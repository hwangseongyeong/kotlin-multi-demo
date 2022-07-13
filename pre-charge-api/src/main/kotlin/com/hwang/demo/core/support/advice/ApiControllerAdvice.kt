package com.hwang.demo.core.support.advice

import com.hwang.demo.core.support.error.ErrorType
import com.hwang.demo.core.support.exception.HandleException
import com.hwang.demo.core.support.response.ApiResponseDTO
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiControllerAdvice {
    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    @ExceptionHandler(HandleException::class)
    fun handleRunTimeException(e: HandleException): ResponseEntity<ApiResponseDTO<Any>> {
        logger.error("Exception : {}", e.message, e)
        return ResponseEntity(ApiResponseDTO.error(ErrorType.COMMON_ERROR), ErrorType.COMMON_ERROR.status)
    }
}
