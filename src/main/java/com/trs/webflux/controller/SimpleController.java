package com.trs.webflux.controller;

import com.trs.webflux.bo.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Description
 * @DATE 2021.4.15 16:31
 * @Author yangjie
 **/

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, WebFlux !";
    }

    @GetMapping("/user")
    public Mono<User> getUser() {
        User user = new User();
        user.setName("Healthy Mind");
        user.setDesc("Keep writing and Keep loving.");
        return Mono.just(user);
    }


}
