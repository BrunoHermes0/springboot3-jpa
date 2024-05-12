package com.bruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
