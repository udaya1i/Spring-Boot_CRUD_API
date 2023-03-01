package com.example.spring_boot_api.repo;
import com.example.spring_boot_api.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
}
