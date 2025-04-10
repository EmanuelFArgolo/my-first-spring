package org.firstspring.course.config;


import org.firstspring.course.entities.*;
import org.firstspring.course.entities.enums.OrderStatus;
import org.firstspring.course.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null,  Instant.parse("2023-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), OrderStatus.PAID, u2);

        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Computers");
        Product p1 = new Product(null, "Computer", "Good computer", 2000.00, "");
        Product p2 = new Product(null, "TV", "Good TV", 2000.00, "" );

        categoryRepository.saveAll(Arrays.asList(c1, c2));
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2));

        productRepository.saveAll(Arrays.asList(p1, p2));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        productRepository.saveAll(Arrays.asList(p1, p2));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p2, 1, p2.getPrice());
        OrderItem oi3 = new OrderItem(o2, p2, 2, p2.getPrice());
        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3));
    }
}
