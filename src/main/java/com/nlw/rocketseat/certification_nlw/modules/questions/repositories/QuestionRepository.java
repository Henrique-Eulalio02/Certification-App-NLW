package com.nlw.rocketseat.certification_nlw.modules.questions.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlw.rocketseat.certification_nlw.modules.questions.entities.QuestionEntity;

public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID>{
  
  // como technology é um atributo da minha entity QuestionEntity
  // eu não preciso fazer uma query
  List<QuestionEntity> findByTechnology(String techonology);
}
