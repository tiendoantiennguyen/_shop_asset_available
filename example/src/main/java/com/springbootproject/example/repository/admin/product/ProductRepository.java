package com.springbootproject.example.repository.admin.product;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.product.ProductsEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductsEntity, String> {

	List<ProductsEntity> findByCategoryNameContainining(String name);

	Page<ProductsEntity> findByCategoryNameContainining(String name, Pageable pageable);

}
