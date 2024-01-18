package com.allyson.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allyson.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}

// Só isso já cria a interface, não é necessário criar os métodos para implementar, pois o spring
// já faz isso