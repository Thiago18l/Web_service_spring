package com.webservice.application.resources;

import com.webservice.application.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll () {
        User u = new User(1L, "Thiago", "thiago@gmail.com", "981743371", "0000");
        return ResponseEntity.ok().body(u);
    }
}
