package com.springbootproject.example.repository.admin.product;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.product.AdminCategoryEntity;

@Repository
public interface AdminCategoryRepository extends JpaRepository<AdminCategoryEntity, Long> {
	//funtion to get list of category by name.
	
	List<AdminCategoryEntity> findByCategoryNameContaining(String name);
	Page<AdminCategoryEntity> findByCategoryNameContaining(String name,Pageable pageable);
	

}
