package br.com.alura.contador.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.File;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;


    public Tarefa() {
    }

    public Tarefa(String pessoaResponsavel, boolean concluida, String descricao) {
        this.pessoaResponsavel = pessoaResponsavel;
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoaResponsavel='" + pessoaResponsavel + '\'' +
                '}';
    }


}
