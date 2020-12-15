package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
