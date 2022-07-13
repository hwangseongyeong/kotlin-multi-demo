package com.hwang.demo.core.controller.v1

import com.hwang.demo.core.controller.v1.request.PreChargeRequestDTO
import com.hwang.demo.core.controller.v1.response.PreChargeResponseDTO
import com.hwang.demo.core.domain.PreChargeRequestParam
import com.hwang.demo.core.domain.PreChargeService
import com.hwang.demo.core.support.response.ApiResponseDTO
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class PreChargeController(
    val preChargeService: PreChargeService
) {
    @PostMapping(
        value = ["/pre-charge"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun examPost(
        @RequestBody request: PreChargeRequestDTO
    ): ApiResponseDTO<PreChargeResponseDTO> {
        val param = preChargeService.getCharges(request.toParam())
        return ApiResponseDTO.success(PreChargeResponseDTO(param.message))
    }

    @GetMapping(value = ["/charge/{preChargeId}"])
    fun examGet(
        @PathVariable preChargeId: String
    ): ApiResponseDTO<PreChargeResponseDTO> {
        val charges =
            preChargeService.getCharges(PreChargeRequestParam(preChargeId))
        return ApiResponseDTO.success(PreChargeResponseDTO(charges.message))
    }
}
