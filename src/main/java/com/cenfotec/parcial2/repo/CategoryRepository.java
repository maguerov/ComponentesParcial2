package com.cenfotec.parcial2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.parcial2.domain.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public List<Category> findByNameContaining(String word);

}
