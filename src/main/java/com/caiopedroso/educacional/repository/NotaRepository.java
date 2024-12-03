package com.caiopedroso.educacional.repository;

import com.caiopedroso.educacional.model.Disciplina;
import com.caiopedroso.educacional.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Integer> {
    List<Nota> findByDisciplina(Disciplina disciplina);
}
