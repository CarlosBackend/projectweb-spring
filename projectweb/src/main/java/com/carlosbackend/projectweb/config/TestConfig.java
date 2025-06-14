package com.carlosbackend.projectweb.config;

import com.carlosbackend.projectweb.entities.Order;
import com.carlosbackend.projectweb.entities.User;
import com.carlosbackend.projectweb.entities.enums.OrderStatus;
import com.carlosbackend.projectweb.repositories.OrderRepository;
import com.carlosbackend.projectweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    //Injeção de dependência
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User( "Maria Brown", "maria@gmail.com",  "123456");
        User u2 = new User( "Alex Green", "alex@gmail.com","123456");

        Order o1 = new Order(Instant.now(), OrderStatus.PAID ,u1);
        Order o2 = new Order(Instant.now(),OrderStatus.SHIPPED ,u2);
        Order o3 = new Order(Instant.now(),OrderStatus.WAITING_PAYMENT,u1);
        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
