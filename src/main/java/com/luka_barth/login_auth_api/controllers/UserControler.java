package com.luka_barth.login_auth_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControler {
    @GetMapping
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Sucesso!");
    }
}
