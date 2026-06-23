package com.app.onecart;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController{
 private List<User> userList = new ArrayList<>();
 @GetMapping("/api/users")
  public List<User> getAllUsers(){
   return userList;
  }
}