package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User_point;

public interface User_pointRepository extends JpaRepository<User_point, Long>
{
	 User_point findById(int id);


}

