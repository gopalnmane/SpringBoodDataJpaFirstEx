package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.product.Product;

public interface ProductRepositry extends JpaRepository<Product,Integer> {

}
