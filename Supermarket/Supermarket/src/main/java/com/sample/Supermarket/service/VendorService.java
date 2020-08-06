package com.sample.Supermarket.service;

import com.sample.Supermarket.model.Vendor;
import com.sample.Supermarket.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    public List<Vendor> getAllVendors() {
        return (List<Vendor>) vendorRepository.findAll();
    }


    public Optional<Vendor> getVendorById(Integer id) {
        return vendorRepository.findById(id);
    }

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }


    public void deleteVendorById(Integer vendor_id) { vendorRepository.deleteById(vendor_id); }
}
