package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{

}
