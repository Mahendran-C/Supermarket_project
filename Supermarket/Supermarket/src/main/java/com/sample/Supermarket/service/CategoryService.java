package com.sample.Supermarket.service;

import com.sample.Supermarket.model.Category;
import com.sample.Supermarket.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category>getAllCategories(){
        return (List<Category>)categoryRepository.findAll();
    }
    public Optional<Category> getCategoryById(Integer id){
        return categoryRepository.findById(id);
    }
    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
    public void deleteCategoryById(Integer category_id){
        categoryRepository.deleteById(category_id);
    }

}
