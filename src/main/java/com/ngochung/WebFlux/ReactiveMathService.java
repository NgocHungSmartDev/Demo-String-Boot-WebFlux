/**
 * ReactiveMathService.java Feb 9, 2023
 * 
 * Copyright by NgocHung.
 * 
 * Last update Feb 9, 2023
 */
package com.ngochung.WebFlux;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class ReactiveMathService {

    public Flux<Response> multiplicationTable(int input) {
        return Flux.range(1, 10).delayElements(Duration.ofSeconds(1))
                // .doOnNext(i -> SleepUtil.sleepSeconds(1))
                .doOnNext(i -> System.out.println("reactive-math-service processing : " + i))
                .map(i -> new Response(i * input));
    }
}
