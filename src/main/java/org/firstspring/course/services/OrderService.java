package org.firstspring.course.services;

import org.firstspring.course.entities.Order;
import org.firstspring.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public Order findByID(Long id) {
        Optional<Order> obj= OrderRepository.findById(id);
        return obj.get();
    }
}
