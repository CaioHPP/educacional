package com.caiopedroso.educacional.dto;

import com.caiopedroso.educacional.model.Curso;

public record DisciplinaDesempenhoResponseDTO(String nome, String codigo, Curso curso, double media_disciplina,
                                              Integer numero_alunos_avaliados) {
}
