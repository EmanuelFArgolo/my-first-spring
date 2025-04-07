package org.firstspring.course.repositories;

import org.firstspring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA will automatically implement this interface
    // and provide the necessary methods for CRUD operations on User entities.

}
