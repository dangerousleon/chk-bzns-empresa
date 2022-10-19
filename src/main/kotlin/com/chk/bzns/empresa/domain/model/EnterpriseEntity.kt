package com.chk.bzns.empresa.domain.model

import java.util.Date
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "enterprise")
class EnterpriseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long = 0,

    @Column(name = "code")
    var code: UUID,

    @Column(name = "name_enterprise")
    var nameEnterprise: String,

    @Column(name = "rfc")
    var rfc: String,

    @Column(name = "address")
    var address: String,

    @Column(name = "phone")
    var phone: String,

    @Column(name = "email")
    var email: String,

    @Column(name = "state")
    var state: String,

    @Column(name = "image")
    var image: String,

    @Column(name = "legal_representative")
    var legalRepresentative: String,

    @Column(name = "created")
    var createdAt: Date,

    @Column(name = "updated")
    var updatedAt: Date? = null,

    @Column(name = "country")
    var country: String
)
