package com.cenfotec.parcial2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.parcial2.domain.Category;
import com.cenfotec.parcial2.repo.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository repo;

    @Override
    public void save(Category category) {
     repo.save(category);
    }

    @Override
    public Optional<Category> get(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Category> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Category> find(String name) {
        return repo.findByNameContaining(name);
    }
}
