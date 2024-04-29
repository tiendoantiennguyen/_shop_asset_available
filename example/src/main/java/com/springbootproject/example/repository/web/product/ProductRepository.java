package com.springbootproject.example.repository.web.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.product.ProductsEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductsEntity, String>{

}
