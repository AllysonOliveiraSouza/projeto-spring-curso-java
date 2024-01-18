package com.allyson.cursojava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allyson.cursojava.entities.Order;
import com.allyson.cursojava.repositories.OrderRepository;

@Service
// É para dizer que a classe é um componente do tipo serviço, pra realizar a injeção de
//dependência automaticamente em outra classe que depende dessa :)
public class OrderService {
	@Autowired
	OrderRepository repository;
	
	public List<Order> findAll(){

		return repository.findAll();
	}
	
	public Order findById(Integer id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
