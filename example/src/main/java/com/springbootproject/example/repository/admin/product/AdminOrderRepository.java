package com.springbootproject.example.repository.admin.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.product.AdminOrderEntity;
import com.springbootproject.example.entity.web.product.OrderEntity;

@Repository
public interface AdminOrderRepository extends JpaRepository<AdminOrderEntity, String>{

}
