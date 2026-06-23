package com.onecart.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.onecart.entity.User;
import java.util.List;
@Service
public class UserService {
    private List<User> userList = new ArrayList<>();

    public List<User> fetchAllUsers(){
        return userList;
    }

    public List<User> registerUser(User user){
        userList.add(user);
        return userList;
    }
}
