package com.bruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.course.entities.Order;
import com.bruno.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository userRepo;
	
	public List<Order> findAll(){
		return userRepo.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> obj =  userRepo.findById(id);
		return obj.get();
	}
}
