package com.alxayeed.restservices.restfulspring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    UserDaoService service;

    // retrive All users
    @GetMapping("/users")
    public List<User> findAll(){
        return service.findAll();
    }

    // retrive user by id
    @GetMapping("/users/{id}")
    public User findOne(@PathVariable int id){
        return service.findOne(id);
    }
}
