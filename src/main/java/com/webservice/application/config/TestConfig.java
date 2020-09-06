package com.webservice.application.config;

import com.webservice.application.entities.Order;
import com.webservice.application.entities.User;
import com.webservice.application.repositories.OrderRepository;
import com.webservice.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired private UserRepository userRepository;
    @Autowired private OrderRepository orderRepository;
    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Thiago", "thiago.lopes@gmail.com", "9888877", "1234");
        User user2 = new User(null, "Alex", "alex@hotmail.com", "2222222", "3333");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
