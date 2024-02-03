package com.coderhari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhari.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
