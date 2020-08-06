package com.sample.Supermarket.repository;

import com.sample.Supermarket.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByFirstName(String firstName);
    List<Customer> findAllByType(String type);


    Optional<Customer> findByEmailIdAndPassword(String emailId, String password);
}
