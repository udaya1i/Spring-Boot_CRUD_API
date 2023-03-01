package com.example.spring_boot_api.controller;
import com.example.spring_boot_api.model.Users;
import com.example.spring_boot_api.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @PostMapping("/createuser")
    public String createUser(@RequestBody Users users){
           userServiceImp.createUser(users);
           return "User Created";
    }
    @DeleteMapping("deleteuser/{id}")
    public String deleteUser(@PathVariable Integer id){
        userServiceImp.deleteUser(id);
        return "Deleted";
    }
    @PutMapping("updateuser/{id}")
    public String updateUser(@PathVariable Integer id, @RequestBody Users updatedusers){
    userServiceImp.updateUsers(id, updatedusers);
    return "Updated!!";
    }
    @GetMapping("/alluser")
    public List<Users> getUsera(){
      return userServiceImp.getUsers();
    }
    @GetMapping("/userwithid/{id}")
    public Users getUsersbyid(Integer id){
        return userServiceImp.getuserbyid(id);
    }
}
