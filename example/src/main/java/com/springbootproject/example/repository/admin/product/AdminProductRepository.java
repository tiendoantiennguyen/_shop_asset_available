package com.springbootproject.example.repository.admin.product;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.product.AdminProductsEntity;

@Repository
public interface AdminProductRepository extends JpaRepository<AdminProductsEntity, String> {

	List<AdminProductsEntity> findByProductNameContaining(String name);

	Page<AdminProductsEntity> findByProductNameContaining(String name, Pageable pageable);

}
