package com.springbootproject.example.repository.admin.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.product.AdminPaymentEntity;

@Repository
public interface AdminPaymentRepository extends JpaRepository<AdminPaymentEntity, String> {

}
