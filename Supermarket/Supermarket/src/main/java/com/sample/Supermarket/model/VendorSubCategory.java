package com.sample.Supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "vendorSubCategory")
public class VendorSubCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendorSubCategory_id")
    private Integer id;


    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private Blob image;

    @ManyToOne
    @JoinColumn(name = "vendor_id", nullable = false, updatable = false)
    private Vendor vendor;

    @ManyToOne
    @JoinColumn(name = "vendorCategory_id", nullable = false, updatable = false)
    private VendorCategory vendorCategory;

    @Column(name = "status")
    private String status;

    @Column(name = "created")
    private String created;

}
