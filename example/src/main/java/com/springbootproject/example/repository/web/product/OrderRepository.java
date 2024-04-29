package com.springbootproject.example.repository.web.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.product.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String>{

}
