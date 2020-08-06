package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.SubCategory;
import com.sample.Supermarket.service.SubCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubCategoryController {

    private SubCategoryService subCategoryService;

    @GetMapping("/subCategory")
    public List<SubCategory> getSubCategories(){return subCategoryService.getAllSubCategories();}
    @GetMapping("/subCategory/{id}")
    public ResponseEntity<SubCategory> fetchSubCategoryById(@PathVariable Integer id){
        return subCategoryService.getSubCategoryById(id)
                .map(b-> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/subCategory")
    public ResponseEntity<SubCategory> saveSubCategory(@RequestBody SubCategory subCategory){
        return ResponseEntity.ok().body(subCategoryService.saveSubCategory(subCategory));
    }
    @PutMapping("/subCategory/{id}")
    public ResponseEntity<SubCategory> updateSubCategory(@RequestBody SubCategory subCategory){
        return ResponseEntity.ok().body(subCategoryService.saveSubCategory(subCategory));
    }

    @DeleteMapping("/subCategory/{id}")
    public ResponseEntity<Void> deleteSubCategory(@PathVariable Integer id){
        subCategoryService.deleteSubCategoryById(id);
        return ResponseEntity.ok().build();
    }
}
