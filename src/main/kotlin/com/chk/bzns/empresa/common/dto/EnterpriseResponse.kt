package com.chk.bzns.empresa.common.dto

import com.chk.bzns.empresa.common.enum.Country
import com.chk.bzns.empresa.common.enum.EnterpriseState
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.UUID

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class EnterpriseResponse(
    val code: UUID,
    val name: String,
    val rfc: String? = null,
    val address: String? = null,
    val phone: String,
    val email: String,
    val state: EnterpriseState,
    val image: String? = null,
    val legalRepresentative: String,
    val country: Country
)
