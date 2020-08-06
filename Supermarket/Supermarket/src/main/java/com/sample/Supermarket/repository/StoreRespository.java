package com.sample.Supermarket.repository;

import com.sample.Supermarket.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRespository extends JpaRepository<Store, Integer> {


}
