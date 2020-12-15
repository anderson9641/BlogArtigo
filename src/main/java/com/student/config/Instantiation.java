package com.student.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.student.entities.Login;
import com.student.entities.User;
import com.student.enuns.Perfil;
import com.student.repositories.LoginRepository;
import com.student.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired 
	private UserRepository userRepo;

	
	@Override
	public void run(String... args) throws Exception {
		Login l1 = new Login(null, "teste@teste.com", "123");
		
		User u1 = new User(null, "J.K.", "Esritora", Perfil.USUARIO, null, l1);
		
		userRepo.saveAll(Arrays.asList(u1));
	}

}
