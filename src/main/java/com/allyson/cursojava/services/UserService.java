package com.allyson.cursojava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allyson.cursojava.entities.User;
import com.allyson.cursojava.repositories.UserRepository;

@Service
// É para dizer que a classe é um componente do tipo serviço, pra realizar a injeção de
//dependência automaticamente em outra classe que depende dessa :)
public class UserService {
	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){

		return repository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
