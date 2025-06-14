package com.carlosbackend.projectweb.config;

import com.carlosbackend.projectweb.entities.Category;
import com.carlosbackend.projectweb.entities.Order;
import com.carlosbackend.projectweb.entities.Product;
import com.carlosbackend.projectweb.entities.User;
import com.carlosbackend.projectweb.entities.enums.OrderStatus;
import com.carlosbackend.projectweb.repositories.CategoryRepository;
import com.carlosbackend.projectweb.repositories.OrderRepository;
import com.carlosbackend.projectweb.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category( "Electronics");
        Category cat2 = new Category( "Books");
        Category cat3 = new Category( "Computers");

        Product p1 = new Product( "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product( "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product( "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product( "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product( "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        User u1 = new User( "Maria Brown", "maria@gmail.com",  "123456");
        User u2 = new User( "Alex Green", "alex@gmail.com","123456");

        Order o1 = new Order(Instant.now(), OrderStatus.PAID ,u1);
        Order o2 = new Order(Instant.now(),OrderStatus.SHIPPED ,u2);
        Order o3 = new Order(Instant.now(),OrderStatus.WAITING_PAYMENT,u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
