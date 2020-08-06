package com.sample.Supermarket.repository;

import com.sample.Supermarket.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {



}
