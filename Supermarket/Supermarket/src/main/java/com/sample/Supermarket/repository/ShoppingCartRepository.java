package com.sample.Supermarket.repository;

import com.sample.Supermarket.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {


}
