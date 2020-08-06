package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Brand;
import com.sample.Supermarket.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brand")
    public List<Brand> getBrands(){
        return brandService.getAllBrands();}

    @GetMapping("/brand/{id}")
    public ResponseEntity<Brand> fetchBrandById(@PathVariable Integer id) {
        return brandService.getBrandById(id)
                .map(b -> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());}

    @PostMapping("/brand")
    public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand) {
        return ResponseEntity.ok().body(brandService.saveBrand(brand));
    }
    @PutMapping("/brand/{id}")
    public ResponseEntity<Brand> updateBrand(@RequestBody Brand brand){
        return ResponseEntity.ok().body(brandService.saveBrand(brand));
    }
    @DeleteMapping("/brand/{id}")
    public ResponseEntity<Void> deleteBrand(@PathVariable Integer id) {
        brandService.deleteBrandById(id);
        return ResponseEntity.ok().build();
    }
}
