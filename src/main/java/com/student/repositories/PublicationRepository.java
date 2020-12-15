package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entities.Publication;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long>{

}
