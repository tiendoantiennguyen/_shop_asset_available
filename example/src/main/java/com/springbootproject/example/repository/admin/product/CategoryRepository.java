package com.springbootproject.example.repository.admin.product;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.product.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	//funtion to get list of category by name.
	
	List<CategoryEntity> findByCategoryNameContainining(String name);
	Page<CategoryEntity> findByCategoryNameContainining(String name,Pageable pageable);
	

}
