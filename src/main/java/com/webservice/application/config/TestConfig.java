package com.webservice.application.config;

import com.webservice.application.entities.User;
import com.webservice.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(1L, "Thiago", "thiago.lopes@gmail.com", "9888877", "1234");
        User user2 = new User(2L, "Alex", "alex@hotmail.com", "2222222", "3333");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
