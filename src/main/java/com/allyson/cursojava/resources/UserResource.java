package com.allyson.cursojava.resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.cursojava.entities.User;
//Para informar que é um recurso web que é implementado por um controlador rest usamos a
//annotation : @RestController

@RestController
@RequestMapping(value="/users")

public class UserResource {
	
	@GetMapping
	// @GetMapping indica que a requisição é do tipo GET do http
	public ResponseEntity<User> findAll(){
		User user = new User(1,"José","j@bol.com.br","119959595959","123");		
		return ResponseEntity.ok().body(user);
		// ResponseEntity.ok() = Retornar resposta com sucesso do http
		// .body(user) = Retornar corpo da resposta para o user
	}

}
