package com.allyson.cursojava.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.allyson.cursojava.entities.User;
import com.allyson.cursojava.repositories.UserRepository;

@Configuration
@Profile("test")

// @Configuration é pra dizer ao spring que é uma classe de configuração
// @Profile("test") é pra informar que é a configuração do arquivo applications.prop...
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	//@Autowired é pra questão de injeção de dependencia, no caso para que o spring gere auto
	//-maticamente o objeto da classe UserRepository
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		List<User> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);		
		
		userRepository.saveAll(listaUsuarios);

	}

}
