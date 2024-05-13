package com.bruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.course.entities.Category;
import com.bruno.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository userRepo;
	
	public List<Category> findAll(){
		return userRepo.findAll();
	}
	
	public Category findById (Long id) {
		Optional<Category> obj =  userRepo.findById(id);
		return obj.get();
	}
}
