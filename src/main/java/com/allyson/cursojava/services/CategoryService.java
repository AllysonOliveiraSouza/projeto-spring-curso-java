package com.allyson.cursojava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allyson.cursojava.entities.Category;
import com.allyson.cursojava.repositories.CategoryRepository;

@Service
// É para dizer que a classe é um componente do tipo serviço, pra realizar a injeção de
//dependência automaticamente em outra classe que depende dessa :)
public class CategoryService {
	@Autowired
	CategoryRepository repository;
	
	public List<Category> findAll(){

		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
