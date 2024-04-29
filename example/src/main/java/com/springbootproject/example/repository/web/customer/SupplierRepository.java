package com.springbootproject.example.repository.web.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.customer.SuppliersEntity;

@Repository
public interface SupplierRepository extends JpaRepository<SuppliersEntity, String>{

}
