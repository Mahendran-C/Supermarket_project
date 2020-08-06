package com.sample.Supermarket.service;

import com.sample.Supermarket.model.Store;
import com.sample.Supermarket.repository.StoreRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    private StoreRespository storeRespository;

    public List<Store> getAllStores(){
        return(List<Store>)storeRespository.findAll();
    }

    public Optional<Store> getStoreById(Integer id){
        return storeRespository.findById(id);
    }
    public Store saveStore(Store store){
        return storeRespository.save(store);
    }

    public void deleteStoreById(Integer store_id){
        storeRespository.deleteById(store_id);
    }

}
