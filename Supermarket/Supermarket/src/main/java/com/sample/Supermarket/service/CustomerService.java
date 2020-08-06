package com.sample.Supermarket.service;

import com.sample.Supermarket.model.Customer;
import com.sample.Supermarket.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;}

    public List<Customer> getAllCustomer() { return customerRepository.findAll(); }

    public List<Customer> getAllCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }
    public List<Customer> getAllCustomerByType(String type) { return customerRepository.findAllByType(type); }

    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer id){customerRepository.deleteById(id);}

    public Boolean logCustomer(String emailId, String password) {
        Optional<Customer> customerOptional = customerRepository.findByEmailIdAndPassword(emailId, password);
        if (customerOptional.isPresent()) {
            return true;
        }
        return false;
    }
}