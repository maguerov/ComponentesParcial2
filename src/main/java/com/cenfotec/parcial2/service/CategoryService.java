package com.cenfotec.parcial2.service;

import java.util.List;
import java.util.Optional;

import com.cenfotec.parcial2.domain.Category;

public interface CategoryService {

    public void save(Category category);
    public void delete(Category category);
    public Optional<Category> get(Long id);
    public List<Category> getAll();
    public List<Category> find(String name);
}
