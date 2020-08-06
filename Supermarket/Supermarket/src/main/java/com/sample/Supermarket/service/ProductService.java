package com.sample.Supermarket.service;

import com.sample.Supermarket.model.Product;
import com.sample.Supermarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return (List<Product>)productRepository.findAll();
    }
    public Optional<Product> getProductById(Integer id){
        return productRepository.findById(id);
    }
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    public void deleteProductById(Integer product_id){
        productRepository.deleteById(product_id);
    }


}
