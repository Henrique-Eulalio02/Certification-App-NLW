package com.nlw.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Data -> faz os getters e setters de todos os atributos da classe
// AllArgsConstructor -> cria os construtores com os atributos
// NoArgsConstructor -> cria os contrutores vazios
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
  private UUID id;
  private UUID studentID;
  private String technology;
  private int grade;
  private List<AnswersCertificationsEntity> answersCertificationsEntities;
}
