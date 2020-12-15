package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long>{

}
