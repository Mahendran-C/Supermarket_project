package com.sample.Supermarket.controller;

import com.sample.Supermarket.model.Order;
import com.sample.Supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public List<Order> getOrders(){return orderService.getAllOrders();}

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> fetchOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id)
                .map(b->ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        return ResponseEntity.ok().body(orderService.saveOrder(order));
    }

    @PutMapping("/order/{id}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        return ResponseEntity.ok().body(orderService.saveOrder(order));
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer id){
        orderService.deleteOrderBYid(id);
        return ResponseEntity.ok().build();
    }
}
