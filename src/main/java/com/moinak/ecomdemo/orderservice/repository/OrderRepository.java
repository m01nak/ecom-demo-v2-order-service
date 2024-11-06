package com.moinak.ecomdemo.orderservice.repository;

import com.moinak.ecomdemo.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
