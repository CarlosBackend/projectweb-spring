package com.carlosbackend.projectweb.service;
import com.carlosbackend.projectweb.entities.Order;
import com.carlosbackend.projectweb.entities.User;
import com.carlosbackend.projectweb.repositories.OrderRepository;
import com.carlosbackend.projectweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
