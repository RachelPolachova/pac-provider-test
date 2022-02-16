package com.rachel.pacprovider.pacprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import javax.net.ssl.SSLContext


@SpringBootApplication
class PacProviderApplication

fun main(args: Array<String>) {
	runApplication<PacProviderApplication>(*args)
}