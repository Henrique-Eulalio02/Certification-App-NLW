package com.nlw.rocketseat.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.nlw.rocketseat.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

// camada de serviço/regra de negócio
@Service
public class VerifyIfHasCertificationUseCase {
  
  public boolean execute (VerifyHasCertificationDTO dto) {
    if(dto.getEmail().equals("henrique.eulalio3@gmail.com") && dto.getTechnology().equals("java")) {
      return true;
    }

    return false;
  }
}
