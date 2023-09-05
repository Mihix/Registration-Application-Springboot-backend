package com.springbootacademy3.pointofsale.repositiry;

import com.springbootacademy3.pointofsale.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
