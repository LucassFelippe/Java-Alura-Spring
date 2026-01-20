package br.com.alura.exs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        // código para filtrar os produtos

        List<Produto> produtosFiltrados = produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000)
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(produtosFiltrados);

    }
}
