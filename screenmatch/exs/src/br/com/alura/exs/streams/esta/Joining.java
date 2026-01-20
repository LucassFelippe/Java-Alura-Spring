package br.com.alura.exs.streams.esta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String resultado = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
