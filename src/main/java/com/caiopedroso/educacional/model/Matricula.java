package com.caiopedroso.educacional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

public class Matricula {

    /*
     * ID (PK, int): Identificador único da matrícula.
     * aluno_id (FK, int): Referência ao aluno matriculado (relacionamento ManyToOne
     * com Alunos).
     * turma_id (FK, int): Referência à turma na qual o aluno está matriculado
     * (relacionamento ManyToOne com Turmas).
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private int aluno_id;

    @Column
    private int turma_id;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public int getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(int turma_id) {
        this.turma_id = turma_id;
    }
}
