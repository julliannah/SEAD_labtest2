package com.example.s3687637_labtest2.service;

import com.example.s3687637_labtest2.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public void saveCategory(Category category);
    public void deleteCategory(Long id);
    public Category getCategory(Long id);
}
