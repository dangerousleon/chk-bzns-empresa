package com.chk.bzns.empresa.core.mapper

import com.chk.bzns.empresa.common.dto.EnterpriseResponse
import com.chk.bzns.empresa.common.dto.request.EnterpriseRequest
import com.chk.bzns.empresa.common.enum.Country
import com.chk.bzns.empresa.common.enum.EnterpriseState
import com.chk.bzns.empresa.domain.model.EnterpriseEntity
import java.util.*

object EnterpriseMapper {

    fun buildToEnterprisesResponse(enterpriseList: List<EnterpriseEntity>): List<EnterpriseResponse> {
        return enterpriseList.map { enterprise ->
            EnterpriseResponse(
                code = enterprise.code,
                name = enterprise.nameEnterprise,
                address = enterprise.address,
                state = EnterpriseState.valueOf(enterprise.state),
                legalRepresentative = enterprise.legalRepresentative,
                rfc = enterprise.rfc,
                phone = enterprise.phone,
                email = enterprise.email,
                country = Country.valueOf(enterprise.country),
                image = enterprise.image
            )
        }
    }

    fun buildToEnterpriseResponse(enterpriseEntity: EnterpriseEntity): EnterpriseResponse {
        return EnterpriseResponse(
                code = enterpriseEntity.code,
                name = enterpriseEntity.nameEnterprise,
                address = enterpriseEntity.address,
                state = EnterpriseState.valueOf(enterpriseEntity.state),
                legalRepresentative = enterpriseEntity.legalRepresentative,
                rfc = enterpriseEntity.rfc,
                phone = enterpriseEntity.phone,
                email = enterpriseEntity.email,
                country = Country.valueOf(enterpriseEntity.country),
                image = enterpriseEntity.image
            )
    }

    fun buildToEnterpriseEntity(enterpriseRequest: EnterpriseRequest, country:Country):EnterpriseEntity{
        return EnterpriseEntity(
            code = UUID.randomUUID(),
            country = country.name,
            email = enterpriseRequest.email,
            address = enterpriseRequest.address.orEmpty(),
            image = enterpriseRequest.image.orEmpty(),
            nameEnterprise = enterpriseRequest.name,
            legalRepresentative = enterpriseRequest.legalRepresentative,
            phone = enterpriseRequest.phone,
            rfc = enterpriseRequest.rfc.orEmpty(),
            state = enterpriseRequest.state.name,
            createdAt = Date()
        )
    }
}
