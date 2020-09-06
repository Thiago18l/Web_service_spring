package com.webservice.application.services;

import com.webservice.application.entities.Order;
import com.webservice.application.entities.User;
import com.webservice.application.repositories.OrderRepository;
import com.webservice.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
    public Order findById(Long id) {
        Optional<Order> orderId = repository.findById(id);
        return orderId.get();
    }
}
