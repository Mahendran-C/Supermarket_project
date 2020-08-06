package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Customer;
import com.sample.Supermarket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> fetchAllCustomer(@RequestParam(required = false) String type, @RequestParam(required = false) String firstName) {
        if (!StringUtils.isEmpty(type)) return ResponseEntity.ok().body(customerService.getAllCustomerByType(type));
        else if (!StringUtils.isEmpty(firstName)) return ResponseEntity.ok().body(customerService.getAllCustomerByFirstName(firstName));
        else return ResponseEntity.ok().body(customerService.getAllCustomer());
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> fetchCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id)
                .map(b -> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }
    @CrossOrigin
    @PostMapping("/customer/login")
    public Boolean checkCustomer(@RequestBody Customer customer) {
        return customerService.logCustomer(customer.getEmailId(), customer.getPassword());
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok().body(customerService.saveCustomer(customer));
    }
    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok().body(customerService.saveCustomer(customer));
    }
    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomerById(id);
        return ResponseEntity.ok().build();
    }
}
