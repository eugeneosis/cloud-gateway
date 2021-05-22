package com.ru.microservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

 /*   private static final String SECURITY_SERVICE = "security-service";
    private static final String BOT_SERVICE = "bot-service";
    private static final String UI_REST_SERVICE = "ui-rest-service";*/

    private static final String SERVICE_FALLBACK_CONSTANT = "Сервис временно не доступен. Попробуйте обновить страницу или зайти позднее.";

    @GetMapping("/securityservicefallback")
    @CircuitBreaker(name = "security-service", fallbackMethod = "securityServiceFallbackMethod")
    public Mono<String> securityServiceFallbackMethod() { return Mono.just(SERVICE_FALLBACK_CONSTANT); }

    @GetMapping("/botservicefallback")
    @CircuitBreaker(name = "bot-service", fallbackMethod = "botServiceFallbackMethod")
    public Mono<String> botServiceFallbackMethod() { return Mono.just(SERVICE_FALLBACK_CONSTANT); }

    @GetMapping("/uirestservicefallback")
    @CircuitBreaker(name = "ui-rest-service", fallbackMethod = "uiRestServiceFallbackMethod")
    public Mono<String> uiRestServiceFallbackMethod() { return Mono.just(SERVICE_FALLBACK_CONSTANT); }
}