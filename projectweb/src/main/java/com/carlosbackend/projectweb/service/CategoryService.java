package com.carlosbackend.projectweb.service;
import com.carlosbackend.projectweb.entities.Category;
import com.carlosbackend.projectweb.entities.User;
import com.carlosbackend.projectweb.repositories.CategoryRepository;
import com.carlosbackend.projectweb.repositories.UserRepository;
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
    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
