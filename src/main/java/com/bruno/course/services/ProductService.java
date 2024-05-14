package com.bruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.course.entities.Product;
import com.bruno.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository userRepo;
	
	public List<Product> findAll(){
		return userRepo.findAll();
	}
	
	public Product findById (Long id) {
		Optional<Product> obj =  userRepo.findById(id);
		return obj.get();
	}
}
