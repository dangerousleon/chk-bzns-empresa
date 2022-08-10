package com.chk.bzns.empresa.core.manager

import com.chk.bzns.empresa.common.dto.EnterpriseResponse
import com.chk.bzns.empresa.common.enum.Country
import com.chk.bzns.empresa.core.mapper.EnterpriseMapper
import com.chk.bzns.empresa.domain.repository.EnterpriseRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class EnterpriseManager {
    private val logger = LoggerFactory.getLogger(EnterpriseManager::class.java)

    @Autowired
    private lateinit var enterpriseRepository: EnterpriseRepository

    fun getEnterprises(country: Country): List<EnterpriseResponse> {
        val enterprises = enterpriseRepository.findAll()
        return EnterpriseMapper.buildToEnterprisesResponse(enterprises)
    }

    fun getEnterpriseByCode(country: Country, code: UUID): EnterpriseResponse? {
        val enterprise = enterpriseRepository.findByCodeAndCountry(code,country.name).orElseThrow {
            throw Exception("Some Exception")
        }
        return EnterpriseMapper.buildToEnterpriseResponse(enterprise)
    }

}
