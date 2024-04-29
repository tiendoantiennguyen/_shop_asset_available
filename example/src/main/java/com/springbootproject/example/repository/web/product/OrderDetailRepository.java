package com.springbootproject.example.repository.web.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.product.OrderDetailEntity;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, String> {

}
