package com.caiopedroso.educacional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

public class Turma {
    /*
     * ID (PK, int): Identificador único da turma.
     * ano (int): Ano letivo.
     * semestre (int): Semestre letivo (1 ou 2).
     * curso_id (FK, int): Referência ao curso da turma (relacionamento ManyToOne
     * com Cursos).
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private int ano;

    @Column
    private int semestre;

    @Column
    private int curso_id;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }
}
