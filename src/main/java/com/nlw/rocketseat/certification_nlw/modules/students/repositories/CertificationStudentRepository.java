package com.nlw.rocketseat.certification_nlw.modules.students.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nlw.rocketseat.certification_nlw.modules.students.entities.CertificationStudentEntity;

// extendendo a JPARepository temos acessos a outros métodos já feitos
@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {
  
  @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
  List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);
}
