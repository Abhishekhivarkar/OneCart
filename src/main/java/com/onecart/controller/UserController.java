package com.onecart.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;

import com.onecart.entity.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
  private List<User> userList = new ArrayList<>();

  @GetMapping("/api/users")
  public List<User> getAllUsers() {
    return userList;
  }

  @PostMapping("/api/users")
  public List<User> createUsers(@RequestBody User user) {
    userList.add(user);
    return userList;
  }

  @DeleteMapping("/api/users")
  public List<User> deleteUser(){
    return userList;
  }
}