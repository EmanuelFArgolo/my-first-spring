package org.firstspring.course.repositories;

import org.firstspring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {
    // Spring Data JPA will automatically implement this interface
    // and provide the necessary methods for CRUD operations on Product entities.
}
