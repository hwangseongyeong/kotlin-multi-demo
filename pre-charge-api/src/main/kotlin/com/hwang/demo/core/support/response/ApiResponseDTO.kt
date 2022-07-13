package com.hwang.demo.core.support.response

import com.hwang.demo.core.support.error.ErrorDTO
import com.hwang.demo.core.support.error.ErrorType

data class ApiResponseDTO<T>(
    val result: ResultType,
    val data: T?,
    val error: ErrorDTO?
) {
    companion object {
        fun <T> success(): ApiResponseDTO<T> {
            return ApiResponseDTO(ResultType.SUCCESS, null, null)
        }

        fun <T> success(result: T): ApiResponseDTO<T> {
            return ApiResponseDTO(ResultType.SUCCESS, result, null)
        }

        fun <T> error(error: ErrorType): ApiResponseDTO<T> {
            return ApiResponseDTO(ResultType.ERROR, null, ErrorDTO(error.code, error.message, null))
        }

        fun <T> error(error: ErrorType, errorData: Any): ApiResponseDTO<T> {
            return ApiResponseDTO(ResultType.ERROR, null, ErrorDTO(error.code, error.message, errorData))
        }
    }
}
