package com.caiopedroso.educacional.repository;

import com.caiopedroso.educacional.model.Curso;
import com.caiopedroso.educacional.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
    List<Disciplina> findByCurso(Curso curso);
}
