package org.firstspring.course.services;

import org.firstspring.course.entities.Product;
import org.firstspring.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findByID(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }


}
