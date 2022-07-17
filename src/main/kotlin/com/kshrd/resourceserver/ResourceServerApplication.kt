package com.kshrd.resourceserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@SpringBootApplication
@RestController
class ResourceServerApplication {

    @GetMapping("/public")
//    @PreAuthorize("permitAll()")
    fun testPublic(): Mono<Map<String, String>> = Mono.just(mapOf("message" to "this is a public route"))

    @GetMapping("/private")
    fun testPrivate(): Mono<Map<String, String>> = Mono.just(mapOf("message" to "this is a private route"))

}

fun main(args: Array<String>) {
    runApplication<ResourceServerApplication>(*args)
}