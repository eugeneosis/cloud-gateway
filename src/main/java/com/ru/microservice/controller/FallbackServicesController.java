package com.ru.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackServicesController {

    @GetMapping("/botservicefallback")
    public Mono<String> botServiceFallbackMethod() {
        return Mono.just("Сервис временно не доступен");
    }

    @GetMapping("/securityservicefallback")
    public Mono<String> securityServiceFallbackMethod() { return Mono.just("Сервис временно не доступен"); }

    @GetMapping("/uirestservicefallback")
    public Mono<String> uiRestServiceFallbackMethod() { return Mono.just("Сервис временно не доступен"); }
}
