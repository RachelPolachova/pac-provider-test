package com.rachel.pacprovider.pacprovider

import org.springframework.core.io.FileSystemResource
import org.springframework.core.io.InputStreamResource
import org.springframework.core.io.Resource
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.io.File
import java.io.FileInputStream
import java.text.SimpleDateFormat
import java.time.LocalDate

@RestController
class HelloController {

    @GetMapping("/")
    fun index(): String {
        return "Index webpage."
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "Index webpage."
    }

    @GetMapping("/mypac")
    @ResponseBody
    fun getPacFile(httpEntity: HttpEntity<String>): ResponseEntity<Resource> {
        val calendarInstance = java.util.Calendar.getInstance()
        println()
        println("================ HTTP ENTITY ==================")
        println("${calendarInstance.time}")
        println("--- headers ---")
        println("${httpEntity.headers}")
        println("--- body ---")
        println("${httpEntity.body}")
        println("====================================")
        println()
//        val file = File("proxy.pac")
//        val resource = InputStreamResource(FileInputStream(file))
//        return ResponseEntity
//                .ok()
//                .contentLength(file.length())
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .body(resource)

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(null)
    }
}