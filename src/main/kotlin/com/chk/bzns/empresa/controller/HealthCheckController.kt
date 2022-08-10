package com.chk.bzns.empresa.controller

import com.chk.bzns.empresa.common.route.Routes
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = [(Routes.HEALTH)], produces = [(MediaType.APPLICATION_JSON_VALUE)])
class HealthCheckController {

    @GetMapping
    @ResponseBody
    @RequestMapping(method = [RequestMethod.GET], produces = ["application/json"])
    fun getHealthCheck(): ResponseEntity<HashMap<String, String>> = ResponseEntity(hashMapOf("status" to "UP"), HttpStatus.OK)
}
