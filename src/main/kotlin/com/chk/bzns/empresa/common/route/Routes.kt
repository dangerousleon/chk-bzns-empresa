package com.chk.bzns.empresa.common.route

object Routes {
    const val HEALTH = "/health"

    const val COUNTRY = "/{country}"
    const val VERSION_1 = "$COUNTRY/v1"

    object Enterprise {
        const val ENTERPRISE = "/enterprise"
        const val ENTERPRISE_BY_CODE = "/enterprise/{code}"
    }
}
