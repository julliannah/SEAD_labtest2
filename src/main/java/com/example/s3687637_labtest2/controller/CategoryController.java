package com.example.s3687637_labtest2.controller;
import com.example.s3687637_labtest2.model.Category;
import com.example.s3687637_labtest2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @RequestMapping(path = "/categories", method = RequestMethod.POST)
    public void addCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }

    @RequestMapping(path = "/categories", method = RequestMethod.PUT)
    public void updateCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }

    @RequestMapping(path = "/categories/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCategory(@PathVariable(value = "id") Long id){
        categoryService.deleteCategory(id);
    }

    @RequestMapping(path = "/categories/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable(value = "id") Long id){
        return categoryService.getCategory(id);
    }
}
