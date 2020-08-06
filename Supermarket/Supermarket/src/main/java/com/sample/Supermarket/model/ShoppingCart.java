package com.sample.Supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "shopping_cart_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name ="quantity")
    private Integer quantity;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "product_price")
    private Float productPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @Column(name = "created")
    private String created;
}
