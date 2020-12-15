package com.student.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Login;
import com.student.entities.User;
import com.student.repositories.LoginRepository;
import com.student.repositories.UserRepository;
import com.student.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private LoginRepository loginRepo;
	
	public User findById(Long id){
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " +User.class.getName()));	
	}
	
	public User insert(User obj) {
		obj.setId(null);
		Login l = obj.getLogin();
		loginRepo.save(l);
		return repo.save(obj);
	}
	
	public User update(User obj) {
		User newObj = findById(obj.getId());
		System.out.println("******************************************");
		System.out.println(newObj.getLogin().getId());
		updateData(newObj, obj);
		
		return repo.save(newObj);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setDescription(obj.getDescription());
		newObj.setImageProfile(obj.getImageProfile());
		newObj.setName(obj.getName());
		newObj.setProfile(obj.getProfile());
		newObj.setLogin(obj.getLogin());
	}
	
}
