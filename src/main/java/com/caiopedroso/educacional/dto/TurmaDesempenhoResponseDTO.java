package com.caiopedroso.educacional.dto;

import com.caiopedroso.educacional.model.Curso;

public record TurmaDesempenhoResponseDTO(Integer ano, Integer semestre, Curso curso, double media_turma,
                                         Integer numero_matriculas) {
}
