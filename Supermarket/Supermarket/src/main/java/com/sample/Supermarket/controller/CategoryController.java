package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Category;
import com.sample.Supermarket.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public List<Category> getCategories(){return categoryService.getAllCategories();}
    @GetMapping("/category/{id}")
    public ResponseEntity<Category>fetchCategoryById(@PathVariable Integer id){
        return categoryService.getCategoryById(id)
                .map(b-> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/category")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return ResponseEntity.ok().body(categoryService.saveCategory(category));
    }
    @PutMapping("/category/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category){
        return ResponseEntity.ok().body(categoryService.saveCategory(category));
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Integer id){
        categoryService.deleteCategoryById(id);
        return ResponseEntity.ok().build();
    }

}
