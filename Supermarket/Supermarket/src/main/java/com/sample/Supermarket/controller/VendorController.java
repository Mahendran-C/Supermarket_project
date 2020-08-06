package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Vendor;
import com.sample.Supermarket.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendor")
    public List<Vendor> getVendors(){
        return vendorService.getAllVendors();}

    @GetMapping("/vendor/{id}")
    public ResponseEntity<Vendor> fetchVendorById(@PathVariable Integer id) {
        return vendorService.getVendorById(id)
                .map(b -> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());}

    @PostMapping("/vendor")
    public ResponseEntity<Vendor> saveVendor(@RequestBody Vendor vendor) {
        return ResponseEntity.ok().body(vendorService.saveVendor(vendor));
    }
    @PutMapping("/vendor/{id}")
    public ResponseEntity<Vendor> updateVendor(@RequestBody Vendor vendor){
        return ResponseEntity.ok().body(vendorService.saveVendor(vendor));
    }
    @DeleteMapping("/vendor/{id}")
    public ResponseEntity<Void> deleteVendor(@PathVariable Integer id) {
        vendorService.deleteVendorById(id);
        return ResponseEntity.ok().build();
    }

}
