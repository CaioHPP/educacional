package com.caiopedroso.educacional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

public class Curso {

    /*
     * ID (PK, int): Identificador único do curso.
     * nome (varchar, 100): Nome do curso.
     * codigo (varchar, 20): Código único do curso.
     * carga_horaria (int): Carga horária total do curso em horas.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(length = 100)
    private String nome;

    @Column(length = 20)
    private String codigo;

    @Column
    private int carga_horaria;

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

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
