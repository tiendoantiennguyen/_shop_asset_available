package com.springbootproject.example.repository.admin.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.admin.customer.AdminSuppliersEntity;

@Repository
public interface AdminSupplierRepository extends JpaRepository<AdminSuppliersEntity, String>{

}
