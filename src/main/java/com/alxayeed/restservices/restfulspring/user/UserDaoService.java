package com.alxayeed.restservices.restfulspring.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "Abdullah", new Date()));
        users.add(new User(2, "Al", new Date()));
        users.add(new User(3, "Sayeed", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User u){
//        if(u.getId() == null){
//            u.setId(++userCount);
//        }
        users.add(u);
        return u;
    }

    public User findOne(int id){
        for (User user: users) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
