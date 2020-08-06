package com.sample.Supermarket.service;

import com.sample.Supermarket.model.Brand;
import com.sample.Supermarket.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    public List<Brand> getAllBrands(){ return (List<Brand>)brandRepository.findAll();}


    public Optional<Brand> getBrandById(Integer id){
        return brandRepository.findById(id);}

    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }


    public void deleteBrandById(Integer brand_id) { brandRepository.deleteById(brand_id); }
}
