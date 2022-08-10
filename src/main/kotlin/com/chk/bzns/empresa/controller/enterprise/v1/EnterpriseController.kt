package com.chk.bzns.empresa.controller.enterprise.v1

import com.chk.bzns.empresa.common.constant.Constant
import com.chk.bzns.empresa.common.dto.EnterpriseResponse
import com.chk.bzns.empresa.common.enum.Country
import com.chk.bzns.empresa.common.route.Routes
import com.chk.bzns.empresa.core.manager.EnterpriseManager
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE], value = [(Routes.VERSION_1)])
class EnterpriseController {
    private val logger = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var enterpriseManager: EnterpriseManager

    @GetMapping(Routes.Enterprise.ENTERPRISE)
    fun getEnterprises(
        @PathVariable(Constant.COUNTRY) country: Country
    ): ResponseEntity<List<EnterpriseResponse>> {
        logger.info("getEnterprises:: INIT in x country {}", country)
        val response = enterpriseManager.getEnterprises(country)
        logger.info("getEnterprises:: ENDS x response [{}]", response)
        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping(Routes.Enterprise.ENTERPRISE_BY_CODE)
    fun getEnterpriseByCode(
        @PathVariable(Constant.COUNTRY) country: Country,
        @PathVariable(Constant.CODE) code: UUID
    ): ResponseEntity<EnterpriseResponse> {
        logger.info("getEnterpriseByCode:: INIT in x country {}", country)
        val response = enterpriseManager.getEnterpriseByCode(country,code)
        logger.info("getEnterpriseByCode:: ENDS in x response [{}]", response)
        return ResponseEntity(response, HttpStatus.OK)
    }
}
