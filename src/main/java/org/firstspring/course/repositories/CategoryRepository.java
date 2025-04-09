package org.firstspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.firstspring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
