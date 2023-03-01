package com.example.spring_boot_api.service;
import com.example.spring_boot_api.model.Users;
import com.example.spring_boot_api.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public Users createUser(Users users) {
     return this.userRepo.save(users);
    }
    @Override
    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }
    @Override
    public Users updateUsers(Integer userss, Users update) {
        Users users1 = userRepo.findById(userss).get();
        users1.setName(update.getName());
        users1.setAddress(update.getAddress());
        users1.setContact(update.getContact());
        return userRepo.save(users1);
    }
    @Override
    public List<Users> getUsers() {
        return userRepo.findAll();
    }
    @Override
    public Users getuserbyid(Integer id) {
        return userRepo.findById(id).get();
    }
}
