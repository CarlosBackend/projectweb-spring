package com.carlosbackend.projectweb.repositories;

import com.carlosbackend.projectweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
