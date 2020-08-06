package com.sample.Supermarket.repository;

import com.sample.Supermarket.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository  extends JpaRepository<Brand, Integer> {
}
