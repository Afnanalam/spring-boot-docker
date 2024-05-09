package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService(){
        userList.add(new User(UUID.randomUUID().toString(),"Afnan","afnan@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Alam","alam@gmail.com"));
    }

    public List<User> getUsers(){
        return this.userList;
    }

}
