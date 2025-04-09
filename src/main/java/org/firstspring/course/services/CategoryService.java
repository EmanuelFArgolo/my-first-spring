package org.firstspring.course.services;

import org.firstspring.course.entities.Category;
import org.firstspring.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findByID(Long id){
        Optional<Category> obj= categoryRepository.findById(id);
        return obj.get();
    }
}
