package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Product;
import com.sample.Supermarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getProducts(){return productService.getAllProducts();}
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> fetchProductById(@PathVariable Integer id){
        return productService.getProductById(id)
                .map(b-> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.saveProduct(product));
    }
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.saveProduct(product));
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id){
        productService.deleteProductById(id);
        return ResponseEntity.ok().build();
    }

}
