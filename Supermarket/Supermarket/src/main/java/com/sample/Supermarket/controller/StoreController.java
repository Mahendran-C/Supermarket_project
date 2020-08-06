package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Store;
import com.sample.Supermarket.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/store")
    public List<Store> getStores(){
        return storeService.getAllStores();
    }
    @GetMapping("/store/{id}")
    public ResponseEntity<Store> fetchStoreById(@PathVariable Integer id) {
        return storeService.getStoreById(id)
                .map(b ->ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/store")
    public ResponseEntity<Store> saveStore(@RequestBody Store store){
        return ResponseEntity.ok().body(storeService.saveStore(store));
    }

    @PutMapping("/store/{id}")
    public ResponseEntity<Store> updateStore(@RequestBody Store store){
        return ResponseEntity.ok().body(storeService.saveStore(store));
    }

    public ResponseEntity<Void> deleteStore(@PathVariable Integer id){
        storeService.deleteStoreById(id);
        return ResponseEntity.ok().build();
    }
}
