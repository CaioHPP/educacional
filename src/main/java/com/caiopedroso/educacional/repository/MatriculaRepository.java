package com.caiopedroso.educacional.repository;

import com.caiopedroso.educacional.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}
