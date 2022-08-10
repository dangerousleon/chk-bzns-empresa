package com.chk.bzns.empresa.domain.repository

import com.chk.bzns.empresa.domain.model.EnterpriseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID
import java.util.Optional

@Repository
interface EnterpriseRepository : JpaRepository<EnterpriseEntity, Long>{
    fun findByCodeAndCountry(code: UUID, country:String): Optional<EnterpriseEntity>
}
