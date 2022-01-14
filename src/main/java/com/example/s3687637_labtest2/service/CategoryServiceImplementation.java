package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Category;
import com.example.s3687637_labtest2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CategoryServiceImplementation implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void saveCategory(Category category){
        this.categoryRepository.save(category);
    }

    public List<Category> getAllCategories(){
        return this.categoryRepository.findAll();
    }

    public Category getCategory(Long id){
        Category category = null;
        try {
            category = this.categoryRepository.findById(id)
                    .orElseThrow(() -> new Exception("Category not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }
    public void deleteCategory(Long id){
        this.categoryRepository.deleteById(id);
    }

}
