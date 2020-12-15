package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
