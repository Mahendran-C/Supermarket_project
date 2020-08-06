package com.sample.Supermarket.service;

import com.sample.Supermarket.model.ShoppingCart;
import com.sample.Supermarket.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCart> getAllShoppingCarts(){return (List<ShoppingCart>) shoppingCartRepository.findAll();}

    public Optional<ShoppingCart> getShoppingCartById(Integer id){ return shoppingCartRepository.findById(id); }

    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart){
        return shoppingCartRepository.save(shoppingCart); }

    public void deleteShoppingCartById(Integer shopping_cart_id){
        shoppingCartRepository.deleteById(shopping_cart_id); }
}
