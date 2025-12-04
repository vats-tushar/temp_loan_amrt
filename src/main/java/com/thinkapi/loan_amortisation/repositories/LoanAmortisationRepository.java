package com.thinkapi.loan_amortisation.repositories;

import com.thinkapi.loan_amortisation.entities.LoanAmortisationEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanAmortisationRepository extends JpaRepository<LoanAmortisationEntities, Long> {}

