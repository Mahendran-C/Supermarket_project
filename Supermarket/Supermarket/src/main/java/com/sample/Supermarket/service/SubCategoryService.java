package com.sample.Supermarket.service;

import com.sample.Supermarket.model.SubCategory;
import com.sample.Supermarket.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public List<SubCategory> getAllSubCategories(){
        return (List<SubCategory>)subCategoryRepository.findAll();
    }
    public Optional<SubCategory> getSubCategoryById(Integer id){
        return subCategoryRepository.findById(id);
    }
    public SubCategory saveSubCategory(SubCategory subCategory){
        return subCategoryRepository.save(subCategory);
    }
    public void deleteSubCategoryById(Integer sub_category_id){
        subCategoryRepository.deleteById(sub_category_id);
    }

}

