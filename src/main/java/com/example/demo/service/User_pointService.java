package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User_point;
import com.example.demo.repository.User_pointRepository;

@Service
public class User_pointService
{
    @Autowired
    User_pointRepository userpointRepository;


    public User_point findId(int id)
    {
    return userpointRepository.findById(id);
    }



}