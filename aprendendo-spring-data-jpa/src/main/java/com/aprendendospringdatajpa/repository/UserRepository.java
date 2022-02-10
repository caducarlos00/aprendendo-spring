package com.aprendendospringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aprendendospringdatajpa.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}
