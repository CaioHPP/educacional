package com.caiopedroso.educacional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.sql.Date;

public class Nota {
    /*
     * ID (PK, int): Identificador único da nota.
     * matricula_id (FK, int): Referência à matrícula do aluno (relacionamento
     * ManyToOne com Matriculas).
     * disciplina_id (FK, int): Referência à disciplina para a qual a nota foi
     * atribuída (relacionamento ManyToOne com Disciplinas).
     * nota (decimal, 5, 2): Nota obtida pelo aluno na disciplina.
     * data_lancamento (date): Data de lançamento da nota.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private int matricula_id;

    @Column
    private int disciplina_id;

    @Column(precision = 5, scale = 2)
    private double nota;

    @Column
    private java.sql.Date data_lancamento;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(int matricula_id) {
        this.matricula_id = matricula_id;
    }

    public int getDisciplina_id() {
        return disciplina_id;
    }

    public void setDisciplina_id(int disciplina_id) {
        this.disciplina_id = disciplina_id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}
