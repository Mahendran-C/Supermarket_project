package com.sample.Supermarket.repository;

import com.sample.Supermarket.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository  extends JpaRepository<Vendor, Integer> {

}
