package com.ru.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackServiceController {

    @GetMapping("/botservicefallback")
    public Mono<String> botServiceFallbackMethod() { return Mono.just("Сервис временно не доступен. \n Попробуйте обновить страницу или зайти позднее."); }

    @GetMapping("/uirestservicefallback")
    public Mono<String> uiRestServiceFallbackMethod() { return Mono.just("Сервис временно не доступен. \n Попробуйте обновить страницу или зайти позднее."); }
}