package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.ShoppingCart;
import com.sample.Supermarket.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/shoppingCart")
    public List<ShoppingCart> getShoppingCarts(){return shoppingCartService.getAllShoppingCarts();}

    @GetMapping("/shoppingCart/{id}")
    public ResponseEntity<ShoppingCart> fetchShoppingCartById(@PathVariable Integer id){
        return shoppingCartService.getShoppingCartById(id)
                .map(b->ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/shoppingCart")
    public ResponseEntity<ShoppingCart> saveShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return ResponseEntity.ok().body(shoppingCartService.saveShoppingCart(shoppingCart));
    }

    @PutMapping("/shoppingCart/{id}")
    public ResponseEntity<ShoppingCart> updateShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return ResponseEntity.ok().body(shoppingCartService.saveShoppingCart(shoppingCart));
    }

    @DeleteMapping("/shoppingCart/{id}")
    public ResponseEntity<Void> deleteShoppingCart(@PathVariable Integer id){
        shoppingCartService.deleteShoppingCartById(id);
        return ResponseEntity.ok().build();
    }


}
