package com.bruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.course.entities.User;
import com.bruno.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll(){
		return userRepo.findAll();
	}
	
	public User findById (Long id) {
		Optional<User> obj =  userRepo.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return userRepo.save(obj);
	}
	
	public void delete(Long id) {
		userRepo.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = userRepo.getReferenceById(id);
		updateData(entity,obj);
		return userRepo.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
