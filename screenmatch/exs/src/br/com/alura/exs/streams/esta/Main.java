package br.com.alura.exs.streams.esta;

import java.util.*;
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

        Map<String, List<Produto>> produtosCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        Map<String, Long> produtosQuantidades = produtos.stream()
                        .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));

        Map<String, Optional<Produto>> maisCaroPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));

        Map<String, Double> somaPrecoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));

        System.out.println(produtosQuantidades);
        System.out.println(produtosCategoria);
        System.out.println(maisCaroPorCategoria);
        System.out.println(somaPrecoPorCategoria);

    }
}
