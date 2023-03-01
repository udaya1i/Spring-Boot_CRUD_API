package com.example.spring_boot_api.service;

import com.example.spring_boot_api.model.Users;
import com.example.spring_boot_api.repo.UserRepo;

import javax.persistence.criteria.CriteriaBuilder;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

public interface UserService  {
    Users createUser(Users users);
    void deleteUser(Integer id);
    Users updateUsers(Integer userss, Users users);
    List<Users> getUsers();
    Users getuserbyid(Integer id);
}
