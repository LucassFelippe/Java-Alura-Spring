package br.com.alura.exs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FiltraPessoa {

    String nome;
    int idade;

    public FiltraPessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "FiltraPessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {

        List<FiltraPessoa> pessoas = Arrays.asList(
                new FiltraPessoa("Lucas", 24),
                new FiltraPessoa("Fernando", 14),
                new FiltraPessoa("José", 29),
                new FiltraPessoa("Alice", 17)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .sorted()
                .forEach(System.out::println);
    }
}
