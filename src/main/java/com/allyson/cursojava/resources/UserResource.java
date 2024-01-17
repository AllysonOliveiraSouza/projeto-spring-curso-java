package com.allyson.cursojava.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.cursojava.entities.User;
//Para informar que é um recurso web que é implementado por um controlador rest usamos a
//annotation : @RestController
import com.allyson.cursojava.services.UserService;

@RestController
@RequestMapping(value="/users")

public class UserResource {
	
	@Autowired
	private UserService us;
	
	@GetMapping
	// @GetMapping indica que a requisição é do tipo GET do http
	public ResponseEntity<List<User>> findAll(){
		
		List<User> lista = us.findAll();
	
		return ResponseEntity.ok().body(lista);
		// ResponseEntity.ok() = Retornar resposta com sucesso do http
		// .body(user) = Retornar corpo da resposta para a lista
	}
	
	@GetMapping(value="/{id}")
	// Para a url ter um parâmetro, que no caso é o id
	
	public ResponseEntity<User>findById(@PathVariable Integer id){
//@PathVariable é para o parametro desse método ser reconhecido pelo spring
		User user = us.findById(id);
		return ResponseEntity.ok().body(user);
	}
	

}
