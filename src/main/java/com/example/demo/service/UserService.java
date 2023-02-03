package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {
    @Autowired
    UsersRepository repo;
    public Users submitUser(Users user){
        return repo.saveUser(user);
    }
    public Users getUser(String userId){
        return repo.findByUserId(userId);
    }
}
