package com.caiopedroso.educacional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

public class DIsciplina {
    /*
     * ID (PK, int): Identificador único da disciplina.
     * nome (varchar, 100): Nome da disciplina.
     * codigo (varchar, 20): Código único da disciplina.
     * curso_id (FK, int): Referência ao curso ao qual a disciplina pertence
     * (relacionamento ManyToOne com Cursos).
     * professor_id (FK, int): Professor responsável pela disciplina (relacionamento
     * ManyToOne com Professores).
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(length = 100)
    private String nome;

    @Column(length = 20)
    private String codigo;

    @Column
    private int curso_id;

    @Column
    private int professor_id;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }
}
