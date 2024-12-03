package com.caiopedroso.educacional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

public class Professor {

    /*
     * ID (PK, int): Identificador único do professor.
     * nome (varchar, 100): Nome completo do professor.
     * email (varchar, 100): Email do professor.
     * telefone (varchar, 15): Telefone de contato do professor.
     * especialidade (varchar, 100): Especialidade ou área de atuação.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int ID;

    @Column(length = 100)
    private String nome;

    @Column(length = 100)
    private String email;

    @Column(length = 15)
    private String telefone;

    @Column(length = 100)
    private String especialidade;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
