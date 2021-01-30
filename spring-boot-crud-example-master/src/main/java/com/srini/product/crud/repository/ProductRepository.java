package com.srini.product.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srini.product.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

