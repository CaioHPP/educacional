package com.caiopedroso.educacional.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "alunos")
public class Aluno {
    /* ID (PK, int): Identificador único do aluno.
nome (varchar, 100): Nome completo do aluno.
email (varchar, 100): Email do aluno.
matricula (varchar, 20): Número de matrícula único do aluno.
data_nascimento (date): Data de nascimento do aluno. */

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(length = 100)
    private String nome;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String matricula;

    @Column
    private LocalDate data_nascimento;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}