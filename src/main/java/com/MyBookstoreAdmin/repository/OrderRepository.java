package com.MyBookstoreAdmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyBookstoreAdmin.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
